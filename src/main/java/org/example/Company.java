package org.example;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Department> departments;

    public Company(String name, ArrayList<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public int calculateSalary(int months) {
        int res = 0;
        for (Department d : departments) {
            res += d.calculateSalary(months);
        }
        return res;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
