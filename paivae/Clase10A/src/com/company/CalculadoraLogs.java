package com.company;

import org.apache.log4j.Logger;

public class CalculadoraLogs {

    private static final Logger logger = Logger.getLogger(CalculadoraLogs.class);

    public static void main(String[] args){
        Calculadora calculadora1 = new Calculadora(1, 3);
        int suma = calculadora1.sumar();

        System.out.println(suma);

        Calculadora calculadora2 = new Calculadora(1,0);
        calculadora2.dividir();



    }
}
