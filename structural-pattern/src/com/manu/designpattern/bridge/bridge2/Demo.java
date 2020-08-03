package com.manu.designpattern.bridge.bridge2;

//With Bridge pattern
public class Demo {
    public static void main(String[] args) {
        Color red = new Red();
        Color green = new Green();

        Shape redCircle = new Circle(red);
        Shape greenCircle = new Circle(green);

        Shape redSquare = new Square(red);

        redCircle.applyColor();
        greenCircle.applyColor();
        redSquare.applyColor();
    }
}
