package com.wassouf.ali.factory;

import com.wassouf.ali.factory.animal.Animal;
import com.wassouf.ali.factory.animal.AnimalFactory;
import com.wassouf.ali.factory.animal.Cat;
import com.wassouf.ali.factory.animal.Dog;
import com.wassouf.ali.factory.shape.Shape;
import com.wassouf.ali.factory.shape.ShapeFactory;

public class Demo
{
    @SuppressWarnings("unchecked")
    public static void main(String... args)
    {
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory(AnimalFactory.class.getSimpleName());
        AbstractFactory<Shape> shapeFactory = FactoryProvider.getFactory(ShapeFactory.class.getSimpleName());

        Animal dog = animalFactory.create(Dog.class.getSimpleName());
        Animal cat = animalFactory.create(Cat.class.getSimpleName());

        dog.makeSound();
        cat.makeSound();

        Shape rectangle = shapeFactory.create("Rectangle");
        Shape circle = shapeFactory.create("Circle");

        circle.draw();
        rectangle.draw();
    }
}
