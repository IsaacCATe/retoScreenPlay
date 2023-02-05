# Screenplay Patron Gradle con Serenity BDD


Las pruebas web que encontrará aquí se ejecutan 
en la aplicación https://demo.serenity.is/Account/Login/?ReturnUrl=%2F y están organizadas
por función en paquetes en `src/test/java/co/choucair/retoPractico01/SerenityWeb`y `src/main/java/co/choucair/retoPractico01/SerenityWeb` 

De manera predeterminada, las pruebas se ejecutan
en Chrome, así que asegúrese de tener la última instancia de chromedriver en la ruta de su sistema.

La estructura general del proyecto para el Main se muestra a continuación:
````
+ exeception
     clases de modelo de execepciones
+ interactions
     Tareas de nivel bajo
+ Model
          clases de modelo de execepciones
+ preguntas
     Objetos utilizados para consultar la aplicación
+ tasks
    Objetos utilizados para realizar Tareas en la aplicacion
+ userinterface
    Propiedades utilizadas en la Pagian SerenityDemo
    
````
````

La estructura general del proyecto para el Test se muestra a continuación:
+ runner
  clases de runner que ejecutan propiedades de cucumber a travez de los tags.
+ stepdefinitions
  invoca los metodos predifinitos por el actor  utilizando packages presentes en `src/main/java/co/choucair/retoPractico01/SerenityWeb`
+ Resources 
+ driver
    Contiene el driver de chrome para ejecutar las pruebas
+ features
  pasos predefinidos en lenguaje gherkin para implemetar con cumcumber6
````

## Ejecutando el proyecto

Para ejecutar el proyecto, necesitará JDK 17 o 11 Minimo.
_ejecutar el runner tag prensente en el package runner automaticamente generara el reporte y la ejecucion de los escenarios.