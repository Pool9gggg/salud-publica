

package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CitaMedicaTest {

    @Test
    @DisplayName("Debe crear una cita médica con datos válidos")
    void shouldCreateAppointmentWithValidData() {
        CitaMedica cita = new CitaMedica(
                "PAC001", "DOC001", "ESP001",
                LocalDateTime.of(2026, 11, 20, 10, 30),
                EstadoCita.PROGRAMADA
        );

        assertNotNull(cita);
    }

    @Test
    @DisplayName("Debe rechazar una cita sin identificador de paciente")
    void shouldRejectAppointmentWithoutPatientId() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        null, "DOC001", "ESP001",
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    @DisplayName("Debe rechazar una cita sin identificador de doctor")
    void shouldRejectAppointmentWithoutDoctorId() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", null, "ESP001",
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    @DisplayName("Debe rechazar una cita sin identificador de especialidad")
    void shouldRejectAppointmentWithoutSpecialtyId() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", "DOC001", null,
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    @DisplayName("Debe rechazar una cita sin fecha y hora")
    void shouldRejectAppointmentWithoutDateTime() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", "DOC001", "ESP001",
                        null, EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    @DisplayName("Debe rechazar una cita sin estado")
    void shouldRejectAppointmentWithoutStatus() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", "DOC001", "ESP001",
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        null
                )
        );
    }

    @Test
    @DisplayName("Debe conservar el estado válido de la cita")
    void shouldPreserveValidAppointmentStatus() {
        CitaMedica cita = new CitaMedica(
                "PAC001", "DOC001", "ESP001",
                LocalDateTime.of(2026, 11, 20, 10, 30),
                EstadoCita.PROGRAMADA
        );

        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }

    @Test
    @DisplayName("Debe devolver correctamente los atributos de la cita médica")
    void shouldReturnCorrectAppointmentAttributes() {
        LocalDateTime fecha = LocalDateTime.of(2026, 11, 20, 10, 30);

        CitaMedica cita = new CitaMedica(
                "PAC001", "DOC001", "ESP001",
                fecha, EstadoCita.PROGRAMADA
        );

        assertEquals("PAC001", cita.getIdPaciente());
        assertEquals("DOC001", cita.getIdDoctor());
        assertEquals("ESP001", cita.getIdEspecialidad());
        assertEquals(fecha, cita.getFechaHora());
        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }
}
