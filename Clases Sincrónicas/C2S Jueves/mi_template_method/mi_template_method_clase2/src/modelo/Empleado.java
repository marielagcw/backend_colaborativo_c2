package modelo;

// Esta clase es requerida pero no es la clase núcleo o principal que hace todas las funcionalidades en mi app
// La clase empleado es una clase que luego tiene otras subclases

public class Empleado {
    // Atributos

    private String nombre;
    private String numeroDeCuenta;

    // Constructores

    public Empleado(String nombre, String numeroDeCuenta) {
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
}
