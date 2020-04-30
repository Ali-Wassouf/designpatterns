package com.wassouf.ali.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class WeatherData implements Subject
{
    private float temperature;
    private float humidity;
    private float pressure;

    private List<Observer> observers = new ArrayList<>();


    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }


    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }


    public void measurementChanged()
    {
        notifyObservers();
    }


    public void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(temperature, humidity, pressure);
        }
    }


    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        setHumidity(humidity);
        setPressure(pressure);
        setTemperature(temperature);
        measurementChanged();
    }

}
