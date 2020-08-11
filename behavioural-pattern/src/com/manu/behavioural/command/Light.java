package com.manu.behavioural.command;

//receiver
public class Light {
    private boolean isOn = false;

    public void toggle() {
        if(isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn=true;
        }
    }

    private void on() {
        System.out.println("Light turned on");
    }

    private void off() {
        System.out.println("Light turned off");
    }
}
