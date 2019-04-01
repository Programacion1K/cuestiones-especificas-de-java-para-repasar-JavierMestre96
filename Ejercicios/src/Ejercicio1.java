public class Ejercicio1 {
    public static void main(String[] args) throws InterruptedException {
        boolean esFalso = false;
        //Ejemplo operador &
        if (esFalso & detieneTiempo()) {
            System.out.println("En este caso, el operador & comprueba las dos condiciones y " +
                    "aunque la primera sea false. El tiempo es detenido.");
        }

        //Ejemplo Operador &&
        if (esFalso && detieneTiempo()) {
            System.out.println("En este caso, el operador && no comprueba las dos condiciones " +
                    "ya que al ser una falsa, la otra no se ejecuta y el tiempo no se para.");
        }

        //Operador ||
        boolean esVerdadero = true;
        if (esVerdadero | detieneTiempo()) {
            System.out.println("El operador | comprueba las dos condiciones aunque la primera se cumpla.");
        }
        if (esVerdadero || detieneTiempo()) {
            System.out.println("El operador || no comprueba las dos condiciones," +
                    " ya que si se cumple una, la otra no es comprobada y en este caso, el tiempo no se detiene.");
        }

    }

    public static boolean detieneTiempo() throws InterruptedException {
        Thread.sleep(4000);
        return true;
    }
}
