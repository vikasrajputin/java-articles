package org.example.sealedclass;

// Sealed class Employee can only be extended by FullTimeEmployee, ContractualEmployee, and Freelancer
public sealed abstract class Employee permits FullTimeEmployee, ContractualEmployee, Freelancer {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Abstract method for calculating yearly bonus (implemented by subclasses)
    public abstract double calculateYearlyBonus();

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
