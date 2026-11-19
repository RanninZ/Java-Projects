/*
Un banco aprueba préstamos si el cliente tiene ingresos mayores a $2,000 mensuales. 
No obstante, , se debe hacer una segunda pregunta interna sobre su historial crediticio ("bueno" o "malo"). 
Solo se otorga el préstamo si tiene ingresos altos e historial bueno. Si los ingresos son bajos, se rechaza directamente. */

import java.util.Scanner; // Importacion de la libreria.

public class credito { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Declaracion de la lectura
        int sueldo; // Declaracion de la variable.
        System.out.print("Ingresa tu sueldo total: $"); // Salida
        sueldo = e.nextInt(); // Entrada
        if (sueldo>2000){ // Si el sueldo es mayor a 2000
            System.out.println("Tu historial crediticio es: \n [B] Bueno \n [M] Malo"); // Salida
            char respuesta = e.next().charAt(0); // Entrada
            switch (respuesta){
                case 'B': // Si se ingresa 'B'
                    System.out.print("Se otorga el prestamo."); // Salida
                    break;
                case 'M': // Si se ingresa 'M'
                    System.out.print("Lo siento, no puede ser acreedor al prestamo."); // Salida
                default: // Si no se ingresa ninguna letra antes mencionada.
                    System.out.print("Valor no registrado.");
            }
            
        } else {
            System.out.print("Lo siento, no puede ser acreedor al prestamo."); // Salida
        }
        e.close();
    } // Fin del metodo
} // Fin del programa