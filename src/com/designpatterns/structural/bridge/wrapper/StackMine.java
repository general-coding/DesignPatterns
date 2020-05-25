package com.designpatterns.structural.bridge.wrapper;

/**
 * Derive the separate implementations from the common abstraction
 */
class StackMine implements StackImp {
    private final Object[] items = new Object[20];
    private int total = -1;

    public Object push(Object o) {
        return items[++total] = o;
    }

    public Object peek() {
        return items[total];
    }

    public Object pop() {
        return items[total--];
    }

    public boolean empty() {
        return total == -1;
    }
}
