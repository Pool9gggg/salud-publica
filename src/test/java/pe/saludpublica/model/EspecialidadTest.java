
package pe.saludpublica.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {

    @Test
    void ESP001_crearEspecialidadValida() {
        Especialidad especialidad = new Especialidad("Cardiologia");

        assertNotNull(especialidad);
    }

    @Test
    void ESP002_nombreNuloDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new Especialidad(null)
        );
    }

    @Test
    void ESP003_getterDevuelveNombreCorrecto() {
        Especialidad especialidad = new Especialidad("Cardiologia");

        assertEquals("Cardiologia", especialidad.getNombre());
    }
}
