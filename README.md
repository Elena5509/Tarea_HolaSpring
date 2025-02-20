Proyecto Spring Boot - Hola Spring

Este proyecto es una aplicación básica desarrollada con Spring Boot, que expone un endpoint REST para devolver un mensaje de bienvenida.

Descripción del Proyecto
El objetivo de este proyecto es demostrar el uso de Spring Boot con Spring Web para crear un servicio REST simple. Cuando se accede al endpoint, devuelve un mensaje de bienvenida: `"¡Hola Spring!"`.

Tecnologías Utilizadas
- Java
- Spring Boot (Spring Web)
- Maven
- Git

Estructura del Proyecto

mi-proyecto-spring/
	src/
		main/java/com/ejemplo/demo/
			DemoApplication.java
			controlador/
				HolaController.java
	pom.xml
	README.md

Configuración y Ejecución
Requisitos Previos
Para ejecutar este proyecto en un entorno local, se requiere:
- Java 17 o superior
- Maven

Pasos para Ejecutar
1. Abrir una terminal en la carpeta del proyecto.
2. Ejecutar el siguiente comando para compilar el proyecto:
   mvn clean package
3. Ejecutar la aplicación con:
   mvn spring-boot:run
4. Probar el endpoint REST:
   - Abrir un navegador web o Postman e ingresar la siguiente URL:
     http://localhost:8080/api/hola
   - Debería responder con el mensaje: "¡Hola Spring!"

Notas Adicionales
- Se puede modificar el mensaje de respuesta en `HolaController.java`.
- Para cambiar el puerto del servidor, edita `application.properties`.
- Este proyecto está disponible en GitHub como repositorio público.

Enlace al Repositorio
Puedes acceder al código fuente en el siguiente enlace:  
https://github.com/Elena5509/Tarea_HolaSpring
