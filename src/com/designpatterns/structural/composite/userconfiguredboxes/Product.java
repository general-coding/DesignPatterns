package com.designpatterns.structural.composite.userconfiguredboxes;

class Product extends Entity {
    private int value;

    public Product(int val) {
        value = val;
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels))
            System.out.println(indent.toString() + value);
    }
}
