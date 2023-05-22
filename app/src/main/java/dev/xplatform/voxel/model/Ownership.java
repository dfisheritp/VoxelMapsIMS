package dev.xplatform.voxel.model;

/**
 * The Ownership class represents the ownership information of an item.
 * It contains details such as the serial number, employee ID, previous employee ID,
 * last shipment date, and last received date.
 */
public class Ownership {
    private String serialNumber;
    private String employeeId;
    private String previousEmployeeId;
    private String lastShipped;
    private String lastReceived;

    /**
     * Constructs a new Ownership object.
     * The default constructor is required for Java beans.
     */
    public Ownership() {
    }

    /**
     * Retrieves the serial number of the item.
     *
     * @return The serial number.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number of the item.
     *
     * @param serialNumber The serial number to set.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Retrieves the employee ID of the current owner.
     *
     * @return The employee ID.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID of the current owner.
     *
     * @param employeeId The employee ID to set.
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Retrieves the previous employee ID of the item.
     *
     * @return The previous employee ID.
     */
    public String getPreviousEmployeeId() {
        return previousEmployeeId;
    }

    /**
     * Sets the previous employee ID of the item.
     *
     * @param previousEmployeeId The previous employee ID to set.
     */
    public void setPreviousEmployeeId(String previousEmployeeId) {
        this.previousEmployeeId = previousEmployeeId;
    }

    /**
     * Retrieves the last shipment date of the item.
     *
     * @return The last shipment date.
     */
    public String getLastShipped() {
        return lastShipped;
    }

    /**
     * Sets the last shipment date of the item.
     *
     * @param lastShipped The last shipment date to set.
     */
    public void setLastShipped(String lastShipped) {
        this.lastShipped = lastShipped;
    }

    /**
     * Retrieves the last received date of the item.
     *
     * @return The last received date.
     */
    public String getLastReceived() {
        return lastReceived;
    }

    /**
     * Sets the last received date of the item.
     *
     * @param lastReceived The last received date to set.
     */
    public void setLastReceived(String lastReceived) {
        this.lastReceived = lastReceived;
    }
}
