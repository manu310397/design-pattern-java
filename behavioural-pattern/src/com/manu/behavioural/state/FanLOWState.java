package com.manu.behavioural.state;

public class FanLOWState extends State {
    private Fan fan;

    public FanLOWState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to Med...");
        fan.setCurrentState(fan.getFanMEDState());
    }

    public String toString() {
        return "Fan is LOW";
    }
}
