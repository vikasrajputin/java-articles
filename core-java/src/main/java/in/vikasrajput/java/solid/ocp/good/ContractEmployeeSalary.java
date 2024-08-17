package in.vikasrajput.java.solid.ocp.good;

public class ContractEmployeeSalary implements EmployeeSalary {

    private final long basicPay = 40000;
    private final int totalWorkingDay = 22;

    @Override
    public Long calculateSalary() {
        // Salary calculation for contract employees
        return totalWorkingDay * basicPay;
    }
}
