package com.company;

import java.text.DecimalFormat;

public class Circulo {

    public String getArea(double radio){

        if(radio <= 0 ){
            return "El valor del radio debe ser mayor que cero";
        }
        else{
            double area = Math.PI * Math.pow(radio,2);

            // Formateo la salida del valor del area, para no mostrar todos los decimales
            // en este caso solo muestro 3 decimales (000)
            DecimalFormat formatoNumero = new DecimalFormat("#.000");

            return "El área del Circulo es "+ formatoNumero.format(area) +" unidades";
        }
    }
}
