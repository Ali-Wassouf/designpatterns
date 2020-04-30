package com.wassouf.ali.observer;

public class Screen implements DisplayElement
{
    @Override
    public void display(String output)
    {
        System.out.println(output);
    }
}
