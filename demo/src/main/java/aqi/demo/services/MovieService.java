package aqi.demo.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class MovieService {

    private static final String API_KEY = "e27ad6a6";
    private static final String SEARCH_URL =
            "http://www.omdbapi.com/?apikey=" + API_KEY + "&s={title}";

    @Cacheable(value = "movieCache", key = "#title")
    public Map<String, Object> searchMovie(String title) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(SEARCH_URL, Map.class, title);
    }
}
