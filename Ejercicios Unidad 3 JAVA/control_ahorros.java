/*Ejercicio A: Control de Ahorros
Una persona establece una meta económica de ahorro. El programa solicita el monto de la meta (ej. $500 USD). 
Luego, mediante un ciclo while, pide ingresos semanales de dinero acumulándolos de forma progresiva. 
El ciclo debe detenerse inmediatamente en cuanto la suma acumulada alcance o supere la meta estipulada. */
import java.util.Scanner; // Importamos la libreria 
public class control_ahorros { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de lectura
        int a, b, i = 1, t=0; // Declaracion de variables 
        System.out.println("Ingresa la meta que tienes esperada: "); // Salida
        a = e.nextInt(); // Entrada
        while (t<a){ // Ciclo mientras que el total sea menor que a
            System.out.println("Ingresa la cantidad de la semana #"+i); // Salida
            b = e.nextInt(); // Dato que se estara solicitando hasta que el ciclo se acabe
            t = t + b; // Suma del total.
            i++; // Incremento
        } // Fin del ciclo
        e.close(); // Cierre de la variable
    } // Fin del metodo
} // Fin del programa