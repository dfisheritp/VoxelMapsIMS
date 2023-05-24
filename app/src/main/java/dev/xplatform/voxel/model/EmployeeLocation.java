package dev.xplatform.voxel.model;

import java.time.LocalDate;

import dev.xplatform.voxel.model.shipping.Address;

/**
 * The EmployeeLocation class represents the location information of an employee.
 * It contains details such as the employee's ID, current address, departure date,
 * next address, and arrival date.
 */
public class EmployeeLocation {
    private String employeeId;
    private Address currentAddress;
    private LocalDate departureDate;
    private Address nextAddress;
    private LocalDate arrivalDate;

    /**
     * Constructs a new EmployeeLocation object.
     * The default constructor is required for Java beans.
     */
    public EmployeeLocation() {
    }

    /**
     * Retrieves the employee ID.
     *
     * @return The employee ID.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID.
     *
     * @param employeeId The employee ID to set.
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Retrieves the current address of the employee.
     *
     * @return The current address.
     */
    public Address getCurrentAddress() {
        return currentAddress;
    }

    /**
     * Sets the current address of the employee.
     *
     * @param currentAddress The current address to set.
     */
    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    /**
     * Retrieves the departure date of the employee.
     *
     * @return The departure date.
     */
    public LocalDate getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the departure date of the employee.
     *
     * @param departureDate The departure date to set.
     */
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * Retrieves the next address of the employee.
     *
     * @return The next address.
     */
    public Address getNextAddress() {
        return nextAddress;
    }

    /**
     * Sets the next address of the employee.
     *
     * @param nextAddress The next address to set.
     */
    public void setNextAddress(Address nextAddress) {
        this.nextAddress = nextAddress;
    }

    /**
     * Retrieves the arrival date of the employee.
     *
     * @return The arrival date.
     */
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the arrival date of the employee.
     *
     * @param arrivalDate The arrival date to set.
     */
    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
