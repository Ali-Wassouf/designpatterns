package com.wassouf.ali.observer;

public class ForeCastDisplay extends AbstractDisplay
{
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure)
    {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
    }


    public void display()
    {
        System.out.println("Forecast: \n\tTemperature: "+temperature+" C "+"\n\tHumidity: "+humidity+"\n\tPressure: "+pressure);
    }
}
