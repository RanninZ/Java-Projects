/* Un estacionamiento cobra por tipo de vehículo mediante un código de una sola letra: coche (C), motocicleta (M) o autobús (A). 
Solicita el código e imprime la tarifa por hora: 
C = $3.00, M = $1.50, A = $6.00. 
Cualquier otra letra debe arrojar un error de vehículo no registrado. */

import java.util.Scanner; // Importacion de la libreria


public class estacionamiento {  // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable escaner
        char respuesta; // Declaracion de la variable 
        System.out.println("¿Que tipo de vehiculo es?:"); // Salida
        System.out.println("[C] Coche"); // Opcion 1
        System.out.println("[M] Motocicleta"); // Opcion 2 
        System.out.println("[A] Autobús"); // Opcion 3
        respuesta = e.next().charAt(0); // Entrada
        switch (respuesta){
            case 'C': // Si se ingreso C
                double c = 3.00;
                System.out.print("El costo del vehiculo tipo coche es de: $"+c); // Salida
                break;
            case 'M': // Si se ingreso M
                double m = 1.50;
                System.out.print("El costo del vehiculo tipo moto es de: $"+m); // Salida
                break;
            case 'A': // Si se ingreso A
                double a = 6.00;
                System.out.print("El costo del vehiculo tipo autobús es de: $"+a); // Salida
                break;
            default: // No se ingreso ninguno de los anteriores
                System.out.print("Error, vehiculo no registrado."); // Salida
        }
        e.close();
    } // Fin del metodo
} // Fin del programa