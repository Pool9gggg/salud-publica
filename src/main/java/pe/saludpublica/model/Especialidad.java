
package pe.saludpublica.model;

public class Especialidad {

    private String nombre;

    public Especialidad(String nombre) {

        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
