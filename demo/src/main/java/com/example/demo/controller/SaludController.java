package com.example.demo.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludController {

    @GetMapping("/salud")
    public Map<String, Object> saludar() {
        return Map.of(
            "mensaje", "repogcc-ev3 funcionando correctamente"
        );
    }
}
