package in.vikasrajput.java.solid.srp.good;

public class EmployeeService {

    public long calculateSalary(Employee employee) {
        // Example: simple calculation based on a fixed percentage
        return Long.parseLong(employee.getAnnualSalaryPackage()) / 12;
    }

    public int calculateLeaves(Employee employee) {
        // Example: calculating leaves based on employee type
        if ("PERMANENT".equals(employee.getType())) {
            return 30; // Permanent employees get 30 days of leave
        } else if ("CONTRACT".equals(employee.getType())) {
            return 15; // Contract employees get 15 days of leave
        }
        return 0;
    }

    public double calculateTax(Employee employee) {
        // Example: simple tax calculation based on a fixed percentage
        return Long.parseLong(employee.getAnnualSalaryPackage()) * 0.15; // 15% tax
    }
}