package com.dh.filtrodepersonas;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroDePersonas {
    public List<Persona> filtrar(List<Persona> personas) {
        return personas.stream()
                .filter(p -> p.esMayorDeEdad() && p.getNombre().length() > 5)
                .collect(Collectors.toList());
    }
}
