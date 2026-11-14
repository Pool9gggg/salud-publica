
package pe.saludpublica.model;

import java.time.LocalDateTime;

public class CitaMedica {

    private String idPaciente;
    private String idDoctor;
    private String idEspecialidad;
    private LocalDateTime fechaHora;
    private EstadoCita estado;

    public CitaMedica(String idPaciente, String idDoctor,
                      String idEspecialidad, LocalDateTime fechaHora,
                      EstadoCita estado) {

        if (idPaciente == null) {
            throw new IllegalArgumentException("El ID del paciente no puede ser nulo");
        }

        if (idDoctor == null) {
            throw new IllegalArgumentException("El ID del doctor no puede ser nulo");
        }

        if (idEspecialidad == null) {
            throw new IllegalArgumentException("El ID de la especialidad no puede ser nulo");
        }

        if (fechaHora == null) {
            throw new IllegalArgumentException("La fecha y hora no pueden ser nulas");
        }

        if (estado == null) {
            throw new IllegalArgumentException("El estado no puede ser nulo");
        }

        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.idEspecialidad = idEspecialidad;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public EstadoCita getEstado() {
        return estado;
    }
}
