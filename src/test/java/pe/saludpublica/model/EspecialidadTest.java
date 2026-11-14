

package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {

    @Test
    @DisplayName("Debe crear una especialidad con nombre válido")
    void shouldCreateSpecialtyWithValidName() {
        Especialidad especialidad = new Especialidad("Cardiologia");

        assertNotNull(especialidad);
    }

    @Test
    @DisplayName("Debe rechazar una especialidad sin nombre")
    void shouldRejectSpecialtyWithoutName() {
        assertThrows(IllegalArgumentException.class, () ->
                new Especialidad(null)
        );
    }

    @Test
    @DisplayName("Debe devolver correctamente el nombre de la especialidad")
    void shouldReturnCorrectSpecialtyName() {
        Especialidad especialidad = new Especialidad("Cardiologia");

        assertEquals("Cardiologia", especialidad.getNombre());
    }
}
