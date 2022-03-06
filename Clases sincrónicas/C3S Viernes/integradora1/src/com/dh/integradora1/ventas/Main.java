package com.dh.integradora1.ventas;

public class Main {
    public static void main(String[] args) {
        /*Mofidicar el main para testear la logica con el metodo templeate */
        Empleado emp1 = new Empleado("EPedro",2); emp1.vender(2);
        Empleado emp2 = new Empleado("EMaria",1); emp2.vender(1);

        Vendedor afi1 = new Afiliado("ARamon"); afi1.vender(4);
        Vendedor afi2 = new Afiliado("APepe"); afi2.vender(1);
        Vendedor afi3 = new Afiliado("ASantiago");

        emp1.addAfiliado(afi1);

        System.out.println(emp1.mostrarCategoria());
        System.out.println(emp2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());

    }
}
