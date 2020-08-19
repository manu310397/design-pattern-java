package com.manu.behavioural.observer;

public class PhoneClient extends Observer {
    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message +" - Sent from Phone Client");
    }

    @Override
    void update() {
        System.out.println("Phone Stream "+ subject.getState());
    }
}
