# generalJava2019
Apuntes generales sobre algunas cuestiones de Java

# Resolver antes del viernes 25 de marzo de 2019, mencionándome en los commit
Contestar a las preguntas en el propio readme. Cuando se pida un programa, se puede añadir al repositorio

## 1. Operadores Booleanos

¿Qué diferencia hay en una expresión booleana entre & y &&?

¿Y entre | y ||?

Haz dos métodos booleanos que impriman algo en pantalla y un programa main que muestre la diferencia. Puedes hacer una prueba más creativa usando
```java
Thread.sleep(4000);
```
que recibe el número de milisegundos que espera el programa
¿Cuándo se usará uno u otro?



## 2. Packages

¿Qué es un package en Java?

¿Qué relación tiene con la sentencia import?

Crea un paquete llamado utilidades con una clase llamada Cadena con dos Métodos Estáticos:

* inicialEnMayúcula, que devuelve el String que se le pasa con el primer carácter en mayúsculas y el resto en minúsculas
* camelCase que devuelve las palabras (separadas por espacios) en camelCase (la primera palabra en minúsculas y el resto con la inicial en mayúsculas)

Crea, dentro de ese paquete llamado numeros con una clase llamada Numero con un  método Estático:

* esCuadradoPerfecto que devuelve si un entero que se le pasa es cuadrado perfecto (la raíz del número es un entero)
Crea un programa de ejemplo en otro paquete que importe y utilice esos métodos

## 3. Break y continue con etiquetas

Pon un programa de ejemplo de uso de break y/o continue con etiquetas

## 4. Finalize

¿Para qué sirve el método finalize() de la clase Object?

¿Cuándo es llamado?

¿Para qué se usa?

## 5. Métodos de la clase Math

Indica la signatura de los siguientes métodos de la clase Math y explica para qué sirve

```java
abs, max,min,pow,round
```

## 6. Inicilizadores

```java
public class PruebaSleep {
  static{
    System.out.println("Una cadena");
  }
  {
    System.out.println("prueba");
  }
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Numeros: 1 2 3");
  }
}
```
En el programa anterior, ¿Cuál es la salida?
¿Cómo conseguimos que se imprima prueba?

¿Cuantas veces se imprimirá en un programa "Una Cadena"?

¿Y "prueba"?

## 7. Recolector


¿Para qué sirve System.gc()?

¿Cuando se le llama?

¿Qué nos asegura?

## 8. Wrappers

¿Qué son los Wrappers?

¿Cuántos hay?

¿Para qué sirven?

¿Qué constructores tienen?

¿Para qué sirven los métodos xxxValue()?

¿Para qué sirven y en qué se diferencian los métodos parseXxx y valueOf()?

¿Qué es Boxing y Autoboxing?

Haz un programa de ejemplo que tome un color CSS en hexadecimal (#45AB34 o #FFF, por ejemplo) y devuelva el color en RGB decimal: #FFF sería 255,255,255

Supón que el color es siempre correcto (con seis o tres dígitos headecimales)

## 9. Concatenación de cadenas


¿Cómo hemos estado concatenado las cadenas durante el curso?

¿Qué inconvenientes tiene ese método?

Busca un ejemplo de concatenación de cadenas con StringBuffer y otro con StringBuilder

¿Qué diferencia hay entre los dos métodos?

Usando el método 
```java
System.currentTimeMillis();
```
que devuelve el tiempo en milisegundos, crea un programa que muestre la diferencia en tiempo entre usar los tres métodos de concatenación (Se guarda el tiempo antes de efectuar una operación y al tiempo que se obtiene después de efectuar la operación se le resta el que habíamos guardado.)

¿Cuál es el que usaremos a partir de ahora?

## 10. Fechas en Java


Con la información disponible en el siguiente artículo:
http://www.oracle.com/technetwork/es/articles/java/paquete-java-time-2390472-esa.html



Haz un programa que te diga en qué día de la semana caerá tu cumpleaños los próximos diez años.
