package com.dh.filtrodepersonas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FiltroDePersonasTest {

    @Test
    public void deberiaAgregarSoloLasPersonasQueCorrespondanConElCriterio(){
        //DADO
        Persona juan = new Persona("Juan", 19);
        Persona pedro = new Persona("Pedro", 17);
        Persona ana = new Persona("Ana", 15);
        Persona luz = new Persona("Alessandra", 20);
        Persona julian = new Persona("Julián", 19);
        FiltroDePersonas filtro = new FiltroDePersonas();

        //CUANDO
        List<Persona> resultado = filtro.filtrar(List.of(juan, pedro, ana, luz, julian));

        //ENTONCES
        Assertions.assertTrue(resultado.size() == 2);
    }
}
