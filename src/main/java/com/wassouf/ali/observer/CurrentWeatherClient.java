package com.wassouf.ali.observer;

import lombok.Data;

@Data
public class CurrentWeatherClient implements Observer
{
    private float temperature;
    private float humidity;
    private float pressure;
    private DisplayElement displayElement;
    private Subject subject;


    public CurrentWeatherClient(DisplayElement displayElement, Subject subject)
    {
        this.displayElement = displayElement;
        this.subject = subject;
    }


    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }


    public void display()
    {
       displayElement.display("Current condition: \n\tTemperature: " + temperature + " C " + "\n\tHumidity: " + humidity + "\n\tPressure: " + pressure);
    }
}
