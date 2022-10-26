package pro.sky.java.course3.weather.service;

import pro.sky.java.course3.weather.model.Weather;

public interface WeatherService {
    Weather getWeather(String city);
}
