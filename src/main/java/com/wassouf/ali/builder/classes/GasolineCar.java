package com.wassouf.ali.builder.classes;

public class GasolineCar implements Fuelable, Car
{
    private double gasTankCapacity;
    private String color;
    private String manufacturer;
    private int yearModel;


    public double getGasTankCapacity()
    {
        return gasTankCapacity;
    }


    public String getColor()
    {
        return color;
    }


    public GasolineCar setColor(String color)
    {
        this.color = color;
        return this;
    }


    public String getManufacturer()
    {
        return manufacturer;
    }


    public GasolineCar setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
        return this;
    }


    public int getYearModel()
    {
        return yearModel;
    }


    public GasolineCar setYearModel(int yearModel)
    {
        this.yearModel = yearModel;
        return this;
    }


    @Override
    public void setGasTankCapacity(double capacity)
    {
        this.gasTankCapacity = capacity;
    }


    public static Builder getBuilder()
    {
        return new Builder();
    }


    public static class Builder
    {
        private double gasTankCapacity;
        private String color;
        private String manufacturer;
        private int yearModel;

        public Builder setGasTankCapacity(double gasTankCapacity)
        {
            this.gasTankCapacity = gasTankCapacity;
            return this;
        }


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


        public GasolineCar build()
        {
            GasolineCar car = new GasolineCar();
            car.setGasTankCapacity(this.gasTankCapacity);
            car.setColor(this.color);
            car.setManufacturer(this.manufacturer);
            car.setYearModel(this.yearModel);
            return car;
        }
    }


    @Override
    public String toString()
    {
        return "GasolineCar{" +
            "gasTankCapacity=" + gasTankCapacity +
            '}';
    }
}
