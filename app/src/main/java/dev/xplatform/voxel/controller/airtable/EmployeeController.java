package dev.xplatform.voxel.controller.airtable;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import dev.xplatform.voxel.R;
import dev.xplatform.voxel.model.Employee;
import static dev.xplatform.voxel.controller.airtable.AirtableController.AIRTABLE;

/**
 * The EmployeeController class handles the retrieval and manipulation of employee data.
 * FIXME decide on the way to build out the controller classes and stop refactoring like a noob
 */
public class EmployeeController {

    private static final EmployeeController EMPLOYEE = new EmployeeController();

    private Context context;
    private Employee currentEmployee;
    private List<Employee> employees = new ArrayList<>();


    /**
     * Sets the currently logged-in employee based on the provided email address.
     * This method should be called when the user successfully logs in.
     * TODO cache the employee list so if the user logs out and logs back in without restarting the
     *  application reducing logging in time and extra api calls. Cache will last until the system
     *  time has gone to the next day.
     *
     * @param email The email address of the currently logged-in employee.
     */
    public void initialize(Context context, String email)
    {
        this.context = context;
        currentEmployee = getEmployeeByEmail(email);
        employees = retrieveEmployeesFromAirtable();
    }

    /**
     * Retrieves a list of employees from the Airtable API and creates Employee objects.
     *
     * @return A list of Employee objects retrieved from Airtable.
     */
    private List<Employee> retrieveEmployeesFromAirtable() {
        String employeeTable = context.getString(R.string.employee_table);
        JsonArray records = AIRTABLE.getRecords(employeeTable);

        // Create Employee objects from the JSON data
        List<Employee> employees = new ArrayList<>();
        for (JsonElement recordElement : records) {
            JsonObject fields = AIRTABLE.getFields(recordElement);

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
     * Retrieves an employee by their email address.
     *
     * @param email The email address of the employee to retrieve.
     * @return The Employee object representing the employee with the given email address, or null if not found.
     */
    public static Employee getEmployeeByEmail(String email) {
        for (Employee employee : EMPLOYEE.employees) {
            if (employee.getEmail().equalsIgnoreCase(email)) {
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
    public static Employee getImmediateSupervisor(Employee employee) {
        int supervisorId = employee.getSupervisorId();
        for (Employee emp : EMPLOYEE.employees) {
            if (emp.getEmployeeId() == supervisorId) {
                return emp;
            }
        }
        return null;
    }

    // TODO Other methods related to employee operations can be added here.
}
