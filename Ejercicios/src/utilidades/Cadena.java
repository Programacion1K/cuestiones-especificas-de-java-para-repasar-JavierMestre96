package utilidades;/*

## 2. Packages

¿Qué es un package en Java?

¿Qué relación tiene con la sentencia import?

Crea un paquete llamado utilidades con una clase llamada Cadena con dos Métodos Estáticos:

* inicialEnMayúcula, que devuelve el String que se le pasa con el primer carácter en mayúsculas y el resto en minúsculas
* camelCase que devuelve las palabras (separadas por espacios) en camelCase (la primera palabra en minúsculas y el resto con la inicial en mayúsculas)

Crea, dentro de ese paquete llamado numeros con una clase llamada Numero con un  método Estático:

* esCuadradoPerfecto que devuelve si un entero que se le pasa es cuadrado perfecto (la raíz del número es un entero)
Crea un programa de ejemplo en otro paquete que importe y utilice esos métodos

 */

public class Cadena {
    public static String inicialEnMayuscula(String cadena){
        String salida="";
        for(int i=0;i<cadena.length();i++){
            if(i==0){
                salida+=cadena.toUpperCase().charAt(i);
            }else{
                salida+=cadena.charAt(i);
            }
        }
        return salida;
    }
    public static String camelCase(String cadena){
        String salida=""+cadena.charAt(0);

        for(int i=1;i<cadena.length();i++) {
            cadena.toLowerCase();
            if (cadena.charAt(i - 1) == ' ') {
                salida += cadena.toUpperCase().charAt(i);
            } else {
                salida += cadena.charAt(i);
            }
        }

        return salida;
    }


    public static void main(String[] args) {
        System.out.println(inicialEnMayuscula("un paquete es un contenedor de clases que nos permite agrupar las distintas partes que tiene un programa," +
                " definiendo la ubicación de dichas clases en un directorio de estructura jerárquica."));
        System.out.println(inicialEnMayuscula("la relación que tiene la sentencia import es que es necesario importar "
        +"primero el paquete para poder usar así las clases encontradas dentro del mismo."));
        System.out.println(camelCase("esto es una prueba de camel case"));
    }
}