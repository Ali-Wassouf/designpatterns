package com.wassouf.ali.observer;

public class StatisticsDisplay extends AbstractDisplay
{
    private float temperature;
    private float humidity;
    private float pressure;


    public void update(float temperature, float humidity, float pressure)
    {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }


    public void display()
    {
        System.out.println("Statistics: \n\tTemperature: " + temperature + " C " + "\n\tHumidity: " + humidity + "\n\tPressure: " + pressure);
    }
}
