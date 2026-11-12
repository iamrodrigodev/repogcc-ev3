
package com.example.demo.controller;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fiado")
public class FiadoController {

    @GetMapping("/{id}")
    public Map<String, Object> consultarFiado(@PathVariable int id) {
        Map<String, Object> fiado = new HashMap<>();
        fiado.put("id", id);
        fiado.put("cliente", "Juan Pérez");
        fiado.put("producto", "Arroz");
        fiado.put("monto", 25.50);
        fiado.put("estado", "Pendiente");
        return fiado;
    }

    @PostMapping("/crear")
    public Map<String, Object> registrarFiado(
            @RequestBody Map<String, Object> nuevo) {
        nuevo.put("id", System.currentTimeMillis());
        nuevo.put("estado", "Pendiente");
        return nuevo;
    }
}
