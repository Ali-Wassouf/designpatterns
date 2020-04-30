package com.wassouf.ali.observer;

import lombok.Data;

@Data
public class ForeCastClient implements Observer
{
    private float temperature;
    private float humidity;
    private float pressure;
    private DisplayElement displayElement;
    private Subject subject;


    public ForeCastClient(DisplayElement displayElement, Subject subject)
    {
        this.displayElement = displayElement;
        this.subject = subject;
    }


    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }


    public void display()
    {
       displayElement.display("Forecast: \n\tTemperature: " + temperature + " C " + "\n\tHumidity: " + humidity + "\n\tPressure: " + pressure);
    }
}
