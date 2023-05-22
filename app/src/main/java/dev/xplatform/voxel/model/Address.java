package dev.xplatform.voxel.model;

import java.util.List;

/**
 * The Address class represents a physical address.
 */
public class Address {
    private List<String> streetLines;
    private String city;
    private String stateOrProvince;
    private String postalCode;
    private String countryCode;

    /**
     * Default constructor for the Address class.
     */
    public Address() {
        // Default constructor is required for Java beans
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
