package com;

public abstract class Plant implements Canbreathe {
    protected String name;

    public abstract void canProduce();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plant(String name) {
        this.name = name;
    }
}
