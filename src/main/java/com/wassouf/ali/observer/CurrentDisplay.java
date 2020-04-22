package com.wassouf.ali.observer;

public class CurrentDisplay extends AbstractDisplay
{
    private float temperature;
    private float humidity;
    private float pressure;
    public void update(float temperature, float humidity, float pressure)
    {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
    }


    public void display()
    {
        System.out.println("Current condition: \n\tTemperature: "+temperature+" C "+"\n\tHumidity: "+humidity+"\n\tPressure: "+pressure);
    }
}
