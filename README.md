# GeoNotesTeaching (Java 21)

Proyecto docente con Java clásico + moderno (records, sealed, text blocks, switch expression, pattern matching).
Incluye Gradle Wrapper (scripts) para facilitar la ejecución.

## Ejecutar
- IntelliJ: Abrir carpeta y ejecutar tarea Gradle `run` o `examples`.
- Terminal:
  ```bash
  ./gradlew run
  ./gradlew examples
  ```


---


## Bloque A

### A2 Comparar LegacyPoint con GeoPoint

#### Comparación entre `record` y clase tradicional

##### Ventajas de usar `record`:

- **Menos código repetitivo**: Los `records` generan automáticamente los métodos `equals()`, `hashCode()` y `toString()` basados en los campos, eliminando la necesidad de implementarlos manualmente.
- **Simplificación del código**: Los `records` permiten escribir menos código repetitivo, especialmente cuando solo se necesita almacenar datos.
- **Validación en el constructor**: Puedes agregar lógica adicional en el constructor para validaciones o transformaciones (como las restricciones en latitud y longitud).

##### Cuándo NO usar `record`:

- **Lógica compleja de `equals()`, `hashCode()`, o `toString()`**: Si necesitas personalizar estos métodos, un `record` no es ideal.
- **Necesidad de herencia o extensibilidad**: Los `records` no pueden extender otras clases. Si necesitas crear una jerarquía compleja, es mejor usar una clase normal.
- **Mutabilidad**: Si necesitas que los objetos puedan cambiar de valor después de que se inicialicen.

##### Conclusión:
Usar un `record` como `GeoPoint` es adecuado cuando se necesita almacenar datos de manera inmutable con validaciones simples. Si tu clase requiere lógica compleja, herencia o mutabilidad, una clase tradicional como `LegacyPoint` es más apropiada.
