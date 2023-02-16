import org.example.Company;
import org.example.Department;
import org.example.staff.Employee;
import org.example.staff.FinDirector;
import org.example.staff.Programmer;
import org.example.staff.Tester;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {
    static Company company;
    static List<Integer> months;
    static List<Integer> companyAns;

    @BeforeAll
    public static void setUp() {
        Employee programmer = new Programmer("John", "Johnes", 50000);
        Employee tester = new Tester("Jack", "Daniels", 30000);

        Employee finDirector = new FinDirector("Boris", "Petrovich", 65000, 20);

        ArrayList<Employee> itEmployees = new ArrayList<>();
        itEmployees.add(programmer);
        itEmployees.add(tester);

        ArrayList<Employee> finEmployees = new ArrayList<>();
        finEmployees.add(finDirector);

        Department itDepartment = new Department("IT", itEmployees);
        Department finDepartment = new Department("Finance", finEmployees);

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(itDepartment);
        departments.add(finDepartment);

        company = new Company("HSE", departments);

        months = Arrays.asList(1, 5, 10);
        companyAns = Arrays.asList(145000, 738000, 1489000);
    }

    @Test
    public void testCalculateSalary() {
        for (int i = 0; i < months.size(); ++i) {
            int val = companyAns.get(i);
            assertEquals(val, company.calculateSalary(months.get(i)));
        }
    }
}
