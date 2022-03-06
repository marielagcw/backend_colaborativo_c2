package com.dh.integradora1.ventas;

public abstract class Vendedor {

    protected String nombre;
    private int ventasRealizadas;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public void vender(int ventas) {
        this.ventasRealizadas += ventas;
    }

    public abstract String mostrarCategoria();
}





