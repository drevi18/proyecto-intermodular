# Casos de Prueba

## Caso de prueba de caja blanca

**Objetivo:**  
Probar el método `gestionarRecibos` asegurando que todas las ramas del código se ejecuten.

**Escenario:**  
Ejecutar el método `gestionarRecibos` con las siguientes entradas:

1. **Opción [1]** para añadir un recibo con los datos:
   - Código: 101  
   - Mes: 5  
   - Dinero: 150.75  

2. **Opción [2]** para eliminar el recibo con código **101**.

3. **Opción [3]** para consultar los recibos (debería estar vacío después de eliminar).

4. **Opción [0]** para salir.

**Pasos:**

1. Llamar al método `gestionarRecibos`.  
2. Introducir las opciones y datos mencionados.  
3. Verificar que:
   - El recibo se añade correctamente.  
   - El recibo se elimina correctamente.  
   - La lista de recibos está vacía tras la eliminación.

**Resultado esperado:**

- El recibo se añade y elimina correctamente.  
- La lista de recibos está vacía tras la eliminación.  
- El programa vuelve al menú principal al seleccionar [0].

---

## Caso de prueba de caja negra

**Objetivo:**  
Probar el comportamiento del sistema con entradas válidas e inválidas para el método `gestionarPresupuestos`.

**Escenario:**  
Ejecutar el método `gestionarPresupuestos` con las siguientes entradas:

1. **Opción [1]** para crear un presupuesto con los datos:
   - Comunidad: `"Comunidad A"`  
   - Año: 2025  
   - Ingresos estimados: 5000.00  
   - Gastos estimados: 3000.00  

2. **Opción [2]** para mostrar los presupuestos.  
3. **Opción [0]** para salir.  

**Probar entradas inválidas:**

- Introducir un año negativo (`-2025`).  
- Introducir un monto de ingresos no numérico (`abc`).

**Pasos:**

1. Llamar al método `gestionarPresupuestos`.  
2. Introducir las opciones y datos mencionados.  
3. Verificar que:
   - El presupuesto se añade correctamente con entradas válidas.  
   - El sistema maneja entradas inválidas mostrando un mensaje de error.

**Resultado esperado:**

- El presupuesto se añade correctamente con entradas válidas.  
- El sistema muestra un mensaje de error para entradas inválidas y solicita reintentar.

---

## Caso de prueba de integración

**Objetivo:**  
Probar la integración entre los métodos `gestionarRecibos` y `gestionarDevoluciones`.

**Escenario:**  

1. Añadir un recibo usando `gestionarRecibos` con los datos:
   - Código: 202  
   - Mes: 6  
   - Dinero: 200.00  

2. Devolver el recibo usando `gestionarDevoluciones` con los datos:
   - ID del recibo: 202  
   - Motivo: `"Pago duplicado"`

**Pasos:**

1. Llamar al método `gestionarRecibos` y añadir el recibo.  
2. Llamar al método `gestionarDevoluciones` y devolver el recibo.  
3. Verificar que:
   - El recibo aparece en la lista de devoluciones.  
   - Los datos del recibo devuelto son correctos.

**Resultado esperado:**

- El recibo se añade correctamente a la lista de recibos.  
- El recibo devuelto aparece en la lista de devoluciones con los datos correctos.
