package com.example.demo.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/salud")
public class SaludController {
    @GetMapping
    public Map<String, Object> saludar() {
        return Map.of("mensaje", "repogcc-ev3 funcionando correctamente");
    }
}
