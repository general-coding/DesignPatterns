package com.designpatterns.creational.prototype.product;

// 1. The clone() contract
interface Prototype {
    Prototype clone();

    String getName();

    void execute();
}