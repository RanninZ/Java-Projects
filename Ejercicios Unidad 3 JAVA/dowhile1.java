/*Problema 1: Obligar al usuario a ingresar un numero mayor a cero, repitiendo la petición si se equivoca */

import javax.swing.JOptionPane; // Importamos la liberia de lectura


public class dowhile1 { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String a_str; // Variable de cadena
        int a; // Variable real entera
        do{ // Hacer esto mientra a sea igual o menor que 0
            a_str= JOptionPane.showInputDialog(null, "Ingresa el numero positivo"); // Salida
            a = Integer.parseInt(a_str); //Entrada
            if(a<=0){ // Si a es menor o igual a 0
                JOptionPane.showMessageDialog(null, "Error, numero invalido"); // Salida

            } // Fin de la condicional
        }while(a<=0); // Fin del ciclo
    } // Fin del metodo
} // Fin del programa