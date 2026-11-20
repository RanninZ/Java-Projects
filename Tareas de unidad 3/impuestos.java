/*Ingresar el sueldo de una persona, si supera los 3000 pesos para mostrar un mensaje en pantalla indicando que debe abonar impuestos. */

import java.util.Scanner; // Se importa la libreria del escaner.

public class impuestos { // Creamos la clase.
    public static void main (String [] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Definimos el escaner.
        double sueldo; // Definimos la variable.

        System.out.print("Ingresa tu sueldo: $"); // Imprimimos el mensaje para solicitar el sueldo.
        sueldo = e.nextDouble(); // Se lee la variable.
        if (sueldo>3000){ // Condicional donde se indica si el sueldo que se ingreso es mayor a 3000.
            System.out.print("Debes abonar impuestos."); // Salida final con el resultado.
        }
        e.close();
    }
}