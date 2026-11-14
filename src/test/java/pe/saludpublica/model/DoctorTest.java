

package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    @DisplayName("Debe crear un doctor correctamente")
    void shouldCreateDoctorSuccessfully() {
        Doctor doctor = new Doctor(
                "12345678",
                "Juan",
                "Perez",
                "CMP12345",
                "CARDIOLOGIA"
        );

        assertNotNull(doctor);
    }

    @Test
    @DisplayName("No debe permitir documento nulo")
    void shouldThrowExceptionWhenDocumentIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor(null, "Juan", "Perez",
                        "CMP12345", "CARDIOLOGIA")
        );
    }

    @Test
    @DisplayName("No debe permitir nombres nulos")
    void shouldThrowExceptionWhenNamesAreNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("12345678", null, "Perez",
                        "CMP12345", "CARDIOLOGIA")
        );
    }

    @Test
    @DisplayName("No debe permitir apellidos nulos")
    void shouldThrowExceptionWhenSurnamesAreNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("12345678", "Juan", null,
                        "CMP12345", "CARDIOLOGIA")
        );
    }

    @Test
    @DisplayName("No debe permitir colegiatura nula")
    void shouldThrowExceptionWhenLicenseIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("12345678", "Juan", "Perez",
                        null, "CARDIOLOGIA")
        );
    }

    @Test
    @DisplayName("Debe obtener correctamente los datos del doctor")
    void shouldReturnDoctorInformation() {
        Doctor doctor = new Doctor(
                "12345678",
                "Juan",
                "Perez",
                "CMP12345",
                "CARDIOLOGIA"
        );

        assertEquals("12345678", doctor.getDocumento());
        assertEquals("Juan", doctor.getNombres());
        assertEquals("Perez", doctor.getApellidos());
        assertEquals("CMP12345", doctor.getColegiatura());
        assertEquals("CARDIOLOGIA", doctor.getEspecialidad());
    }

    @Test
    @DisplayName("No debe permitir especialidad nula")
    void shouldThrowExceptionWhenSpecialtyIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("12345678", "Juan", "Perez",
                        "CMP12345", null)
        );
    }
}
