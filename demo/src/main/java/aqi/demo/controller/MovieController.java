package aqi.demo.controller;

import aqi.demo.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public Map<String, Object> search(@RequestParam String title) {
        return service.searchMovie(title);
    }
}
