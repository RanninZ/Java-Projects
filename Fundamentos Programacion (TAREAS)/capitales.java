/*Desarrolla un programa que le pida al usuario escribir el nombre de un país de Latinoamérica en texto 
(por ejemplo: "México", "Colombia", "Argentina", "Perú") y responda con su capital correspondiente usando switch.
 */


import java.util.Scanner; // Importamos libreria.

public class capitales { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion del escaner
        System.out.println("--- CAPITALES LATINOS ---"); // Titulo
        System.out.println("Ingresa el nombre de un pais: "); // Salida
        String pais = e.nextLine(); // Entrada
        switch (pais.toLowerCase()) { 
            case "mexico", "méxico": // Si se escribe "Mexico" o "México"
                System.out.print("CDMX"); // Salida
                break;
            case "colombia": // Si se escribe "Colombia"
                System.out.print("Bogota"); // Salida
                break;
            case "argentina": // Si se escribe "Argentina"
                System.out.print("Buenos Aires"); // Salida
                break;
            case "peru", "perú": // Si se escribe "Perú" o "Peru"
                System.out.print("Lima"); // Salida
                break;  
            default: // Si se escribe otro pais.
                System.out.print("Pais no registrado.");
        }
        e.close();
    } // Fin del metodo
} // Fin del programa
