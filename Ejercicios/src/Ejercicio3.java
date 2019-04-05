import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero=0;
       for (int i=0;i<10;i++){
           if(i>5){
               System.out.println(numero);
               System.out.println("El break a diferencia del continue, esté nos saca del for directamente.");
               break;
           }else{
               numero+=i*2;
               System.out.println(numero);
               System.out.println("El continue lo que nos hace es empezar otra vuelta del for.");
               continue;
           }
       }
    }
}
