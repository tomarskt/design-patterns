package com.kforce.design.patterns.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
