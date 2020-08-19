package com.manu.behavioural.memento;

public class Demo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();
        employee.setName("Manoj B");
        employee.setPhone("7276234147");
        employee.setAddress("N/502, Bhumi Acropolis");

        System.out.println("Employee Before Save  :: "+employee);

        caretaker.save(employee);

        employee.setPhone("1234567890");

        caretaker.save(employee);

        System.out.println("Employee after changing Phone number  :: "+employee);

        employee.setPhone("9874563210");

        caretaker.revert(employee);

        System.out.println("Employee Reverses to the last point  :: "+employee);

        caretaker.revert(employee);

        System.out.println("Employee to original state  :: "+employee);
    }
}
