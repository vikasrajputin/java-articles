package org.example.sealedclass;

public final class Freelancer extends Employee {
    private final double totalEarnings;

    public Freelancer(String name, double totalEarnings) {
        super(name, totalEarnings);
        this.totalEarnings = totalEarnings;
    }

    @Override
    public double calculateYearlyBonus() {
        // Freelancers get 10% of their total earnings as a bonus
        return totalEarnings * 0.10;
    }

    @Override
    public String toString() {
        return "Freelancer{name='" + getName() + "', totalEarnings=" + totalEarnings + "}";
    }
}
