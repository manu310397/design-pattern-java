package com.manu.behavioural.observer;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
