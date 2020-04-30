package com.wassouf.ali.factory;

import com.wassouf.ali.factory.animal.AnimalFactory;
import com.wassouf.ali.factory.shape.ShapeFactory;

public class FactoryProvider
{
    public static AbstractFactory getFactory(String factory)
    {
        if (ShapeFactory.class.getSimpleName().equals(factory))
        {
            return new ShapeFactory();
        }
        if (AnimalFactory.class.getSimpleName().equals(factory))
        {
            return new AnimalFactory();
        }
        return null;
    }
}
