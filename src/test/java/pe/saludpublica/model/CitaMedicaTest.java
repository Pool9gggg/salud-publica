
package pe.saludpublica.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CitaMedicaTest {

    @Test
    void CIT001_crearCitaMedicaValida() {
        CitaMedica cita = new CitaMedica(
                "PAC001",
                "DOC001",
                "ESP001",
                LocalDateTime.of(2026, 11, 20, 10, 30),
                EstadoCita.PROGRAMADA
        );

        assertNotNull(cita);
    }

    @Test
    void CIT002_idPacienteNuloDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        null, "DOC001", "ESP001",
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    void CIT003_idDoctorNuloDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", null, "ESP001",
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    void CIT004_idEspecialidadNuloDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", "DOC001", null,
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    void CIT005_fechaHoraNulaDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", "DOC001", "ESP001",
                        null, EstadoCita.PROGRAMADA
                )
        );
    }

    @Test
    void CIT006_estadoNuloDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(
                        "PAC001", "DOC001", "ESP001",
                        LocalDateTime.of(2026, 11, 20, 10, 30),
                        null
                )
        );
    }

    @Test
    void CIT007_conservarEstadoValido() {
        CitaMedica cita = new CitaMedica(
                "PAC001",
                "DOC001",
                "ESP001",
                LocalDateTime.of(2026, 11, 20, 10, 30),
                EstadoCita.PROGRAMADA
        );

        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }

    @Test
    void CIT008_gettersDevuelvenDatosCorrectos() {
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
