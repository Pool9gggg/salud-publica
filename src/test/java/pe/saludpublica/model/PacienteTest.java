package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    @Test
    @DisplayName("Crear un paciente con datos válidos")
    void shouldCreatePatientWithValidData() {

        Paciente paciente = new Paciente(
                "12345678",
                "Ana",
                "Pérez",
                "987654321",
                "ana@mail.com"
        );

        assertNotNull(paciente);

        assertEquals("12345678", paciente.getDocumento());
        assertEquals("Ana", paciente.getNombres());
        assertEquals("Pérez", paciente.getApellidos());
        assertEquals("987654321", paciente.getTelefono());
        assertEquals("ana@mail.com", paciente.getCorreo());
    }

    @Test
    @DisplayName("Rechazar la creación de un paciente sin documento")
    void shouldRejectPatientWithoutDocument() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Paciente(
                        null,
                        "Ana",
                        "Pérez",
                        "987654321",
                        "ana@mail.com"
                )
        );
    }

    @Test
    @DisplayName("Debe rechazar un paciente sin nombres")
    void shouldRejectPatientWithoutNames() {
        assertThrows(IllegalArgumentException.class, () ->
                new Paciente("12345678", null, "Perez",
                        "987654321", "juan@gmail.com")
        );
    }

    @Test
    @DisplayName("Debe rechazar un paciente sin apellidos")
    void shouldRejectPatientWithoutSurnames() {
        assertThrows(IllegalArgumentException.class, () ->
                new Paciente("12345678", "Juan", null,
                        "987654321", "juan@gmail.com")
        );
    }

    @Test
    @DisplayName("Debe devolver correctamente los atributos del paciente")
    void shouldReturnCorrectPatientAttributes() {
        Paciente paciente = new Paciente(
                "12345678", "Juan", "Perez",
                "987654321", "juan@gmail.com"
        );

        assertEquals("12345678", paciente.getDocumento());
        assertEquals("Juan", paciente.getNombres());
        assertEquals("Perez", paciente.getApellidos());
        assertEquals("987654321", paciente.getTelefono());
        assertEquals("juan@gmail.com", paciente.getCorreo());
    }
}