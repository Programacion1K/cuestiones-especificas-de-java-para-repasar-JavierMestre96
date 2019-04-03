package utilidades.numeros;

public class Numero {
    public static boolean esCuadradoPerfecto(int numero){
        double raizCuadrada = Math.sqrt(numero);
        if(Math.pow(raizCuadrada,2)==numero){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(esCuadradoPerfecto(4));
        System.out.println(esCuadradoPerfecto(3));
    }
}
