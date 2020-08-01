package com.manu.designpattern.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if(instance != null)
            throw new RuntimeException("Please use getInstance() method to create a new instance");
    }

    public static DbSingleton getInstance() {
        if(instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null)
                    instance = new DbSingleton();
            }
        }
        return instance;
    }
}
