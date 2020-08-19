package com.manu.behavioural.state;

public class FanMEDState extends State {
    private Fan fan;

    public FanMEDState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to HIGH...");
        fan.setCurrentState(fan.getFanHIGHState());
    }

    public String toString() {
        return "Fan is MED";
    }
}
