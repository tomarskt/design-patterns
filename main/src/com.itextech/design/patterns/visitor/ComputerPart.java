package com.kforce.design.patterns.visitor;

public interface  ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
