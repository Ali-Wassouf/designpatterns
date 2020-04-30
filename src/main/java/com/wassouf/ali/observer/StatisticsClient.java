package com.wassouf.ali.observer;

import lombok.Data;

@Data
public class StatisticsClient implements Observer
{
    private float temperature;
    private float humidity;
    private float pressure;
    private DisplayElement displayElement;
    private Subject subject;


    public StatisticsClient(DisplayElement displayElement, Subject subject)
    {
        this.displayElement = displayElement;
        this.subject = subject;
    }


    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }


    public void display()
    {
        displayElement.display("Statistics: \n\tTemperature: " + temperature + " C " + "\n\tHumidity: " + humidity + "\n\tPressure: " + pressure);
    }
}
