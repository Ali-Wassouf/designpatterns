package com.wassouf.ali.observer;

public class ObserverDemo
{
    public static void main(String... args){
        WeatherData weatherData = new WeatherData();
        Observer currentDisplay = new CurrentWeatherClient(new Screen(), weatherData);
        Observer forecastDisplay = new ForeCastClient(new Screen(),weatherData);
        Observer statisticDisplay = new StatisticsClient(new Screen(),weatherData);
        Observer heatIndexDisplay = new HeatIndexClient(new Screen(),weatherData);

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(statisticDisplay);
        weatherData.registerObserver(heatIndexDisplay);

        weatherData.setMeasurements(1.0F,1.0F,10.0F);

    }
}
