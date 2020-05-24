package com.designpatterns.creational.abstractfactory.factorymethod;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        CPU cpu = null;
        MMU mmu = null;

        factory = AbstractFactory.getFactory(Architecture.EMBER);
        factory.createCPU();
        factory.createMMU();

        factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        factory.createCPU();
        factory.createMMU();
    }
}
