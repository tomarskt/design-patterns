package com.itextech.design.patterns.intercepting;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
