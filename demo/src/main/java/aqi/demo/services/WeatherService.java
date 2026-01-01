package aqi.demo.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WeatherService {

    private static final String API_KEY = "API KEY";
    private static final String URL =
            "https://api.openweathermap.org/data/2.5/weather?q={city}&appid="
            + API_KEY + "&units=metric";

    @Cacheable(value = "weatherCache", key = "#city")
    public Map<String, Object> getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, Map.class, city);
    }
}

