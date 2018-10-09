
package boletin1_3;

import java.util.Scanner;


public class Boletin1_3 {

 
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       double euros=0,dolares=0,cambio=0;
       System.out.println("teclea euros: ");
       euros=ler.nextDouble();
       System.out.println("teclea cambio: ");//introducir con coma, no con punto
       cambio=ler.nextDouble();
       dolares=euros*cambio;
       System.out.println("dolares = "+dolares);
    }
    
}
