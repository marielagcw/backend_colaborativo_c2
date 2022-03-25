package com.company;

import java.text.DecimalFormat;

public class Cuadrado {

    public String getArea(double radio){

        if(radio <= 0 ){
            return "El valor del lado debe ser mayor que cero";
        }
        else{
            double area = Math.pow(radio,2);

            // Formateo la salida del valor del area, para no mostrar todos los decimales
            // en este caso solo muestro 2 decimales (00)
            DecimalFormat formatoNumero = new DecimalFormat("#.00");

            return "El área del Cuadrado es "+ formatoNumero.format(area) +" unidades";
        }
    }
}
