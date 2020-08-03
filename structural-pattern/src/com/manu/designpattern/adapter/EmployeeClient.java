package com.manu.designpattern.adapter;

import com.manu.designpattern.adapter.EmployeeLDAP;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();

        Employee employee = new EmployeeDB("1234", "Manoj", "B", "test@123.com");
        employees.add(employee);

        EmployeeLDAP employeeLDAP = new EmployeeLDAP("789", "Manasa", "B", "test122.com");
        employees.add(new EmployeeAdapterLDAP(employeeLDAP));

        EmployeeCSV employeeCSV = new EmployeeCSV("456,Bharathi, B, test@789.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
