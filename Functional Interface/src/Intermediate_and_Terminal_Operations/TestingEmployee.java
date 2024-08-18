package Intermediate_and_Terminal_Operations;

import java.util.Comparator;
import java.util.List;

public class TestingEmployee {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Vinay", 450000),
                new Employee("Ashhad", 400000),
                new Employee("Kunal", 350000),
                new Employee("Mahesh", 300000),
                new Employee("Devanshu", 500000)
        );

        employees.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
