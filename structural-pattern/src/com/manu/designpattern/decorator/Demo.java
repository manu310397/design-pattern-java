package com.manu.designpattern.decorator;

public class Demo {
    public static void main(String[] args) {
        Sandwich meatSandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println("Take sandwich "+meatSandwich.make());
    }
}
