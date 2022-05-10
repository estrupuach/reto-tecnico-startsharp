# reto_tecnico

A continuación se tiene como proposito realizar la automatización de pruebas para la página 
https://serenity.is/demo/ donde su fin es asegurar la calidad de la misma

Escenarios planteados para asegurar la calidad de la página:
####    (Iniciar sesion)
1.	Iniciar sesion satifactoriamente
2.	Como usuario con credenciales no validas no permitir el ingreso a la plataform
####    (Modulo Organization)
3.	Crear una nueva business Unit
####    (Modulo meeting)
4.	Crear una reunión asociada a la una business unit especifica
####    (StartDashBoard)
5.	lograr visualizar contenido especifico del dashboard (Módulo de demostración)
6.	Consultar un cliente 
7.	Modificar la información de un cliente y guardarla 
8.	Eliminar un cliente 
####    (Función profesional)
9.	Consultar unidad de negocio 
10.	Modificar la información de un unidad de negocio y guardarla 
11.	Eliminar unidad de negocio
####    Otras funcionalidades
13.	Cambiar idioma
14.	Cerrar sesión

## ¿Que se desarollo?
En el proyecto se automatizacion 2 escenarios y un background

1. Background : iniciar Sesion
2. Escenario 1: Crear Unidad de negocio
3. Escenario 2: Crear reunion asociada a la unidad de negocio


Se realizara smoke test a las siguientes secciones y/o funciones
1. Iniciar sesión
2. Crear una nueva unidad de negocio en Organizacion
3. Crear una nueva reunion asociada a la unidad de negocio anterior

Una vez pasado los smoke test, se inicia la creacion del codigo de la prueba automatizada

### Branching
1. Main : principal
2. develop : rama desarrollo
3. feature-reto : rama donde se desarrollara el reto tecnico designado
