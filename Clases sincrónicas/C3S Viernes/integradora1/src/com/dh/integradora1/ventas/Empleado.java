package com.dh.integradora1.ventas;

import java.util.ArrayList;

public class Empleado extends Vendedor {

    private int añosDeAntigüedad;
    private int cantidadDeAfiliados;
    private int ventasRealizadas;

    public Empleado(String nombre, int añosDeAntigüedad) {
        super(nombre);
        this.añosDeAntigüedad = añosDeAntigüedad;
    }

    public void addAfiliado(Vendedor afiliado) {
        if(afiliado != null){
            this.cantidadDeAfiliados ++;
        }
    }

    @Override
    public String mostrarCategoria() {
        int puntajeFinal = (10 * this.cantidadDeAfiliados) + (5 * this.ventasRealizadas) + (5 * this.añosDeAntigüedad);
        String categoría = "";

        if(puntajeFinal < 20){
            categoría = "novato";
        }else if(puntajeFinal >= 20 && puntajeFinal <= 30){
            categoría = "aprendiz";
        }else if(puntajeFinal >= 31 && puntajeFinal <= 40){
            categoría = "buenos";
        }else{
            categoría = "maestro";
        }

        String respuesta = this.nombre + " tiene un total de " + puntajeFinal + " puntos y categoriza como " + categoría;

        return respuesta;
    }
}
