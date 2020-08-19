package com.manu.behavioural.state;

public class FanOFFState extends State {
    private Fan fan;

    public FanOFFState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to Low...");
        fan.setCurrentState(fan.getFanLOWState());
    }

    public String toString() {
        return "Fan is OFF";
    }
}
