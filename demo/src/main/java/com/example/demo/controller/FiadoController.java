package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FiadoController {
    @GetMapping("/fiado/{id}")
    public Map<String,Object> consultarFiado(@PathVariable(name="id") int id) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id", id);
        map.put("cliente", "Juan Pérez");
        map.put("producto", "Arroz");
        map.put("monto", 25.50);
        map.put("estado", "Pendiente");
        return map;
    }

    @PostMapping("/fiado/crear")
    public Map<String,Object> registrarFiado(@RequestBody Map<String,Object> nuevo) {
        Date ahora = new Date();
        nuevo.put("id", ahora.getTime());
        nuevo.put("estado", "Pendiente");
        return nuevo;
    }

}
