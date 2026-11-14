

package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {

    @Test
    @DisplayName("Debe crear una especialidad correctamente")
    void shouldCreateSpecialtySuccessfully() {
        Especialidad especialidad = new Especialidad(
                "Cardiologia",
                "Especialidad médica del corazón"
        );

        assertNotNull(especialidad);
    }

    @Test
    @DisplayName("No debe permitir nombre nulo")
    void shouldThrowExceptionWhenNameIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Especialidad(null, "Especialidad médica del corazón")
        );
    }

    @Test
    @DisplayName("Debe obtener correctamente los datos de la especialidad")
    void shouldReturnSpecialtyInformation() {
        Especialidad especialidad = new Especialidad(
                "Cardiologia",
                "Especialidad médica del corazón"
        );

        assertEquals("Cardiologia", especialidad.getNombre());
        assertEquals(
                "Especialidad médica del corazón",
                especialidad.getDescripcion()
        );
    }

    @Test
    @DisplayName("No debe permitir descripción nula")
    void shouldThrowExceptionWhenDescriptionIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Especialidad("Cardiologia", null)
        );
    }
}
