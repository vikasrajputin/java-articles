package in.vikasrajput.java.solid.ocp.bad;

public class EmployeeSalary {

    private final long basicPay = 50000;
    private final int totalWorkingDay = 22;
    private final long companyBenefits = 5000;
    private final long bonus = 10000;

    public Long calculateSalary(Employee emp) {
        Long salary = null;

        if ("PERMANENT".equals(emp.getType())) {
            // Salary calculation for permanent employees
            salary = (totalWorkingDay * basicPay) + companyBenefits + bonus; // Working days * basic pay + benefits + bonus
        } else if ("CONTRACT".equals(emp.getType())) {
            // Salary calculation for contract employees
            salary = (totalWorkingDay * basicPay); // Working days * basic pay
        }

        return salary;
    }
}
