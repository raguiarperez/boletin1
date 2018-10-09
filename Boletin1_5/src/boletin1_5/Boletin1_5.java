
package boletin1_5;

import java.util.Scanner;

public class Boletin1_5 {


    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        float metros;
        System.out.println("introducir valor millas");
        float millas=ler.nextFloat();
        
       metros=millas*1852;
        System.out.println("millas marinas = "+metros+" metros");
       
    }
    
}
