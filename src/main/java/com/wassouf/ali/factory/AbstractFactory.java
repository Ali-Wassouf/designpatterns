package com.wassouf.ali.factory;

public interface AbstractFactory<T>
{
    T create(String type);
}
