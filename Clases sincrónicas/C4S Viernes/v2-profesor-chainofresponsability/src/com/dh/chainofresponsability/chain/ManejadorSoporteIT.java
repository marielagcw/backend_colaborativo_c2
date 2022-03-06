package com.dh.chainofresponsability.chain;

import com.dh.chainofresponsability.model.Correo;

public class ManejadorSoporteIT extends Manejador
{

    public ManejadorSoporteIT(){
        this.direccionDeCorreoAsignada = "soporte@tecnica.com";
        this.asuntoPorAtender = "soporte técnico";
    }

    @Override
    public String comprobar(Correo email) {
        String mensaje = "";

        if(esValidoElCorreo(email)){
            mensaje = "soporte";
        }else{
            mensaje = siguienteManejador.comprobar(email);
        }

        return mensaje;
    }
}