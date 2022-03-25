package com.company;
import org.apache.log4j.Logger;

public class TestLogs {
    private static final Logger logger = Logger.getLogger(TestLogs.class);
    public static void main(String[] args) {
        logger.info("Empezamos nuestro metodo MAIN");
        try {
            String variable = "Hola";
            int division = 1 / 0;
        } catch (Exception e) {
            logger.error("Error por dividir por cero ", e);
        }
        logger.warn("Advertencia el metodo MAIN esta por finalizar");
        logger.debug("Esto va a mostrarse solo si el infoLogger esta en DEBUG");
        logger.info("Finalizamos el thread MAIN");
    }
}
