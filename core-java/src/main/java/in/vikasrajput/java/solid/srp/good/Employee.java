package in.vikasrajput.java.solid.srp.good;

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
}