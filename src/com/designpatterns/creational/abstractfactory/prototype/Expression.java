package com.designpatterns.creational.abstractfactory.prototype;

class Expression implements Cloneable {
    public String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    @Override
    protected Expression clone() {
        Expression clone = null;
        try {
            clone = (Expression) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return clone;
    }

    @Override
    public String toString() {
        return expression;
    }
}
