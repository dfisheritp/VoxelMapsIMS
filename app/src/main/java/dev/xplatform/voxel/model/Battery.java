package dev.xplatform.voxel.model;

/**
 * The Battery class represents a battery used in a device.
 */
public class Battery {
    /**
     * The BatteryType enum represents different types of batteries.
     */
    public enum BatteryType {
        /**
         * Battery type 3480.
         * This type of battery is classified as IATA UN3480, which corresponds to Lithium Ion batteries.
         * It is commonly used in various electronic devices such as smartphones, laptops, and tablets.
         */
        TYPE_3480,

        /**
         * Battery type 3481.
         * This type of battery is classified as IATA UN3481, which corresponds to Lithium Ion batteries contained in equipment.
         * It refers to Lithium Ion batteries that are integrated or built-in as part of a device or equipment.
         * Examples include batteries embedded in cameras, medical devices, or electric vehicles.
         */
        TYPE_3481
    }

    private BatteryType type;
    private int cellCapacity;
    private int numberOfCells;
    private int totalCapacity;
    private int currentCharge;

    /**
     * Default constructor for the Battery class.
     */
    public Battery() {
        // Default constructor is required for Java beans
    }

    /**
     * Returns the type of the battery.
     *
     * @return The type of the battery.
     */
    public BatteryType getType() {
        return type;
    }

    /**
     * Sets the type of the battery.
     *
     * @param type The type of the battery to set.
     */
    public void setType(BatteryType type) {
        this.type = type;
    }

    /**
     * Returns the capacity of a single cell in the battery.
     *
     * @return The capacity of a single cell.
     */
    public int getCellCapacity() {
        return cellCapacity;
    }

    /**
     * Sets the capacity of a single cell in the battery.
     *
     * @param cellCapacity The capacity of a single cell to set.
     */
    public void setCellCapacity(int cellCapacity) {
        this.cellCapacity = cellCapacity;
    }

    /**
     * Returns the number of cells in the battery.
     *
     * @return The number of cells in the battery.
     */
    public int getNumberOfCells() {
        return numberOfCells;
    }

    /**
     * Sets the number of cells in the battery.
     *
     * @param numberOfCells The number of cells to set.
     */
    public void setNumberOfCells(int numberOfCells) {
        this.numberOfCells = numberOfCells;
    }

    /**
     * Returns the total capacity of the battery.
     *
     * @return The total capacity of the battery.
     */
    public int getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the total capacity of the battery.
     *
     * @param totalCapacity The total capacity of the battery to set.
     */
    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    /**
     * Returns the current charge of the battery.
     *
     * @return The current charge of the battery.
     */
    public int getCurrentCharge() {
        return currentCharge;
    }

    /**
     * Sets the current charge of the battery.
     *
     * @param currentCharge The current charge of the battery to set.
     */
    public void setCurrentCharge(int currentCharge) {
        this.currentCharge = currentCharge;
    }


}
