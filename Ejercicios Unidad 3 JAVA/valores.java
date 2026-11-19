/*Desarrollar un programa que permita la carga de 10 valores por teclado 
y nos muestre posteriormente la suma de los valors ingresados y su promedio. */

import java.util.Scanner; // Importamos la libreria

public class valores{ // Iniciamos el programa
    public static void main(String[] args){ // Iniciamos el metodo
        Scanner e = new Scanner(System.in); // Inic
        int suma=0, a;
        for(int i=1; i<=10; i++){
            System.out.println("Imprime el valor #"+i);
            a = e.nextInt();
            suma+=a;
        }
        System.out.println("La suma total de los valores es de: "+suma);
        e.close();
    }
}

