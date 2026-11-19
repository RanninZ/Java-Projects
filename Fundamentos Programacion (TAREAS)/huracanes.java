/*Diseña un programa que reciba la velocidad del viento en km/h y 
determine la categoría de una tormenta de acuerdo a los siguientes rangos numéricos:

    Menor a 63 km/h: "Depresión Tropical"
    De 63 a 118 km/h: "Tormenta Tropical"
    Mayor a 118 km/h: "Huracán" */

import java.util.Scanner; // Importacion de la libreria
public class huracanes { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de escaner
        int viento; // Declaracion de la variable
        System.out.println("Ingresa la cantidad de velocidad: km/h"); // Salida
        viento = e.nextInt(); // Entrada
        if (viento < 63){ // Si el viento es menor a 63kmh/h
            System.out.print("Depresión Tropical"); // Salida

        } else if (viento >= 63 && viento <= 118){ // Si el viento es mayor o igual a 63km/h y viento es menor o igual a 118km/h
            System.out.print("Tormenta Tropical"); // Salida

        } else{ // Ultima opcion
            System.out.print("Huracán"); // Salida
        }

    } // Fin del metodo
} // Fin del programa