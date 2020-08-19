package com.manu.behavioural.memento;

import java.util.ArrayList;
import java.util.Stack;

public class Caretaker {
    private Stack<EmployeeMemento> hostory = new Stack<>();

    public void save(Employee employee) {
        hostory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(hostory.pop());
    }
}
