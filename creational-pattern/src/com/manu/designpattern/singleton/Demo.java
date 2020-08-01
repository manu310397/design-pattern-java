package com.manu.designpattern.singleton;

public class Demo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance1 = DbSingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
    }
}
