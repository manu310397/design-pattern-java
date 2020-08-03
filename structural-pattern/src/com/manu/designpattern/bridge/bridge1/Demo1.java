package com.manu.designpattern.bridge.bridge1;

//Without bridge pattern
public class Demo1 {
    public static void main(String[] args) {
        Circle redCircle = new RedCircle();
        Square blueSquare = new BlueSquare();
        Square greenSquare = new GreenSquare();

        redCircle.applyColor();
        blueSquare.applyColor();
        greenSquare.applyColor();
    }
}
