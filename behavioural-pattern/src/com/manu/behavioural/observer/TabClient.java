package com.manu.behavioural.observer;

public class TabClient extends Observer {
    public TabClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message +" - Sent from Tab Client");
    }

    @Override
    void update() {
        System.out.println("Tab Stream "+ subject.getState());
    }
}
