package com.designpatterns.structural.bridge.handle;

interface StackImpl {
    void push(int i);

    int pop();

    int top();

    boolean isEmpty();

    boolean isFull();
}
