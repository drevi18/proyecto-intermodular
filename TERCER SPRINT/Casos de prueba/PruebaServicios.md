# Casos de prueba de caja negra

Los casos de prueba de caja negra se basan en los requisitos y funcionalidades del programa, sin considerar la implementación interna.

## Funcionalidad: Añadir un servicio

### Caso 1: Añadir un servicio con datos válidos
**Entrada:**
- Código del servicio: 101
- Observaciones: "Servicio de limpieza"
- Fecha de inicio: 15/04/2023

**Resultado esperado:**
- El servicio se añade correctamente a la lista.
- Mensaje: "Servicio añadido correctamente."

### Caso 2: Añadir un servicio con observaciones vacías
**Entrada:**
- Código del servicio: 102
- Observaciones: "" (vacío)
- Fecha de inicio: 10/03/2022

**Resultado esperado:**
- El servicio se añade correctamente a la lista.
- Mensaje: "Servicio añadido correctamente."

## Funcionalidad: Mostrar servicios

### Caso 3: Mostrar servicios cuando la lista está vacía
**Entrada:** Lista de servicios vacía.

**Resultado esperado:**
- Mensaje: "Lista de servicios:" seguido de ninguna línea adicional.

### Caso 4: Mostrar servicios con datos en la lista
**Entrada:** Lista de servicios con:
- Servicio 1: Código 101, Observaciones "Servicio de limpieza", Fecha de inicio 15/04/2023
- Servicio 2: Código 102, Observaciones "Servicio de jardinería", Fecha de inicio 10/03/2022

**Resultado esperado:**
- Mensaje que muestra los detalles de los servicios en la lista.

## Funcionalidad: Eliminar un servicio

### Caso 5: Eliminar un servicio con índice válido
**Entrada:**
- Lista de servicios con:
  - Servicio 1: Código 101, Observaciones "Servicio de limpieza", Fecha de inicio 15/04/2023
  - Servicio 2: Código 102, Observaciones "Servicio de jardinería", Fecha de inicio 10/03/2022
- Índice a eliminar: 0

**Resultado esperado:**
- El servicio con índice 0 se elimina correctamente.
- Mensaje: "Servicio eliminado correctamente."

### Caso 6: Eliminar un servicio con índice inválido
**Entrada:**
- Lista de servicios con:
  - Servicio 1: Código 101, Observaciones "Servicio de limpieza", Fecha de inicio 15/04/2023
- Índice a eliminar: 5

**Resultado esperado:**
- Mensaje: "Índice no válido."

---

# Casos de prueba de caja blanca

Los casos de prueba de caja blanca se basan en la estructura interna del código y buscan cubrir todas las rutas posibles.

## Cobertura de condiciones en `anyadirServicio`

### Caso 1: Ruta donde se añaden datos válidos
**Ruta cubierta:** Se ejecuta el bloque donde se añaden los datos del servicio.

**Entrada:**
- Código del servicio: 101
- Observaciones: "Servicio de limpieza"
- Fecha de inicio: 15/04/2023

**Resultado esperado:**
- El servicio se añade correctamente.

## Cobertura de condiciones en `mostrarServicios`

### Caso 2: Ruta donde la lista está vacía
**Ruta cubierta:** El bucle `for` no se ejecuta porque la lista está vacía.

**Entrada:** Lista de servicios vacía.

**Resultado esperado:**
- Mensaje: "Lista de servicios:"

### Caso 3: Ruta donde la lista tiene datos
**Ruta cubierta:** El bucle `for` se ejecuta para cada servicio en la lista.

**Entrada:** Lista de servicios con:
- Servicio 1: Código 101, Observaciones "Servicio de limpieza", Fecha de inicio 15/04/2023

**Resultado esperado:**
- Mensaje que muestra los detalles de los servicios en la lista.

## Cobertura de condiciones en `eliminarServicio`

### Caso 4: Ruta donde el índice es válido
**Ruta cubierta:** La condición `if (indice >= 0 && indice < servicios.size())` es verdadera.

**Entrada:**
- Lista de servicios con:
  - Servicio 1: Código 101, Observaciones "Servicio de limpieza", Fecha de inicio 15/04/2023
- Índice a eliminar: 0

**Resultado esperado:**
- El servicio se elimina correctamente.

### Caso 5: Ruta donde el índice es inválido
**Ruta cubierta:** La condición `if (indice >= 0 && indice < servicios.size())` es falsa.

**Entrada:**
- Lista de servicios con:
  - Servicio 1: Código 101, Observaciones "Servicio de limpieza", Fecha de inicio 15/04/2023
- Índice a eliminar: 5

**Resultado esperado:**
- Mensaje: "Índice no válido."
