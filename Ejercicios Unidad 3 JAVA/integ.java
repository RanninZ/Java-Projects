/*Escribir un programa que lea 10 números enteros y luego muestre cuantos valores integrados 
fueron multiplos de 3 y cuantos de 5. 
Debemos tomar en cuenta que hay numeros que son multiplos de 3 y de 5 a la vez. */
import javax.swing.JOptionPane; // Importamos la liberia.

public class integ { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String a_str; // Variable cadena
        int mult3=0, mult5=0, ambos=0, a; // Variables totales
        for (int i=1; i<=10; i++){ // Ciclo del 1 al 10
            a_str = javax.swing.JOptionPane.showInputDialog(null, "Ingrese el valor #"+i, "Multiplos :)", JOptionPane.QUESTION_MESSAGE ); // Pide el valor del 1 al 10
            a = Integer.parseInt(a_str); // Convertimos el valor entero
            boolean esmult3 = a % 3 == 0; // Creamos un valor booleano si el residuo del numero da 0 en 3
            boolean esmult5 = a % 5 == 0; // Creamos un valor booleano si el residuo del numero da 0 en 5
            if (esmult3){ // si es multiplo de 3
                mult3++; // Se suma su total
            } else if (esmult5){ // Si el multiplo de 5
                mult5++; // Se suma su total
            }else{ // Si los 2 son multiplos
                ambos++; // Se suman ambos
            }
        } // Fin del ciclo
        // Salida
        JOptionPane.showMessageDialog(null, "Es multiplo de 3: "+mult3+"\n Es multiplo de 5: "+mult5+"\n Es de ambos: "+ambos, "Multipos", JOptionPane.INFORMATION_MESSAGE);
    } // Fin del metodo
} // Fin del programa