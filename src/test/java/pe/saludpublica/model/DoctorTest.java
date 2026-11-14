
package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    @DisplayName("Debe crear un doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {
        Doctor doctor = new Doctor(
                "45678912", "Carlos", "Lopez", "CMP12345"
        );

        assertNotNull(doctor);
    }

    @Test
    @DisplayName("Debe rechazar un doctor sin documento")
    void shouldRejectDoctorWithoutDocument() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor(null, "Carlos", "Lopez", "CMP12345")
        );
    }

    @Test
    @DisplayName("Debe rechazar un doctor sin nombres")
    void shouldRejectDoctorWithoutNames() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("45678912", null, "Lopez", "CMP12345")
        );
    }

    @Test
    @DisplayName("Debe rechazar un doctor sin apellidos")
    void shouldRejectDoctorWithoutSurnames() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("45678912", "Carlos", null, "CMP12345")
        );
    }

    @Test
    @DisplayName("Debe rechazar un doctor sin colegiatura médica")
    void shouldRejectDoctorWithoutLicense() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("45678912", "Carlos", "Lopez", null)
        );
    }

    @Test
    @DisplayName("Debe devolver correctamente los atributos del doctor")
    void shouldReturnCorrectDoctorAttributes() {
        Doctor doctor = new Doctor(
                "45678912", "Carlos", "Lopez", "CMP12345"
        );

        assertEquals("45678912", doctor.getDocumento());
        assertEquals("Carlos", doctor.getNombres());
        assertEquals("Lopez", doctor.getApellidos());
        assertEquals("CMP12345", doctor.getColegiatura());
    }
}
