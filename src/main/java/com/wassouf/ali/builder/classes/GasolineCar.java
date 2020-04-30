package com.wassouf.ali.builder.classes;

public class GasolineCar extends Car implements Fuelable
{
    private double gasTankCapacity;


    @Override
    public void setGasTankCapacity(double capacity)
    {
        this.gasTankCapacity = capacity;
    }


    public static Builder getBuilder()
    {
        return new Builder();
    }


    public static class Builder extends Car.Builder
    {
        private double gasTankCapacity;


        public Builder setGasTankCapacity(double gasTankCapacity)
        {
            this.gasTankCapacity = gasTankCapacity;
            return this;
        }


        @Override
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
