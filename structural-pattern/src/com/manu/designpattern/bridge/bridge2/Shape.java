package com.manu.designpattern.bridge.bridge2;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
