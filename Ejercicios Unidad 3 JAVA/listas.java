/*Realizar un programa que permita cargar dos listas de 15 valores cada una.
Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor 
mensajes:
"Lista 1 es mayor"
"Lista 2 es mayor"
"Las listas" */


import java.util.Scanner; // Importamos la libreria


public class listas { // Iniciamos el programa
    public static void main(String[] args){ // Iniciamos el metodo
        Scanner e = new Scanner(System.in); // Declaramos la lectura
        int a, b; // Declaramos las variables de entrada
        int totallista1 = 0; // El total de la lista 1
        int totallista2 = 0; // El total de la lista 2
        int i = 1; // Acumulador de la lista 1
        int c = 1;// Acumulador de la lista 2
        while (i<=15){ // Mientras i sea menor o igual a 15
            System.out.println("Ingrese la "+i+" cantidad de la primera lista: "); // Salida
            a = e.nextInt(); // Entrada
            totallista1 = totallista1 + a; // Proceso
            i++; // Acumulador i + 1
        }
        while (c<=15){ // Mientras c sea menor o igual a 15
            System.out.println("Ingrese la "+c+" cantidad de la segunda lista: "); // Salida
            b = e.nextInt(); // Entrada
            totallista2 = totallista2 + b; // Proceso
            c++; // Acumulador c + 1
        }
        if (totallista1>totallista2){ // Si la lista 1 es mayor
            System.out.println("La primera lista es mayor."); // Salida
        } else if (totallista2>totallista1){ //  Si la lista 2 es mayor
            System.out.println("La segunda lista es mayor."); // Salida
        } else { // Si son iguales
            System.out.println("Las 2 listas son iguales."); // Salida
        }
        e.close(); // Cierre de la variable de la lectura
    } // Fin del metodo
} // Fin del programa