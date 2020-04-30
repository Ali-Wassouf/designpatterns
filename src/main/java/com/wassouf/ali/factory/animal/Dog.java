package com.wassouf.ali.factory.animal;

public class Dog implements Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Woof");
    }
}
