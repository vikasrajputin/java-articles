package in.vikasrajput.java.solid.srp.bad;

public class Employee {

    private String fullName;
    private String dateOfJoining;
    private String annualSalaryPackage;
    private String type;

    // standard getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getAnnualSalaryPackage() {
        return annualSalaryPackage;
    }

    public void setAnnualSalaryPackage(String annualSalaryPackage) {
        this.annualSalaryPackage = annualSalaryPackage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Business logic to calculate salary
    public long calculateEmployeeSalary() {
        // Example: Simple salary calculation
        return Long.parseLong(annualSalaryPackage) / 12;
    }

    // Business logic to calculate leaves
    public int calculateEmployeeLeaves() {
        // Example: Leaves calculation based on employee type
        if ("PERMANENT".equals(type)) {
            return 30; // Permanent employees get 30 days of leave
        } else if ("CONTRACT".equals(type)) {
            return 15; // Contract employees get 15 days of leave
        }
        return 0;
    }

    // Business logic to calculate tax
    public double calculateTaxOnSalary() {
        // Example: Simple tax calculation based on a fixed percentage
        return Long.parseLong(annualSalaryPackage) * 0.15; // 15% tax
    }

    // Database persistence logic to save employee
    public void saveEmployee() {
        // Simulate saving employee to a database
        System.out.println("Employee " + fullName + " saved to the database.");
    }

    // Database persistence logic to update employee
    public void updateEmployee() {
        // Simulate updating employee in a database
        System.out.println("Employee " + fullName + " updated in the database.");
    }
}
