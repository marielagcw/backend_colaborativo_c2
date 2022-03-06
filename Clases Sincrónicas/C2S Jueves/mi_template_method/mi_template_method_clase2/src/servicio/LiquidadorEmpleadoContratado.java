package servicio;

import modelo.Empleado;
import modelo.EmpleadoContratado;

public class LiquidadorEmpleadoContratado extends LiquidadorDeSueldo{

    // Sobreescribimos los métodos de la clase abstracta

    @Override
    public String liquidarSueldo(Empleado e) {
        // Para poder implementar este método necesito definir la clase EmpleadoContratado
        // Antes de definir la lógica de los métodos hacemos los tests
        // Antes de implementar este método LiquidarSueldo necesitamos hacer override de los otros dos

        String mensaje = ""; // Declaramos la variable que vamos a armar a continuación

        mensaje += calcularSueldo(e) + " - ";
        mensaje += imprimirSueldo() + " - ";
        mensaje += depositar();

        return mensaje;

    }

    @Override
    protected double calcularSueldo(Empleado e) {
        // Valor por defecto en caso de que "e" no sea EmpleadoContratado
        double resultado = -1;

        // Yo voy a recibir un Empleado
        // Pero el método que necesito no lo tiene Empleado sino EmpleadoContratado
        // Necesitamos castear de Empleado a EmpleadoContratado para poder usar el método

        // Primero nos aseguramos con un if que el Empleado "e" que viene sea realmente un EmpleadoContratado
        if( e instanceof EmpleadoContratado){
            // Hacemos el casteo
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) e;
            // Ahora sí implementamos la lógica para probar el método
            resultado = empleadoContratado.getHorasTrabajadas() * empleadoContratado.getTarifaPorHora();
        }

        return resultado;
    }


    @Override
    protected String imprimirSueldo() {
        return "Recibo digital generado";
    }
}
