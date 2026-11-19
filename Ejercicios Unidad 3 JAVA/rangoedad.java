/*Ejercicio 3: Validacion de rango de edad */
/* Problema: Crear un formulario de registro donde se pida la edad del usuario. Para que el registro sea valido,
la edad debe estar estrictamente entre 18 y 99 años. Si ingresa un numero fuera de ese rango (por ejemplo, 15 o 150),
el ciclo while debe atraparlo y volver a pedir el dato hasta que cumpla la regla */
import javax.swing.JOptionPane; // Importamos la libreria

public class rangoedad { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String a_str; // Declaramos la cadena
        int a; // Declaramos la variable
        boolean bandera = true; // Condicional ya declarada como verdadera
        do{
            a_str = JOptionPane.showInputDialog(null, "Ingresa tu edad", "Edad", JOptionPane.INFORMATION_MESSAGE); // Salida
            a = Integer.parseInt(a_str); // Entrada
            if (a>=18 && a<=99){ // Si el valor ingresado es mayor o igual a 18 o menor o igual a 99
                bandera = true; // Se mantiene como verdad
            }else { // Si no se cumple
                bandera = false; // La variable se vuelve falsa.
            }
        }while (!bandera); // Mientras que while se siga manteniendo falso.
    } // Fin del metodo
} // Fin del programa