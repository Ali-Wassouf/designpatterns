package com.wassouf.ali.factory.shape;

import com.wassouf.ali.factory.AbstractFactory;

public class ShapeFactory implements AbstractFactory<Shape>
{
    @Override
    public Shape create(String type)
    {
        if ("Rectangle".equals(type))
        {
            return new Rectangle();
        }
        if ("Circle".equals(type))
        {
            return new Circle();
        }
        return null;
    }
}
