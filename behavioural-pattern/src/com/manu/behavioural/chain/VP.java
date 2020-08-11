package com.manu.behavioural.chain;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE) {
            if(request.getAmount() < 1500) System.out.println("VP can approve Purchase below 1500");
            else successor.handleRequest(request);
        }
    }
}
