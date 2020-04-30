package com.wassouf.ali.builder.classes;

public abstract class Car implements Vehicle
{
    private String color;
    private String manufacturer;
    private int yearModel;


    public String getColor()
    {
        return color;
    }


    public void setColor(String color)
    {
        this.color = color;
    }


    public String getManufacturer()
    {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }


    public int getYearModel()
    {
        return yearModel;
    }


    public void setYearModel(int yearModel)
    {
        this.yearModel = yearModel;
    }


    public static abstract class Builder
    {
        protected String color;
        protected String manufacturer;
        protected int yearModel;


        public Builder setColor(String color)
        {
            this.color = color;
            return this;
        }


        public Builder setManufacturer(String manufacturer)
        {
            this.manufacturer = manufacturer;
            return this;
        }


        public Builder setYearModel(int yearModel)
        {
            this.yearModel = yearModel;
            return this;
        }

        public abstract Car build();

    }
}
