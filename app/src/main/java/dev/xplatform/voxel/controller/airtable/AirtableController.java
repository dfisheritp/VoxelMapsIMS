/**

 The AirtableController class is responsible for interacting with the Airtable API to retrieve records.
 It provides methods to initialize the controller, get records from a table, and get fields from a record.
 */
package dev.xplatform.voxel.controller.airtable;

import android.content.Context;
import android.net.Uri;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import dev.xplatform.voxel.R;

public class AirtableController {

    private static final String BEARER_PREFIX = "Bearer ";
    private Context context;
    private String apiKey;
    private String endPoint;
    private OkHttpClient httpClient;
    private Gson gson;

    static final AirtableController AIRTABLE = new AirtableController();

    /**
     * Initializes the AirtableController with the provided context.
     * This method should be called before using any other methods of the controller.
     *
     * @param context The context used to retrieve the API key and endpoint from resources.
     */
    public void initialize(Context context) {
        this.context = context;
        this.apiKey = context.getString(R.string.airtable_apikey);
        this.endPoint = context.getString(R.string.airtable_endpoint);
        this.httpClient = new OkHttpClient();
        this.gson = new Gson();
    }

    /**
     * Retrieves records from the specified table in Airtable.
     *
     * @param table The name of the table to retrieve records from.
     * @return A JsonArray containing the retrieved records.
     */
    public JsonArray getRecords(String table) {
        String url = endPoint + "/" + table;
        return getRecordsHelper(url);
    }

    /**
     * Retrieves records from the specified table in Airtable, filtered by a formula query.
     *
     * @param table                The name of the table to retrieve records from.
     * @param filterByFormulaQuery The formula query used to filter the records.
     * @return A JsonArray containing the retrieved records.
     */
    public JsonArray getRecords(String table, String filterByFormulaQuery) {
        String url = endPoint + "/" + table + "?filterByFormula=" + Uri.encode(filterByFormulaQuery);
        return getRecordsHelper(url);
    }

    private JsonArray getRecordsHelper(String url) {
        String jsonResponse = makeApiRequest(url);
        JsonObject responseJson = gson.fromJson(jsonResponse, JsonObject.class);
        JsonArray records = responseJson.getAsJsonArray("records");
        return records;
    }

    /**
     * Makes an API request to the specified URL and retrieves the JSON response.
     * If an IOException occurs during the request, an empty JSON object will be returned as the default value.
     *
     * @param url The URL to make the API request to.
     * @return The JSON response as a string, or an empty JSON object if an IOException occurs.
     */
    private String makeApiRequest(String url) {
        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", BEARER_PREFIX + apiKey)
                .build();
        Response response = null;
        String jsonResponse = "";
        try {
            response = httpClient.newCall(request).execute();
            jsonResponse = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            jsonResponse = "{}";    // Return an empty JSON object as the default value
        }
        return jsonResponse;
    }

    /**
     * Extracts and returns the fields object from a given JsonElement representing a record.
     *
     * @param element The JsonElement representing a record.
     * @return The JsonObject representing the fields of the record.
     */
    public JsonObject getFields(JsonElement element) {
        JsonObject record = element.getAsJsonObject();
        return record.getAsJsonObject("fields");
    }
}