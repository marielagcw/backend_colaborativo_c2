package com.company;

public class Odontologo {
    private Integer nroMatricula;
    private String nombre;
    private String apellido;

    public Odontologo(Integer nroMatricula, String nombre, String apellido) {
        this.nroMatricula = nroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getNroMatricula() {
        return nroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNroMatricula(Integer nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo - {" +
                "nroMatricula=" + nroMatricula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
