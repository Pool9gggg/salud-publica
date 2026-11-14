
#
## Decisión de diseño: CIT-006

Para la creación de una cita médica, se decidió rechazar un estado nulo mediante una excepción IllegalArgumentException.

Esta decisión garantiza que toda cita médica se cree con un estado válido y evita mantener objetos con información incompleta.

El estado debe ser uno de los valores definidos en el enum EstadoCita:
- PROGRAMADA
- ATENDIDA
- CANCELADA
