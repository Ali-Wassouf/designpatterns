package com.wassouf.ali.prototype.classes;

public class Album implements Cloneable, EntertainmentProduct
{
    private String name;
    private int songsNumber;


    public Album(String name, int songsNumber)
    {
        this.name = name;
        this.songsNumber = songsNumber;
    }


    public String getName()
    {
        return name;
    }


    public Album setName(String name)
    {
        this.name = name;
        return this;
    }


    public int getSongsNumber()
    {
        return songsNumber;
    }


    public Album setSongsNumber(int songsNumber)
    {
        this.songsNumber = songsNumber;
        return this;
    }

    @Override
    public Album clone() throws CloneNotSupportedException
    {
        return (Album) super.clone();
    }


    @Override
    public String toString()
    {
        return "Album{" +
            "name='" + name + '\'' +
            ", songsNumber=" + songsNumber +
            '}';
    }
}
