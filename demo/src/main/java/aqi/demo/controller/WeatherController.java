package aqi.demo.controller;

import aqi.demo.services.WeatherService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin
public class WeatherController {

    private final WeatherService service;

    public WeatherController(WeatherService service) {
        this.service = service;
    }

    @GetMapping
    public Map<String, Object> getWeather(@RequestParam String city) {
        return service.getWeather(city);
    }
}
