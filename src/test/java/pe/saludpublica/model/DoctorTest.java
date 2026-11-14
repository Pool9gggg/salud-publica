
package pe.saludpublica.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    void DOC001_crearDoctorValido() {
        Doctor doctor = new Doctor(
                "45678912", "Carlos", "Lopez", "CMP12345"
        );

        assertNotNull(doctor);
    }

    @Test
    void DOC002_documentoNuloDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor(null, "Carlos", "Lopez", "CMP12345")
        );
    }

    @Test
    void DOC003_nombresNulosDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("45678912", null, "Lopez", "CMP12345")
        );
    }

    @Test
    void DOC004_apellidosNulosDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("45678912", "Carlos", null, "CMP12345")
        );
    }

    @Test
    void DOC005_colegiaturaNulaDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("45678912", "Carlos", "Lopez", null)
        );
    }

    @Test
    void DOC006_gettersDevuelvenDatosCorrectos() {
        Doctor doctor = new Doctor(
                "45678912", "Carlos", "Lopez", "CMP12345"
        );

        assertEquals("45678912", doctor.getDocumento());
        assertEquals("Carlos", doctor.getNombres());
        assertEquals("Lopez", doctor.getApellidos());
        assertEquals("CMP12345", doctor.getColegiatura());
    }
}
