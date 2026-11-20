/*Ejercicio A: Generador de Múltiplos Personalizados
Solicitar al usuario un número base y un número límite. 
El programa debe imprimir todos los múltiplos del número base que se encuentren entre el 1 y el límite establecido. */
import java.util.Scanner; // Importamos la libreria
public class multiplos { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de lectura
        int a, b, c=0; // Declaracion de variables
        System.out.println("Ingresa el numero base: "); // Salida
        a = e.nextInt(); // Entrada
        System.out.println("Ingresa el limite: "); // Salida
        b = e.nextInt(); // Entrada
        for (int i = 1; i<=b; i++){ // Ciclo for que menciona que hasta que i sea menor o igual a b
            c = a * i; // Proceso
            System.out.println(c); // Salida
        } // Fin del ciclo
        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo
} // Fin del programa
