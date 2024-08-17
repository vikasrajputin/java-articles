package in.vikasrajput.java.solid.srp.good;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDAO {

    private Map<String, Employee> employeeDB = new HashMap<>();

    public Employee saveEmployee(Employee employee) {
        // Simulate saving employee to a database (in-memory map)
        employeeDB.put(employee.getFullName(), employee);
        System.out.println("Employee saved: " + employee.getFullName());
        return employee;
    }

    public Employee updateEmployee(Employee employee) {
        // Simulate updating employee in a database (in-memory map)
        employeeDB.put(employee.getFullName(), employee);
        System.out.println("Employee updated: " + employee.getFullName());
        return employee;
    }
}