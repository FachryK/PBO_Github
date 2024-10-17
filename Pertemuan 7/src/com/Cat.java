package com;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void move(){
        System.out.println("The " + name + " is moving");
    }
    @Override
    public void breathe(){
        System.out.println("The " + name + " is breathing an air");
    }
    @Override
    public void makeSound(){
        System.out.println("The " + name + " is meowing");
    }
}
