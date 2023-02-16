import org.example.staff.FinDirector;
import org.example.staff.Programmer;
import org.example.staff.Tester;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffSalaryTest {

    static FinDirector finDirector;
    static Programmer programmer;
    static Tester tester;

    static List<Integer> months;
    static List<Integer> finAns, programmerAns, testerAns;

    @BeforeAll
    public static void setUp() {
        finDirector = new FinDirector("Ivan", "Ivanov", 150000, 50);
        programmer = new Programmer("Petr", "Petrov", 100000);
        tester = new Tester("Alexander", "Alexanderov", 80000);

        months = Arrays.asList(1, 5, 10);
        finAns = Arrays.asList(150000, 825000, 1725000);
        programmerAns = Arrays.asList(100000, 500000, 1000000);
        testerAns = Arrays.asList(80000, 400000, 800000);
    }

    @Test
    public void finDirectorSalary() {
        for (int i = 0; i < months.size(); ++i) {
            int val = finAns.get(i);
            assertEquals(val, finDirector.calculateSalaryFor(months.get(i)));
        }
    }

    @Test
    public void programmerSalary() {
        for (int i = 0; i < months.size(); ++i) {
            int val = programmerAns.get(i);
            assertEquals(val, programmer.calculateSalaryFor(months.get(i)));
        }
    }

    @Test
    public void testerSalary() {
        for (int i = 0; i < months.size(); ++i) {
            int val = testerAns.get(i);
            assertEquals(val, tester.calculateSalaryFor(months.get(i)));
        }
    }
}
