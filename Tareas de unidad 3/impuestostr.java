/*Ingresar el sueldo de una persona, si supera los 3000 pesos para mostrar un mensaje en pantalla indicando que debe abonar impuestos. */

import javax.swing.JOptionPane; // Se importa la libreria del escaner.

public class impuestostr { // Creamos la clase.
    public static void main (String [] args){ // Inicio del metodo.
        double sueldo; // Definimos la variable.
        String sueldoStr; // Definimos la variable de salida.

        sueldoStr = JOptionPane.showInputDialog("Ingrese el sueldo: $"); // Definimos la cadena de texto en una funcion de salida.
        sueldo = Double.parseDouble(sueldoStr); // Convertimos la variable de salida en una varialbe original
        
        if (sueldo>3000){ // Condicional donde se indica si el sueldo que se ingreso es mayor a 3000.
            JOptionPane.showMessageDialog(null, "Usted tiene que abonar impuestos."); // Mensaje de salida final.
        }
    }
}
