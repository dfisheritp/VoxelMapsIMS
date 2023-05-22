package dev.xplatform.voxel.controller.airtable;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import android.content.Context;

import dev.xplatform.voxel.R;
import dev.xplatform.voxel.model.Employee;

import java.util.ArrayList;
import java.util.List;


/**
 * The EmployeeController class handles the retrieval and manipulation of employee data.
 */
public class EmployeeController
{

    private static List<Employee> employeeList = new ArrayList<>();
    private static Context context;
    private static Employee currentEmployee;

    public static void setContext(Context appContext)
    {
        context = appContext;
    }

    /**
     * Sets the currently logged-in employee based on the provided email address.
     * This method should be called when the user successfully logs in.
     *
     * @param email The email address of the currently logged-in employee.
     */
    public static void setCurrentEmployee(String email) {
        currentEmployee = getEmployeeByEmail(email);
    }

    /**
     * Retrieves a list of employees from the Airtable API and creates Employee objects.
     *
     * @param context    The context object to access resources.
     * @return A list of Employee objects retrieved from Airtable.
     */
    public static List<Employee> retrieveEmployeesFromAirtable(Context context)
    {
        String airtableEndpoint = context.getString(R.string.airtable_endpoint);
        String airtableApiKey = context.getString(R.string.airtable_apikey);
        String employeeTable = context.getString(R.string.employee_table);

        String apiUrl = airtableEndpoint + "/" + employeeTable;

        // Make the API request
        String jsonResponse = makeApiRequest(apiUrl, airtableApiKey);

        // Parse the JSON response
        Gson gson = new Gson();
        JsonObject responseJson = gson.fromJson(jsonResponse, JsonObject.class);
        JsonArray records = responseJson.getAsJsonArray("records");

        // Create Employee objects from the JSON data
        List<Employee> employees = new ArrayList<>();
        for (JsonElement recordElement : records)
        {
            JsonObject record = recordElement.getAsJsonObject();
            JsonObject fields = record.getAsJsonObject("fields");

            // Extract the relevant data from the fields object
            String email = fields.get(context.getString(R.string.employee_table_email_column)).getAsString();
            int employeeId = fields.get(context.getString(R.string.employee_table_employeeId_column)).getAsInt();
            String preferredName = fields.get(context.getString(R.string.employee_table_preferredName_column)).getAsString();
            int supervisorId = fields.get(context.getString(R.string.employee_table_supervisorId_column)).getAsInt();
            String teamId = fields.get(context.getString(R.string.employee_table_teamId_column)).getAsString();

            // Create the Employee object
            Employee employee = new Employee(email, employeeId, preferredName, supervisorId, teamId);

            // Add the Employee object to the list
            employees.add(employee);
        }

        return employees;
    }

    /**
     * Makes an API request to the specified URL with the provided authorization token.
     *
     * @param apiUrl     The URL of the API endpoint.
     * @param authToken  The authorization token for the API.
     * @return The JSON response as a string.
     */
    private static String makeApiRequest(String apiUrl, String authToken) {
        // Implement the logic to make the API request here
        // You can use libraries like OkHttp or HttpURLConnection to make the HTTP request

        // Example using cURL command
        // String command = "curl -H \"Authorization: Bearer " + authToken + "\" " + apiUrl;
        // ... execute the command and get the response

        return ""; // Replace with the actual API request and response handling logic
    }

    /**
     * Retrieves an employee by their email address.
     *
     * @param email The email address of the employee to retrieve.
     * @return The Employee object representing the employee with the given email address, or null if not found.
     */
    public static Employee getEmployeeByEmail(String email)
    {
        for (Employee employee : employeeList)
        {
            if (employee.getEmail().equalsIgnoreCase(email))
            {
                return employee;
            }
        }
        return null;
    }

    /**
     * Retrieves the immediate supervisor of an employee.
     *
     * @param employee The Employee object representing the employee.
     * @return The Employee object representing the immediate supervisor, or null if not found.
     */
    public static Employee getImmediateSupervisor(Employee employee)
    {
        int supervisorId = employee.getSupervisorId();
        for (Employee emp : employeeList)
        {
            if (emp.getEmployeeId() == supervisorId)
            {
                return emp;
            }
        }
        return null;
    }

    // TODO Other methods related to employee operations can be added here.
}