package com.designpatterns.structural.composite.rowscolumns;

// 2. "Isa" relationship
class Primitive implements Component {
    private final int value;

    public Primitive(int val) {
        value = val;
    }

    public void traverse() {
        System.out.print(value + "  ");
    }
}
