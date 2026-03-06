### Caso 2. Plataforma de cursos virtuales

## Integrantes
# Johan Smith Santamaria Fernandez
# Sharik Dayanna Rojas Ibarra
# Justin Daniela Bahamon Baloco
# Nicole Dayana Vargas Ramirez


Patrones obligatorios: Observer + Iterator + Singleton
Contexto
Una plataforma educativa necesita administrar cursos y notificar a estudiantes cada vez que se agregue nuevo contenido. Además, se debe poder recorrer el listado de módulos y lecciones.
Requerimiento funcional
Crear cursos
Registrar estudiantes
Suscribir estudiantes a cursos
Agregar módulos o lecciones
Recorrer contenidos del curso
Patrones a evidenciar
Observer: para notificar a estudiantes sobre nuevo contenido
Iterator: para recorrer módulos o lecciones sin exponer la estructura interna
Singleton: para un CourseCatalog centralizado
Qué debe mostrar en consola
Registro de curso y estudiantes
Notificación automática al agregar contenido
Recorrido ordenado de las lecciones
Evidencia esperada
Al agregar contenido, se dispara la notificación
Los contenidos se recorren mediante un iterador
El catálogo de cursos es único en toda la aplicación# CursosVirtuales


## Criterios de evaluación
Criterios de evaluación
1. Correcta implementación de patrones
El patrón está realmente aplicado
No solo existe por nombre de clase
2. Diseño orientado a objetos
Separación de responsabilidades
Extensibilidad
Cohesión y bajo acoplamiento
3. Funcionamiento en consola
Menú claro
Flujo usable
Entradas válidas y salida comprensible
4. Calidad de código
Nombres claros
Organización por paquetes
Legibilidad
5. Explicación técnica
Justifica por qué usó ese patrón
Explica cómo interactúan entre sí
6. Requeriminetos ajustados
7. Historias de usuario
8. Casos de uso
9. Diagrama de clases
10. Uso de git y presentacion en pdf