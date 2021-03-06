package com.manu.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Item> items = new HashMap<>();

    public Item lookUp(String itemName) {
        if(!items.containsKey(itemName)) items.put(itemName, new Item(itemName));
        return items.get(itemName);
    }

    public int totalItems() {return items.size();}
}
