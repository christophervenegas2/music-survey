# Aplicacion de encuesta de "Gustos Musicales"

En este proyecto se busca poder obtener informacion de los gustos musicales, registrandolos en base de datos y mostrandolos por la app.

## Info de desarrollo

Este proyecto fue desarrollado con Angular v15.0.4 y SpringBoot v3.0.3, con java v17.
Su base de datos es MySql.

## Como configurar el ambiente

### 1. Base de datos 
  
  Para configurar la base de datos se debe instalar MySql, asegurarse que el puerto 3306 este abierto para el despliegue de este.
  La base de datos que vamos a crear debe llamarse 'db_test_survey' o poner el nombre que ustedes deseen pero cambiar esta parte del codigo en el backend:
  
  Ruta: Encuesta\back-survey\src\main\resources\application.properties

  IMG

### 2. BackEnd

  Para levantar el backend se debe verificar que la version de nuestro JDK (Java Development Kit) sea el indicado para este backend.
  Recomiendo la version 18.0.2.1, que es con la cual se pudo desarrollar el proyecto.
  Si levantamos el proyecto por vscode, no deberia haber problemas para levantar el codigo, mientras usemos los extensiones correpondiente para Spring boot.
  Pero si levantamos por otro tipo de Cli, debemos realizar un 'maven clean' y un 'maven update', al proyecto.
  Luego levantamos el proyecto por la Cli y ya estariamos con nuestro proyecto andando.

### 3. FrontEnd

  Para el Frontend debemos ejecutar el comando 'npm install' para poder instalar las dependencias del proyecto.
  Terminando esto debemos ejecutar el comando 'npm start' y ya tendriamos levantado el FrontEnd.

## Como usar

  Esta aplicacion tiene bastantes menus en los cuales estos son:

### Encuesta

  El cual nos permite realizar la encuesta ingresando el tipo de musica favorita y el correo del usuario.

### Resultados

  En este apartado posee bastante informacion respecto a la encuesta, como los resultados como un grafico interactivo.

### Acerca de

  El apartado final es el 'Acerca de', el cual nos explica con detalle las tecnologias utilizadas y las personas detras de este desafio.

# Muchas Gracias
