package com.wassouf.ali.observer;

public class ObserverDemo
{
    public static void main(String... args){
        WeatherData weatherData = new WeatherData();
        AbstractDisplay currentDisplay = new CurrentDisplay();
        AbstractDisplay forecastDisplay = new ForeCastDisplay();
        AbstractDisplay statisticDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(statisticDisplay);

        weatherData.setMeasurements(1.0F,1.0F,10.0F);

        currentDisplay.display();
        forecastDisplay.display();
        statisticDisplay.display();
    }
}
