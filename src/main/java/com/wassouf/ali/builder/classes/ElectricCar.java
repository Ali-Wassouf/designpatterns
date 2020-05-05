package com.wassouf.ali.builder.classes;

public class ElectricCar extends Car implements Chargeable
{
    private double batteryCapacity;


    @Override
    public void setBatteryCapacity(double capacity)
    {
        this.batteryCapacity = capacity;
    }


    public static Builder getBuilder()
    {
        return new Builder();
    }


   public static class Builder extends Car.Builder
    {
        private double batteryCapacity;


        public Builder setBatteryCapacity(double batteryCapacity)
        {
            this.batteryCapacity = batteryCapacity;
            return this;
        }


        @Override
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
