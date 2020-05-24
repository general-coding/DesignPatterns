package com.designpatterns.creational.abstractfactory.prototype;

public class FactoryFromPrototype {
    public static void main(String[] args) {
        AbstractFactory factory = null;

        if (args.length > 0) {
            factory = new PCFactory();
        } else {
            factory = new NotPCFactory();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(factory.makePhase() + " ");
        }

        System.out.println();

        System.out.println(factory.makeCompromise());

        System.out.println(factory.makeGrade());
    }
}
