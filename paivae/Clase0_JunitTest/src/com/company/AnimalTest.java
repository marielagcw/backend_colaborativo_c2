package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AnimalTest {

    @Test
    public void siElAnimalEsPesado(){
        Animal caballo = new Animal("Caballo", "grande", 5000);
        Animal perro = new Animal("Perro","mediano",20);

        boolean esPesado = caballo.esPesado();
        boolean esPesado1 = perro.esPesado();

        assertEquals(true, esPesado);
        assertFalse(esPesado1);

    }
}
