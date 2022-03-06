package servicio;

// Liquidador de sueldo es mi clase núcleo del programa

import modelo.Empleado;

public abstract class LiquidadorDeSueldo {

    /*Declaramos el método público que es mi template
    Es el método que será utilizado por las demás subclases
    Como me faltan datos para saber de qué manera va a implementar este método cada clase lo dejamos abstracto*/

    // public abstract void liquidarSueldo(Empleado e); // De quién? → del Empleado e

    public abstract String liquidarSueldo(Empleado e);

    // Declaramos los métodos abstractos pero que no deben ser públicos
    // Estos métodos serán utilizados por el método público

    protected abstract double calcularSueldo(Empleado e); // De quién? → del Empleado e

    // protected abstract void imprimirSueldo();

    protected abstract String imprimirSueldo();

    // Declaramos el método concreto
    // Este método no será utilizado por todas las clases

    //protected void depositar() {
    //    System.out.println("Depósito realizado 👍 ");
    //}

    protected String depositar() {
        return "Depósito realizado 👍 ";
    }

    // Una vez creada la clase abstracta necesito implementarla
    // Se crea la clase LiquidadorEmpleadoContratado → subclase concreta de la clase abstracta

}
