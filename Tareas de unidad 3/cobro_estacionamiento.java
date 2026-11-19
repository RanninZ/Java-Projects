import java.util.Scanner; // Importacion de la liberia


public class cobro_estacionamiento { // Inicio del programa
    public static void main (String[] args) { // Inicio del metodo
        Scanner a = new Scanner(System.in); // Declaracion de la variable escaner

        int horas; // Variable de horas enteras
        double aPagar; // Variable del pago con decimal

        System.out.print("Teclea la cantidad de horas");  // Salida
        horas = a.nextInt(); // Entero

        aPagar = horas*15; // Proceso

        System.out.print("Pago total: $"+aPagar); // Salida
        a.close(); // Cierre de la variable de escaner
    } // Fin del metodo

    
} // Fin del programa
