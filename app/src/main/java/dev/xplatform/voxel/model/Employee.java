package dev.xplatform.voxel.model;

/**
 * Employee class represents an employee in the system.
 */
public class Employee {
    private String email;
    private int employeeId;
    private String preferredName;
    private int supervisorId;
    private String teamId;

    /**
     * Default constructor for the Employee class.
     */
    Employee() {
        // Default constructor is required for Java beans
    }

    /**
     * Constructor for the Employee class.
     *
     * @param email              The email of the employee.
     * @param employeeId         The ID of the employee.
     * @param preferredName      The preferred name of the employee.
     * @param immediateSupervisor The immediate supervisor of the employee.
     * @param teamId             The team ID of the employee.
     */
    public Employee(String email, int employeeId, String preferredName, int immediateSupervisor, String teamId) {
        this.email = email;
        this.employeeId = employeeId;
        this.preferredName = preferredName;
        this.supervisorId = immediateSupervisor;
        this.teamId = teamId;
    }

    /**
     * Get the email of the employee.
     *
     * @return The email of the employee.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email of the employee.
     *
     * @param email The email of the employee.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the employee ID.
     *
     * @return The employee ID.
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Set the employee ID.
     *
     * @param employeeId The employee ID.
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Get the preferred name of the employee.
     *
     * @return The preferred name of the employee.
     */
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * Set the preferred name of the employee.
     *
     * @param preferredName The preferred name of the employee.
     */
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    /**
     * Get the immediate supervisor of the employee.
     *
     * @return The immediate supervisor's id of the employee.
     */
    public int getSupervisorId() {
        return supervisorId;
    }

    /**
     * Set the immediate supervisor of the employee.
     *
     * @param supervisorId The immediate supervisor of the employee.
     */
    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    /**
     * Get the team ID of the employee.
     *
     * @return The team ID of the employee.
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Set the team ID of the employee.
     *
     * @param teamId The team ID of the employee.
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
