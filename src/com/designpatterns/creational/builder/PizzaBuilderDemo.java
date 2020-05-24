package com.designpatterns.creational.builder;

/* A customer ordering a pizza. */
public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Pizza pizza;

        Waiter waiter = new Waiter();

        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzabuilder);
        waiter.constructPizza();
        pizza = waiter.getPizza();
        System.out.println(pizza);

        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
