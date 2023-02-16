package org.example;

import org.example.staff.Employee;
import java.util.ArrayList;

public class Department {

    private String name;
    private ArrayList<Employee> employees;

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public int calculateSalary(int months) {
        int res = 0;
        for (Employee e : employees) {
            res += e.calculateSalaryFor(months);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
