package com.manu.behavioural.state;

public class FanHIGHState extends State {
    private Fan fan;

    public FanHIGHState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to OFF...");
        fan.setCurrentState(fan.getFanOFFState());
    }

    public String toString() {
        return "Fan is HIGH";
    }
}
