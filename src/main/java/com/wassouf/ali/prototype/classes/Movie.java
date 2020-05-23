package com.wassouf.ali.prototype.classes;

public class Movie implements Cloneable, EntertainmentProduct
{
    private String name;


    public Movie(String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }


    public Movie setName(String name)
    {
        this.name = name;
        return this;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException
    {
        return (Movie) super.clone();
    }


    @Override
    public String toString()
    {
        return "Movie{" +
            "name='" + name + '\'' +
            '}';
    }
}
