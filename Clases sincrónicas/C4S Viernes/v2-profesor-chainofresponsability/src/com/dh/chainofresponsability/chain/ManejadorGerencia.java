package com.dh.chainofresponsability.chain;

import com.dh.chainofresponsability.model.Correo;

public class ManejadorGerencia extends Manejador{

    public ManejadorGerencia(){
        this.direccionDeCorreoAsignada = "gerencia@colmena.com";
        this.asuntoPorAtender = "gerencia";
    }

    @Override
    public String comprobar(Correo email) {
        String mensaje = "";

        if(this.esValidoElCorreo(email)){
            mensaje = "gerencial";
        }else{
            mensaje = siguienteManejador.comprobar(email);
        }

        return mensaje;
    }
}
