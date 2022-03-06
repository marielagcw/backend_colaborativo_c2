package com.dh.integradora1.ventas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VendedorTest {

    @Test
    void mostrarCategoria_deberiaCategorizarElEmpleadoComoAprendiz() {
        //DADO
        Empleado empleado = new Empleado("Pedro",2);
        Vendedor afiliado = new Afiliado("ARamon");
        empleado.addAfiliado(afiliado);
        empleado.vender(2);

        String respuestaEsperada = "Pedro tiene un total de 20 puntos y categoriza como aprendiz";

        //CUANDO
        String resultado = empleado.mostrarCategoria();

        //ENTONCES
        Assertions.assertEquals(respuestaEsperada, resultado);
    }

    @Test
    void mostrarCategoria_deberiaCategorizarElEmpleadoComoNovato() {
        //DADO
        Empleado empleado = new Empleado("Maria",1);
        empleado.vender(1);
        String respuestaEsperada = "Maria tiene un total de 5 puntos y categoriza como novato";

        //CUANDO
        String resultado = empleado.mostrarCategoria();

        //ENTONCES
        Assertions.assertEquals(respuestaEsperada, resultado);
    }

    @Test
    void mostrarCategoria_deberiaCategorizarAlAfiliadoComoMaestro() {
        //DADO


        //CUANDO
        String resultado = afiliado.mostrarCategoria();

        //ENTONCES
        Assertions.assertEquals(respuestaEsperada, resultado);
    }
}