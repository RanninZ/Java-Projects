/*Problema 2: Mantener menu activo en pantalla hasta que el usuario elija la opcion de salir(3) */
import javax.swing.JOptionPane; // Importamos la libreria

public class dowhile2 { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String a_str; // Variable de cadena
        int a; // Variable real entera
        do{ // Hacer mientras a no sea igual a 3 
            // Salida
            a_str = JOptionPane.showInputDialog(null, "[1]Hackear la NASA \n [2]Hackear el ITD \n [3]Salir", "Menu jaker", JOptionPane.QUESTION_MESSAGE);
            // Entrada
            a = Integer.parseInt(a_str);

            switch (a){ // Switch de opciones dependiendo de lo que escribio
                case 1: // Si escribio 1
                    JOptionPane.showMessageDialog(null, "jejeje hackeado"); // Salida
                    break; // Ruptura del ciclo
                case 2: // Si escribio 2 
                    JOptionPane.showMessageDialog(null, "jejeje ya tienes 10 jeje"); // Salida
                    break; // Ruptura del ciclo
                case 3: // Si escribio 3
                    JOptionPane.showMessageDialog(null, "Saliendo del hackeo..."); // Salida
                    break; // Ruptura
                default: // Si no se escribe ninuna de las opciones anteriores
                    JOptionPane.showMessageDialog(null, "Error, invalido", "Error", JOptionPane.ERROR_MESSAGE); // Mensaje de error
                    break; // Ruptura
            } // Fin del switch
        } while (a!=3); // Fin del ciclo
    } // Fin del metodo
} // Fin del programa