package com.manu.behavioural.state;

import java.util.stream.Stream;

public class Fan {
    State fanOFFState;
    State fanLOWState;
    State fanMEDState;
    State fanHIGHState;

    State currentState;

    public Fan() {
        fanOFFState = new FanOFFState(this);
        fanLOWState = new FanLOWState(this);
        fanMEDState = new FanMEDState(this);
        fanHIGHState = new FanHIGHState(this);

        currentState = fanOFFState;
    }

    public void pullChain() {
        currentState.handleRequest();
    }

    public State getFanOFFState() {
        return fanOFFState;
    }

    public State getFanLOWState() {
        return fanLOWState;
    }

    public State getFanMEDState() {
        return fanMEDState;
    }

    public State getFanHIGHState() {
        return fanHIGHState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String toString() {
        return currentState.toString();
    }
}
