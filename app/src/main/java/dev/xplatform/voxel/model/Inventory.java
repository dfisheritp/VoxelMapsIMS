package dev.xplatform.voxel.model;

/**
 * The Inventory class represents an item in the inventory.
 * It contains details such as the serial number, associated product, picture, and notes.
 */
public class Inventory {
    private String serialNumber;
    private Product product;
    private String picture;
    private String notes;

    /**
     * Constructs a new Inventory object.
     * The default constructor is required for Java beans.
     */
    public Inventory() {
    }

    /**
     * Retrieves the serial number of the inventory item.
     *
     * @return The serial number.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number of the inventory item.
     *
     * @param serialNumber The serial number to set.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Retrieves the associated product of the inventory item.
     *
     * @return The associated product.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the associated product of the inventory item.
     *
     * @param product The associated product to set.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Retrieves the picture of the inventory item.
     *
     * @return The picture.
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the picture of the inventory item.
     *
     * @param picture The picture to set.
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * Retrieves the notes of the inventory item.
     *
     * @return The notes.
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the notes of the inventory item.
     *
     * @param notes The notes to set.
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
