# Caso de prueba de caja negra

## Funcionalidad: Añadir un servicio
### Caso: Añadir un servicio con observaciones vacías
**Entrada:**
- Código del servicio: 102
- Observaciones: "" (vacío)
- Fecha de inicio: 10/03/2022

**Resultado esperado:**
- El servicio se añade correctamente a la lista.
- Mensaje: "Servicio añadido correctamente."

# Caso de prueba de caja blanca

## Mostrado de datos de `mostrarServicios`

### Caso: Ruta donde la lista está vacía
**Ruta cubierta:** El bucle `for` no se ejecuta porque la lista está vacía.

**Entrada:** Lista de servicios vacía.

**Resultado esperado:**
- Mensaje: "Lista de servicios:"
