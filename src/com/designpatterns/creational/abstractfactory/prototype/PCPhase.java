package com.designpatterns.creational.abstractfactory.prototype;

class PCPhase extends Expression {
    private static final String[] list = {"animal companion", "vertically challenged", "factually inaccurat"
            , "chronologically gifted"};
    private static int next = 0;

    public PCPhase() {
        super(list[next]);
        next = (next + 1) % list.length;
    }

    @Override
    protected Expression clone() {
        return new PCPhase();
    }
}
