package com.designpatterns.structural.bridge.basic;

class Node {
    public int value;

    public Node prev, next;

    public Node(int value) {
        this.value = value;
    }
}