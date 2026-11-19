/*Se cargan por teclado tres numeros distitntos. Mostrar por pantalla el mayor de ellos */

import java.util.Scanner;


public class nummayor_ej {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Ingrese el numero 1: ");
        num1 = e.nextDouble();
        System.out.println("Ingrese el numero 2: ");
        num2 = e.nextDouble();
        System.out.println("Ingrese el numero 3: ");
        num3 = e.nextDouble();

        if (num1>num2 & num1>num3){
            System.out.print("El numero mayor es: "+num1);

        }else if(num2>num3){
            System.out.print("El numero mayor es: "+num2);
        }else{
            System.out.print("El numero mayor es: "+num3);
        } 
            
    }
}
