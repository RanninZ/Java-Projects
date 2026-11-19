/*Un cajero automático pide una cantidad entera de dinero que el usuario
desea retirar. Calcule cuantos billetes de las denominaciones mas altas posibles se necesitan
para cubrir el monto total. Por ejemplo, billetes de 500, 200, 100, 50, 20. */

// Restricción: Sin condicionales.

import java.util.Scanner; //Importacion del scanner.



public class cajero_auto {
    public static void main (String[] args){ //Inicio del programa.
        Scanner e = new Scanner(System.in); // Declaración de la variable del scanner.
        int b500;
        int b100;
        int b200;   //Declaración de variables por cada billete.
        int b50;
        int b20;
        int resto; // Declaración de la cantidad del resto.
        int x; // Variable que vamos a usar para la entrada del total.
        

        
        
        System.out.print("Cuanto desea retirar: $"); // Pedir los datos.
        x = e.nextInt(); // Entrada de datos.
        resto = x; // Declarar el inicio del resto.
        
        b500 = resto/ 500;  // Se divide el resto por la cantidad de 500.
        resto = resto % 500; // Se obtiene el modulo y se repite el proceso.
        b200 = resto/ 200; // Se divide el resto por la cantidad de 200.
        resto = resto % 200; // Se obtiene el modulo y se repite el proceso.
        b100 = resto / 100; // Se divide el resto por la cantidad de 100.
        resto = resto % 100; // Se obtiene el modulo y se repite el proceso.
        b50 = resto/ 50; // Se divide el resto por la cantidad de 50
        resto = resto % 50; // Se obtiene el modulo y se repite el proceso.
        b20= resto/ 20; // Se divide el resto por la cantidad de 20.
        resto = resto % 20; // Se obtiene el modulo y se repite el proceso.
        
        
        
        
    
        //La salida de los datos.
        System.out.print("-----Cajero Automatico------ \n Billetes de 500: "+b500 + "\nBilletes de 200: "+b200+"\nBilletes de 100: "+b100+"\nBilletes de 50: "+b50+ "\nBilletes de 20: "+b20+"\n EL restante que no puede dar en billetes es de: "+resto);
        
        
    }
}
