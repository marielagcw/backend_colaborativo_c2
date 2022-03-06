package modelo;

// EmpleadoContratado es una subclase de empleado
// Particularidades:
// → trabajan una cantidad de horas → horasTrabajadas
// → trabajan con una tarifa por hora específica → tarifaPorHora


public class EmpleadoContratado extends Empleado{

    // Atributos
    private int horasTrabajadas;
    private int tarifaPorHora;

    // Constructores


    public EmpleadoContratado(String nombre, String numeroDeCuenta, int horasTrabajadas, int tarifaPorHora) {
        super(nombre, numeroDeCuenta);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Getters y setters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
