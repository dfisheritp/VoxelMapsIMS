package dev.xplatform.voxel.model.shipping;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * The Address class represents a physical address.
 */
public class Address {
    private List<String> streetLines;
    private String city;
    private String stateOrProvince;
    private PostalCode postalCode;

    /**
     * Default constructor for the Address class.
     */
    protected Address() {
        // Default constructor is required for Java beans
    }

    public Address(String[] streetLines, String city, String stateOrProvince, PostalCode postalCode)
    {
        this.streetLines = Arrays.asList(streetLines);
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
    }

    public Address(String[] streetLines, String city, String stateOrProvince, Locale locale)
    {
        this.streetLines = Arrays.asList(streetLines);
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = new PostalCode(locale);
    }

    public Address(String[] streetLines, String city, String stateOrProvince, String postalCode, String country)
    {
        this.streetLines = Arrays.asList(streetLines);
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = new PostalCode(postalCode, );
    }

    /**
     * Returns the list of street lines of the address.
     *
     * @return The list of street lines.
     */
    public List<String> getStreetLines() {
        return streetLines;
    }

    /**
     * Sets the list of street lines of the address.
     *
     * @param streetLines The list of street lines to set.
     */
    public void setStreetLines(List<String> streetLines) {
        this.streetLines = streetLines;
    }

    /**
     * Returns the city of the address.
     *
     * @return The city of the address.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the address.
     *
     * @param city The city to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the state or province of the address.
     *
     * @return The state or province of the address.
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the state or province of the address.
     *
     * @param stateOrProvince The state or province to set.
     */
    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * Returns the postal code of the address.
     *
     * @return The postal code of the address.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code of the address.
     *
     * @param postalCode The postal code to set.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Returns the country code of the address.
     *
     * @return The country code of the address.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the country code of the address.
     *
     * @param countryCode The country code to set.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
