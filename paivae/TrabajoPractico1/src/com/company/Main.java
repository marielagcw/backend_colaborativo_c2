package com.company;

import com.company.baseDatos.OdontologoH2;

public class Main {

    public static void main(String[] args) throws Exception {

        OdontologoServicio servicio = new OdontologoServicio(new OdontologoH2());

        Odontologo odontologoEscobar = new Odontologo(1, "Pablo","Escobar");
        Odontologo odontologoWhite = new Odontologo(2,"Walter","White");

        servicio.guardar(odontologoEscobar);
        servicio.guardar(odontologoWhite);

        System.out.println(servicio.listar());

        servicio.cerrar();
    }
}
