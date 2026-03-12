Caso 2. Plataforma de cursos virtuales
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
El catálogo de cursos es único en toda la aplicación