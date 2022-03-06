package com.dh.filtrodepersonas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    public void esMayorDeEdad_deberiaRetornarVerdaderoCuandoLaEsadEsMayorQue18(){
        //DADO
        Persona sujetoDePrueba = new Persona("Juancho", 21);

        //CUANDO
        boolean respuesta = sujetoDePrueba.esMayorDeEdad();

        //ENTONCES
        Assertions.assertTrue(respuesta);
    }
}
