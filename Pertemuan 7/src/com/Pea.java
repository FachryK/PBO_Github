package com;

public class Pea extends Plant {
    public Pea(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println("The " + name + " is breathing air");
    }

    @Override
    public void canProduce() {
        System.out.println("The " + name + " is can produce bean");
    }
}
