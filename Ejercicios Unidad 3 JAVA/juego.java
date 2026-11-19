/* Ejercicio 1: Adivina el numero de secreto  */
/*Problema: El programa guarda un numero secreto (por ejemplo el 42). El usuario debe intentar 
adivinarlo. En cada intento, el programa le da una pista diciendole si el numero que escribio es mayor 
o menor que el secreto. El ciclo se repite hasta que logre adivinando, mostrando el final cuantos intentos le tomó*/

import javax.swing.JOptionPane; // Importamos la liberia
public class juego{ // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String a_str; // Declaramos la variable de cadena
        int n = 67, a, i=0; // Declaramos la variable secreta, la de ingreso y los intentos
        do{ // Hacer mientras a no sea igual a n
            // Salida
            a_str = JOptionPane.showInputDialog(null, "Intenta adivinar el numero...", "Adivina adivinador", JOptionPane.QUESTION_MESSAGE);
            a = Integer.parseInt(a_str); // Entrada
            if(a<n){ // Si a es menor que n
                // Salida
                JOptionPane.showMessageDialog(null, "El numero que ingresaste es menoooor", "Adivina adivinador", JOptionPane.INFORMATION_MESSAGE);
            }else if(a>n){ // Si a es mayor que n
                // Salida
                JOptionPane.showMessageDialog(null, "El numero que ingresaste es mayooor", "Adivina adivinador", JOptionPane.INFORMATION_MESSAGE);

            } // Fin de la condicional
            i++; // Incremento de la variable i
        }while(a!=n); // Fin del ciclo
        // Salida
        JOptionPane.showMessageDialog(null, "67676767676767 ", "Adivina adivinador", JOptionPane.INFORMATION_MESSAGE);
        // Salida
        JOptionPane.showMessageDialog(null, "La cantidad de intentos fueron de: "+i);
        

    } // Fin del metodo
} // Fin del programa