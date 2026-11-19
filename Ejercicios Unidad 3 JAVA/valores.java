/*Desarrollar un programa que permita la carga de 10 valores por teclado 
y nos muestre posteriormente la suma de los valors ingresados y su promedio. */

import java.util.Scanner; // Importamos la libreria

public class valores{ // Iniciamos el programa
    public static void main(String[] args){ // Iniciamos el metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de lectura
        int suma=0, a; // Declaracion de las variables
        for(int i=1; i<=10; i++){ // para que se mantenga inciado el contador no tiene que superar 10
            System.out.println("Imprime el valor #"+i); // Salida
            a = e.nextInt(); // Entrada
            suma+=a; // Suma total
        }
        System.out.println("La suma total de los valores es de: "+suma); // Salida
        e.close(); // Cierre de la variable
    } // Fin del metodo
} // Fin del programa

