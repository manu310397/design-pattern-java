package com.manu.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> itemMap = new HashMap<>();

    public Registry() {
       loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try{
            item = (Item)(itemMap.get(type)).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("movie");
        movie.setPrice(125D);
        movie.setRunTime("1:30 hours");
        itemMap.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Book");
        book.setPrice(250D);
        book.setNumberOfPages(450);
        itemMap.put("Book", book);
    }
}
