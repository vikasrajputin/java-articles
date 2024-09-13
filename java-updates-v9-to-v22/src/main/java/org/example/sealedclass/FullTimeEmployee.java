package org.example.sealedclass;

public final class FullTimeEmployee extends Employee {
    private final double yearlyBonus;

    public FullTimeEmployee(String name, double salary, double yearlyBonus) {
        super(name, salary);
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public double calculateYearlyBonus() {
        return yearlyBonus;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{name='" + getName() + "', salary=" + getSalary() + ", yearlyBonus=" + yearlyBonus + "}";
    }
}
