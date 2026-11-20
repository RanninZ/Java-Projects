/*Ejercicio B con Bandera: El Buscador Lógico Primo

Solicitar un número al usuario y determinar si es un número primo (un número que solo es divisible entre 1 y sí mismo). 
Usaremos una variable booleana llamada esPrimo como bandera. 
El ciclo while se detendrá anticipadamente si la bandera cambia a false. */
import java.util.Scanner; // Importamos la liberia

public class primo { // Iniciamos el programa
    public static void main(String[] args){ // Iniciamos el metodo
        Scanner e = new Scanner(System.in); // Declaramos la variable escaner
        boolean esPrimo = true; // Declaramos el booleano en verdadero
        while (esPrimo){ // Mientras el booleano sea verdadero:
            System.out.println("Ingresa el numero: "); // Salida
            int a = e.nextInt(); // Entrada
            esPrimo = true; // Mantenemos el booleano en la condicion inicial
            int divisor= 2; // Contador en el que se puede dividir
            if (a<2){
                esPrimo = false;
            }
            while (esPrimo && divisor<a){ // Mientras que el booleano sea verdadero y el contador sea menor que el numero que nos dieron
                if(a % divisor == 0){ // Si el residuo de a y el contador es 0:
                    esPrimo = false; // El booleano se vuelve entonces, no era primo, por lo que se sale del ciclo
                }else{ // Si no es asi: 
                    divisor++; // El contador aumenta para que se divida entre demas numeros
                }// Fin de la condicional
            } // Fin del ciclo interno
        } // Fin del ciclo externo
        e.close(); // Cierre de la variable escaner
        


    } // Fin del metodo
} // Fin del programa
