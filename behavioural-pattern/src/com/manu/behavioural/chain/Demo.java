package com.manu.behavioural.chain;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request1 = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request1);

        Request request2 = new Request(RequestType.PURCHASE, 1499);
        director.handleRequest(request2);

        Request request3 = new Request(RequestType.PURCHASE, 1780);
        director.handleRequest(request3);
    }
}
