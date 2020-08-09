package com.manu.designpattern.decorator;

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "bread ";
    }
}
