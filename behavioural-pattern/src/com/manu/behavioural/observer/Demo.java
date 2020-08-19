package com.manu.behavioural.observer;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient= new PhoneClient(subject);
        TabClient tabClient = new TabClient(subject);

        phoneClient.addMessage("Here is a new message");
        tabClient.addMessage("Here is another message");
    }
}
