package org.example.sealedclass;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Alice", 50000, 5000);
        Employee contractualEmployee = new ContractualEmployee("Bob", 30000, 10); // 10 completed contracts
        Employee freelancer = new Freelancer("Charlie", 60000); // total earnings

        System.out.println(fullTimeEmployee.getName() + "'s yearly bonus: $" + fullTimeEmployee.calculateYearlyBonus());
        System.out.println(contractualEmployee.getName() + "'s yearly bonus: $" + contractualEmployee.calculateYearlyBonus());
        System.out.println(freelancer.getName() + "'s yearly bonus: $" + freelancer.calculateYearlyBonus());
    }
}
