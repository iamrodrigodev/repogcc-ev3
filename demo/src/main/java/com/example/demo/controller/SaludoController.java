package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {
    public Map<String, Object> saludar(@RequestParam String nombre) {
        return Map.of("mensaje", "Hola " + nombre + ". Bienvenido a Spring Boot");
    }
}
