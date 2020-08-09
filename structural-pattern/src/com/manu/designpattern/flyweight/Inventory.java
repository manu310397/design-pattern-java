package com.manu.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final Catalog catalog;
    private final List<Order> orders;

    public Inventory() {
        this.catalog = new Catalog();
        this.orders = new ArrayList<>();
    }

    void placeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookUp(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        orders.forEach(order -> {
            order.processOrder();
        });

        orders.clear();
    }

    String report() {
        return "\nTotal Items object made: "+catalog.totalItems();
    }
}
