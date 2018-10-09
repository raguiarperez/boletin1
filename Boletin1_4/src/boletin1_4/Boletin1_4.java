
package boletin1_4;

import java.util.Scanner;

public class Boletin1_4 {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        float suma,resta,producto,cociente;
        System.out.println("introducir valor X");
        float x=ler.nextFloat();
        System.out.println("introducir valor Y");
        float Y= ler.nextFloat();
        
        suma=x+Y;
        resta=x+Y;
        producto=x*Y;
        cociente=x/Y;
        
       System.out.println(" suma:"+suma+"\n resta"+resta+"\n producto"+producto+"\n cociente"+cociente);
        
    }
    
}
