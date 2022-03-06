package servicio;

import modelo.EmpleadoContratado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LiquidadorDeSueldoTest {
    /* Caso de prueba 2
    * Debería emitir un documento impreso cuando es un empleado contratado.
    * → Dado: Una empleada contratada, Pompilia Pompini, con 120 horas trabajadas y
    * una tarifa de 7 por hora.
    * → Cuando: Intento calcular la liquidación.
    * → Entonces: Obtengo el mensaje “La liquidación generada es un documento
    * impreso. Saldo a liquidar: 840”.
    * */

    @Test
    public void liquidarSueldo_deberiaCalcularCorrectamenteParaEmpleadoContratado(){
        // Dado → Quiénes son los objetivos de mi método

        EmpleadoContratado empleado = new EmpleadoContratado("Pompila Pompini",
                "001", // El número de cuenta no se especifica en el enunciado
                120,
                7);

       /* Para poder cumplir con el paso de "Cuando" necesito un Liquidador
        El Liquidador es el que me va a permitir traer el método*/

        /* Importante:
        → El sujeto de prueba es del TIPO Liquidador de sueldo
        → El sujeto de prueba es una INSTANCIA de LiquidadorEmpleadoContratado
        → El sujeto de prueba NO ES una instancia de la clase abstracta */

        LiquidadorDeSueldo sujetoDePrueba = new LiquidadorEmpleadoContratado();

        /* Ahora armamos el mensaje esperado para comparar el resultado de nuestro test */

        String mensajeEsperado = "840.0 - Recibo digital generado - Depósito realizado 👍 ";

        // Cuando

        /* Implementamos el método en mi sujeto de prueba pasando como parámetro mi empleado */

        String mensajeObtenido = sujetoDePrueba.liquidarSueldo(empleado);

        // Entonces
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);

    }



}