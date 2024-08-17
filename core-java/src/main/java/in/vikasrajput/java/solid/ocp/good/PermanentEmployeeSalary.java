package in.vikasrajput.java.solid.ocp.good;

public class PermanentEmployeeSalary implements EmployeeSalary {

    private final long basicPay = 50000;
    private final int totalWorkingDay = 22;
    private final long companyBenefits = 5000;
    private final long bonus = 10000;

    @Override
    public Long calculateSalary() {
        // Salary calculation for permanent employees
        return (totalWorkingDay * basicPay) + companyBenefits + bonus;
    }
}
