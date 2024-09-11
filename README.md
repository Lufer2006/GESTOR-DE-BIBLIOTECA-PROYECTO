# Sistema de gestión de bibliotecas para escuelas

- Descripción general -

Estamos construyendo un sistema de gestión de bibliotecas para una escuela, con dos pantallas principales: una para los administradores y otra para los estudiantes. El sistema será una aplicación independiente, no una aplicación web, y se creará utilizando Java como lenguaje principal.

# Diseño de sistemas

El sistema constará de tres capas:

Capa de presentación
Creado con JavaFX para una interfaz gráfica de usuario fácil de usar
Maneja la interacción del usuario

# Capa de lógica empresarial
Implementado en Java
Gestiona datos de libros, préstamos y usuarios.

# Capa de datos
Utiliza una base de datos relacional (por ejemplo, MySQL o PostgreSQL)
Almacena y recupera datos del sistema

# Características del sistema

Pantalla de administrador
Administrar libros (agregar, eliminar, modificar)
Gestionar préstamos (añadir, eliminar, modificar)
Administrar usuarios (agregar, eliminar, modificar)
Generar informes de préstamos y libros

# Pantalla del estudiante
Busque libros por título, autor o categoría
Solicitar préstamo de libros
Ver historial de préstamos
Ver libros disponibles

---Tecnologías adicionales----

Base de datos: MySQL o PostgreSQL
Marco de interfaz gráfica de usuario: JavaFX
Lenguaje adicional: Python o JavaScript

----Estructura del proyecto-----

El proyecto se estructurará de la siguiente manera:

LibraryManagementSystem
src
main
java
com.example.librarymanagement
 AdministratorGUI.java
 UserGUI.java
 BusinessLogic.java
 DatabaseManager.java
resources
database.properties
fx
styles.css
images
...
test
java
com.example.librarymanagement
 AdministratorGUITest.java
 UserGUITest.java
 BusinessLogicTest.java
 DatabaseManagerTest.java
...
pom.xml (if using Maven)
