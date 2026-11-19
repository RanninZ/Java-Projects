/*Ejercicio 2: Bloque de PIN con limite de intentos (Seguridad) */
/*Problema: Simular acceso el acceso a un telefono mediante un PIN numerico (1234).
El usuario tiene un maximo de 3 oportunidades de escribirlo bien.
El ciclo while debe determinarse por 2 razones: 
Ya sea porque escribio el PIN correcto
O porque agoto sus 3 intentos */

import javax.swing.JOptionPane; // Importamos la libreria 
public class pin{ // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String a_str; // Declaramos la variable de cadena
        int a, n=1234, i=0; // Declaramos la variable
        do{
            // Salida
            a_str = JOptionPane.showInputDialog(null, "Ingresa la contraseña", "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
            // Entrada
            a = Integer.parseInt(a_str);
            if (a!=n){ // Si a no es igual a n
                JOptionPane.showMessageDialog(null, "Intento denegado"); // Salida
                i++; // Incremento de intentos
                if (i ==3){ // Si los incrementos llegana 3
                    JOptionPane.showMessageDialog(null, "Superaste la cantidad de intentos."); // Mensaje
                }
            }else if(a==n){ // Si a es igual a n
                i = 3; // Se adelanta el valor a 3 
                // Salida
                JOptionPane.showMessageDialog(null, "Contraseña aceptada!", "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }while(i<3); // Mientras que los intentos sean 3
    } // Fin del metodo
} // Fin del programa