package com.codigo.adapter.controller;

import com.codigo.adapter.adaptador.AdaptadorBiblioteca;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/patron/adapter")
@RequiredArgsConstructor
public class LibroController {

    private final AdaptadorBiblioteca adaptadorBiblioteca;

    @GetMapping("/libro/{id}")
    public String ObtenerLibro(@PathVariable int id){
        return adaptadorBiblioteca.obtenerDetalles(id);
    }
}
