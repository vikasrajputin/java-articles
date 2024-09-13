package org.example.sealedclass;

public non-sealed class ContractualEmployee extends Employee {
    private final int completedContracts;

    public ContractualEmployee(String name, double salary, int completedContracts) {
        super(name, salary);
        this.completedContracts = completedContracts;
    }

    @Override
    public double calculateYearlyBonus() {
        // Contractual employees get $500 bonus for each completed contract
        return completedContracts * 500;
    }

    @Override
    public String toString() {
        return "ContractualEmployee{name='" + getName() + "', salary=" + getSalary() + ", completedContracts=" + completedContracts + "}";
    }
}
