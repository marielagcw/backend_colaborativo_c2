package com.dh.chainofresponsability;

import com.dh.chainofresponsability.model.Correo;
import com.dh.chainofresponsability.service.ValidadorDeCorreos;

public class Main {

    public static void main(String[] args) {

        ValidadorDeCorreos proceso = new ValidadorDeCorreos();
        proceso.comprobar(new Correo("mio@mail.com", "soporte@headingsas.com","reclamo"));
        proceso.comprobar(new Correo("mio@mail.com", "sds@digitalhouse.com","gerencia"));
        proceso.comprobar(new Correo("mio@mail.com", "juan@pepe.com","comercial"));
        proceso.comprobar(new Correo("mio@mail.com", "qqq@digitalhouse.com","reclamo"));

    }
}
