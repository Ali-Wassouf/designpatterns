package com.wassouf.ali.builder.car.classes;

public class ElectricCar implements Chargeable, Car
{
    private double batteryCapacity;
    private String color;
    private String manufacturer;
    private int yearModel;


    @Override
    public void setBatteryCapacity(double capacity)
    {
        this.batteryCapacity = capacity;
    }


    public double getBatteryCapacity()
    {
        return batteryCapacity;
    }



    public String getColor()
    {
        return color;
    }



    public ElectricCar setColor(String color)
    {
        this.color = color;
        return this;
    }



    public String getManufacturer()
    {
        return manufacturer;
    }



    public ElectricCar setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
        return this;
    }



    public int getYearModel()
    {
        return yearModel;
    }



    public ElectricCar setYearModel(int yearModel)
    {
        this.yearModel = yearModel;
        return this;
    }


    public static Builder getBuilder()
    {
        return new Builder();
    }


   public static class Builder
    {
        private double batteryCapacity;
        private String color;
        private String manufacturer;
        private int yearModel;

        public Builder setBatteryCapacity(double batteryCapacity)
        {
            this.batteryCapacity = batteryCapacity;
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


        public ElectricCar build()
        {
            ElectricCar car = new ElectricCar();
            car.setBatteryCapacity(this.batteryCapacity);
            car.setColor(this.color);
            car.setManufacturer(this.manufacturer);
            car.setYearModel(this.yearModel);
            return car;
        }
    }


    @Override
    public String toString()
    {
        return "ElectricCar{" +
            "batteryCapacity=" + batteryCapacity +
            '}';
    }
}
