# angular-js-blueprints-app

Este es un proyecto base para utilizar en la creación de los prototipos finales del curso de Arquitectura de Software ARSW de la Escuela Colombiana de Ingenieria.

Dos puntos claves a tener presente para el desarrollo de los prototipos

## Creación de Datos de Prueba
La creación de los datos de prueba se va hacer en memoria al momento de inicializar la clase que preveera los servicios de nuestra aplicación [ServiceFacade.java](https://github.com/DanielDiazRobles/angular-js-blueprints-app/blob/master/src/main/java/edu/eci/cosw/services/ServicesFacade.java)

En general un proyecto solo tendra una clase ServiceFacade y esta clase contendra las entidades asociadas al prototipo, en este misma clase hay un segmento de codigo en el que se inicializan las clases, como se muestra a continuación:
```java
    //Declaración de entidades asociadas al prototipo
    private static final Map<String,Blueprint> dummyBluePrints=new LinkedHashMap<>();
    
    //Segmento en el que se inicializa los datos de prueba del prototipo
    static{
        dummyBluePrints.put("larecta", new Blueprint("larecta",new Point[]{new Point(0,0),new Point(10,10)}));
        dummyBluePrints.put("rayon",new Blueprint("rayon",new Point[]{new Point(20,20),
                                                      new Point(30,30),
                                                      new Point(45,80)
        }));
        dummyBluePrints.put("poligono1",new Blueprint("poligono1",new Point[]{new Point(3,44),
                                                      new Point(66,34),
                                                      new Point(75,33),
                                                      new Point(100,100)
        }));    
    }
```
Esta aproximación es bastante limitada pero basada en los conocimientos adquiridos en el curso es suficiente para la creación de los prototipos deseados

## Cliente Angular super-ligero
Para el prototipo se espera usar el framework AngularJS 1.x de una forma bastante simple para agilizar el desarrollo de los prototipos el enfoque de los clientes va ser bastante simple y sin el uso de frameworks de enrutamiento como ui-router estos temas se veran en cursos posteriores.

Para ese proposito se coloca de manera de ejemplo en la base del webapp un [index.html](https://github.com/DanielDiazRobles/angular-js-blueprints-app/blob/master/src/main/webapp/index.html) y [app.js](https://github.com/DanielDiazRobles/angular-js-blueprints-app/blob/master/src/main/webapp/app.js) sencillos que permiten crear aplicaciones angular asociadas a un solo controlador y con vistas que se presentan o no bajo un conjunto de banderas (variables boolean).

Es importante notar que esta aproximación permite satisfacer los requerimientos de los prototipos finales del curso de ARSW pero tiene fuerte limitaciones al momento de ser usado en aplicaciones de mayor complejidad en las que se recomienda como buena practica la modularización de la aplicacion y el uso de frameworks que permitan tener una mejor gobernabilidad sobre el codigo de la capa cliente.
