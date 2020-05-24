package com.designpatterns.creational.prototype.person;

class Dick implements Person {
    private final String NAME = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
