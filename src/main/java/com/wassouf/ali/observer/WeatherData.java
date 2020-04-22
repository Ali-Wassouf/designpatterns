package com.wassouf.ali.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{
    private float temperature;
    private float humidity;
    private float pressure;

    private List<Observer> observers = new ArrayList<Observer>();


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


    public float getTemperature()
    {
        return temperature;
    }


    public void setTemperature(float temperature)
    {
        this.temperature = temperature;
    }


    public float getHumidity()
    {
        return humidity;
    }


    public void setHumidity(float humidity)
    {
        this.humidity = humidity;
    }


    public float getPressure()
    {
        return pressure;
    }


    public void setPressure(float pressure)
    {
        this.pressure = pressure;
    }
}
