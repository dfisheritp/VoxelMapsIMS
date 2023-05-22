package dev.xplatform.voxel.model;

/**
 * The Product class represents a product item.
 * It contains details such as the product ID, manufacturer, product name,
 * product number, weight, value, and battery type.
 */
public class Product {
    private String productId;
    private String manufacturer;
    private String productName;
    private String productNumber;
    private float weight;
    private int value;
    private Battery batteryType;

    /**
     * Constructs a new Product object.
     * The default constructor is required for Java beans.
     */
    public Product() {
    }

    /**
     * Retrieves the product ID.
     *
     * @return The product ID.
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the product ID.
     *
     * @param productId The product ID to set.
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Retrieves the manufacturer of the product.
     *
     * @return The manufacturer.
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer of the product.
     *
     * @param manufacturer The manufacturer to set.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return The product name.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the name of the product.
     *
     * @param productName The product name to set.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Retrieves the product number.
     *
     * @return The product number.
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * Sets the product number.
     *
     * @param productNumber The product number to set.
     */
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * Retrieves the weight of the product.
     *
     * @return The weight.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the product.
     *
     * @param weight The weight to set.
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Retrieves the value of the product.
     *
     * @return The value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the product.
     *
     * @param value The value to set.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Retrieves the battery type of the product.
     *
     * @return The battery type.
     */
    public Battery getBatteryType() {
        return batteryType;
    }

    /**
     * Sets the battery type of the product.
     *
     * @param batteryType The battery type to set.
     */
    public void setBatteryType(Battery batteryType) {
        this.batteryType = batteryType;
    }
}
