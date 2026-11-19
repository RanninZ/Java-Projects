
/*INTERCAMBIO DE VARIABLES SIN UN 3ER VALOR */
/*Se piden 2 valors para las variables a y b, el objetivo es intercambiar sus valores (que "a" tome los valores de "b" y viceversa) 
pero con una regla estricta, no se puede usar una variable auxiliar ni otros trucos se debe lograr usando pura aritmeticca basica */

import java.util.Scanner;

public class inter_var {  // Inicio de la clase.
    public static void main (String [] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Declaracion del scanner.
        int a; // Declaracion de a.
        int b; // Declaracion de b.
        
        System.out.print("Dame el valor a:");
        a = e.nextInt(); // Scanner del valor a.
        System.out.print("Dame el valor de b: ");
        b = e.nextInt(); // Scanner del valor b.

        
        System.out.print("Estos son los valores originales: \n A= " +a +"\n B= "+b ); // Salida antes del proceso.
        a = a+b; // Suma principal como si tuvieramos una variable "total".

        b = a-b; // Resta para sacar "b".
        a = a-b; // Resta para sacar "a".

    
        
        
        System.out.print("\nEstos son los valores intercambiados: \n A= " +a +"\n B= "+b); // Salida despues del proceso.

        

        
    }
}
