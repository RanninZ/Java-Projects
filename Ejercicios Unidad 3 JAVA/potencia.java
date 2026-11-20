/*Ejercicio B: Cálculo de Potencia Manual
Calcular la potencia de un número de forma manual (sin usar libreria math). 
Solicitar la base y el exponente enteros, y utilizar un ciclo for para multiplicar la base por sí misma tantas veces como indique el exponente. */

import java.util.Scanner; // Importamos la liberia

public class potencia { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de lectura
        int a, b, t=1; // Declaracion de variables
        System.out.println("Ingresa el numero: "); // Salida
        a = e.nextInt(); // Entrada
        System.out.println("Ingresa a que potencia lo quieres elevar: "); // Salida
        b = e.nextInt(); // Entrada
        for (int i = 1; i<=b; i++){ // Ciclo donde si i llega a b se acaba
            t = t * a; // Proceso
        } // Fin del ciclo
        System.out.println(t); // Salida
        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo
} // Fin del programa
