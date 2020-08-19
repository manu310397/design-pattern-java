package com.manu.behavioural.memento;

//originator
public class Employee {
    private String name;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(this.name, this.phone);
    }

    public void revert(EmployeeMemento memento) {
        this.name = memento.getName();
        this.phone = memento.getPhone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
