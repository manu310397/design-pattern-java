package com.manu.designpattern.adapter;

import com.manu.designpattern.adapter.Employee;
import com.manu.designpattern.adapter.EmployeeClient;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = new EmployeeClient().getEmployeesList();

        System.out.println(employees);
    }
}
