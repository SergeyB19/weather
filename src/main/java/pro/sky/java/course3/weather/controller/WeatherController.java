package pro.sky.java.course3.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course3.weather.model.Weather;
import pro.sky.java.course3.weather.service.WeatherService;
import pro.sky.java.course3.weather.service.WeatherServiceProduction;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    @GetMapping("/weather{city}")
    public ResponseEntity<Weather> getWeather(@PathVariable("city") String city) {
        Weather weather = weatherService.getWeather(city);
        return ResponseEntity.ok(weather);
    }
}
