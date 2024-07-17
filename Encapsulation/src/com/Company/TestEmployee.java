package com.Company;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Vinay",20,20000);
        System.out.println(emp.getEmployeeDetails());
        emp.setAge(21);
        emp.setName("Vinay Bagde");
        System.out.println(emp.getEmployeeDetails());
    }
}
