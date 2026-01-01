package aqi.demo.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class AqiService {

    private static final String TOKEN = "b2f6b4612588947366a5072db5f7e06a8c75af29";
    private static final String URL =
            "https://api.waqi.info/feed/{city}/?token=" + TOKEN;

    @Cacheable(value = "aqiCache", key = "#city")
    public Map getAqi(String city) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, Map.class, city);
    }
}
