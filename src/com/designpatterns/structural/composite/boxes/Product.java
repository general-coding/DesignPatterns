package com.designpatterns.structural.composite.boxes;

class Product extends Entity {
    private final int value;

    public Product(int value) {
        this.value = value;
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
        }
    }
}