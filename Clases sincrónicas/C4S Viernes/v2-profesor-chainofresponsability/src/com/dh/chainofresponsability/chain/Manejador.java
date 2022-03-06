package com.dh.chainofresponsability.chain;

import com.dh.chainofresponsability.model.Correo;

public abstract class Manejador
{
    protected String direccionDeCorreoAsignada;
    protected String asuntoPorAtender;
    public static final String MENSAJE_SPAM = "¡Ojo! Marcado como spam....";

    protected Manejador siguienteManejador;


    // ----------------------------------------
    public Manejador getSiguiente() {
        return this.siguienteManejador;
    }
    // ----------------------------------------
    public void setSiguiente(Manejador m) {
        this.siguienteManejador = m;
    }
    // ----------------------------------------
    public abstract String comprobar(Correo elMail);

    protected boolean esValidoElCorreo(Correo email){
        return (email.getDestino().equalsIgnoreCase(this.direccionDeCorreoAsignada)) ||
                (email.getAsunto().equalsIgnoreCase(this.asuntoPorAtender));
    }
}