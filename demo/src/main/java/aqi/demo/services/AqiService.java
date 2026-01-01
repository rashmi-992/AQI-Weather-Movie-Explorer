package aqi.demo.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class AqiService {

    private static final String TOKEN = "API_KEY";
    private static final String URL =
            "https://api.waqi.info/feed/{city}/?token=" + TOKEN;

    @Cacheable(value = "aqiCache", key = "#city")
    public Map getAqi(String city) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, Map.class, city);
    }
}
