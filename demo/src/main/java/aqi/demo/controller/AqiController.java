package aqi.demo.controller;

import aqi.demo.services.AqiService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/aqi")
@CrossOrigin
public class AqiController {

    private final AqiService service;

    public AqiController(AqiService service) {
        this.service = service;
    }

    @GetMapping
    public Map getAqi(@RequestParam String city) {
        return service.getAqi(city);
    }
}
