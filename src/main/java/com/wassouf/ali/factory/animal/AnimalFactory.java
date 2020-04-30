package com.wassouf.ali.factory.animal;

import com.wassouf.ali.factory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal>
{
    @Override
    public Animal create(String type)
    {
        if(Dog.class.getSimpleName().equals(type)){
            return new Dog();
        }
        if(Cat.class.getSimpleName().equals(type)){
            return new Cat();
        }
        return null;
    }
}
