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



# Caso de prueba de integración

## Preparación inicial
- Crear empresa:
  - Código: 1, CIF: 12345678, Nombre: "Empresa de Limpieza", Teléfono: 987654321
- Crear encargado:
  - Nombre: "Juan Pérez", Fecha de inicio: 15/04/2023

## Añadir servicio
- Código: 101, Observaciones: "Limpieza semanal", Fecha de inicio: 20/04/2023
- Asociar el servicio a:
  - Empresa: "Empresa de Limpieza"
  - Encargado: "Juan Pérez"

## Mostrar servicios
- Verificar que el servicio aparece con los datos correctos.

## Eliminar el servicio
- Borrar el servicio con código **101**.
- Verificar que la empresa y el encargado siguen existiendo.

---

## Resultados esperados

### Añadir servicio
- Mensaje: "Servicio añadido correctamente."
- El servicio se muestra en la lista con los datos de la empresa y el encargado.

### Mostrar servicios
- Mensaje: Los datos del servicio se ven correctamente.

### Eliminar servicio
- Mensaje: "Servicio eliminado correctamente."
- La lista de servicios queda vacía, pero:
  - La empresa y el encargado permanecen en sus respectivas listas.

---

