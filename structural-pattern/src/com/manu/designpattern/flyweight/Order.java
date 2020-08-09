package com.manu.designpattern.flyweight;

public class Order {
    private final int ordereNumber;
    private final Item item;

    public Order(int ordereNumber, Item item) {
        this.ordereNumber = ordereNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering "+item+" for order number "+ordereNumber);
    }
}
