/* Generador de tablas de multiplicar */
/*Solicitar al usuario un numero entero y generar su tabla de multiplicar del 1 al 10 */

import javax.swing.JOptionPane; // Importamos la libreria

public class tablasm { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String m_str, c=""; // Declaramos la variable de cadena
        int a, m; // Declaramos las variables enteras.
        m_str=JOptionPane.showInputDialog(null, "Ingresa el numero que quieres conocer su multiplicacion:", "tablas de multiplicar", JOptionPane.QUESTION_MESSAGE); //Cual numero se mutiplicara
        m = Integer.parseInt(m_str); // Convertimos a su variable entera
        for (int i = 1; i<=10; i++){ // Ciclo sumandose hasta 10
            a=i*m; // Proceso
            c = c+"\n El numero x"+i+" es de: "+a; // Concatenacion de la salida
            
            
        } // Fin del ciclo
        JOptionPane.showMessageDialog(null, c, "Tablas de multiplicacion", JOptionPane.INFORMATION_MESSAGE); // Salida
    } // Fin del metodo
} // Fin del programa