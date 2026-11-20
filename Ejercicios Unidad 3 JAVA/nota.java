/*EJERCICIO B: Validador de Rango de Porcentaje (Notas de Examen)
Solicitar al usuario la nota final de un examen, asegurando estrictamente que el valor ingresado se encuentre en el rango de 0.0 a 10.0. */
import java.util.Scanner; // Importamos la libreria de lectura
public class nota { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaramos la variable de la lectura
        double a; // Declaracion de la variable
        boolean bandera = true; // Declaracion de la variable de control en true
        do{ // Hacer mientras que el booleano este en falso.
            System.out.println("Ingresa la nota final del examen: "); // Salida
            a = e.nextDouble(); // Entrada
            if (a<0.0 || a>10.0){ // Si a es menor que 0.0 o a es mayor que 10.0
                System.out.println("Cantidad invalida, intentalo de nuevo."); // Salida
                bandera = false; // Cambio de valor en el boolean, y se repite el ciclo
            } else { // Si no 
                bandera = true; // Se mantiene el mismo valor inicial, por lo tanto, sale del ciclo.
            } // Fin de la condicional

        }while(!bandera); // Fin del ciclo
        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo
} // Fin del programa
