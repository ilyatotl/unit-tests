package org.example.staff;

public class FinDirector extends Employee {

    private int bonus;

    public FinDirector(String name, String lastName, int salary, int bonus) {
        super(name, lastName, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateSalaryFor(int months) {
        int countOfBonus = months / 3;
        return super.calculateSalaryFor(months) + bonus * getSalary() * countOfBonus / 100;
    }
}
