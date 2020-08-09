package com.manu.designpattern.flyweight;

public class Demo {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.placeOrder("Watch", 111);
        inventory.placeOrder("Belt", 112);
        inventory.placeOrder("Mobile", 113);
        inventory.placeOrder("Watch", 114);
        inventory.placeOrder("Mask", 115);
        inventory.placeOrder("Ear Ring", 116);
        inventory.placeOrder("Watch", 117);
        inventory.placeOrder("Charger", 118);
        inventory.placeOrder("Watch", 119);

        inventory.process();

        System.out.println(inventory.report());
    }
}
