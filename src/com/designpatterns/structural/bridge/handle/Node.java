package com.designpatterns.structural.bridge.handle;

class Node {
    public int value;
    public Node prev, next;

    public Node(int i) {
        value = i;
    }
}