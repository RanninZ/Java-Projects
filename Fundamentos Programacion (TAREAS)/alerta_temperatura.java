/* Problema: Crea un programa que solicite la temperatura actual en grados Celsius. 
la temperatura es mayor o igual a 40 grados, debe mostrar una alerta en pantalla que diga: 
"¡Alerta! Riesgo de golpe de calor extremo.". 
Si es menor, el programa termina normalmente sin imprimir mensajes extra. */


import java.util.Scanner; // Importamos libreria.


public class alerta_temperatura { // Inicio del programa.
    public static void main(String[] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Declaramos el escaner.
        double temperatura; // Declaramos la temperatura.
        System.out.println("Ingresa la temperatura actual: "); // Entrada
        temperatura = e.nextDouble(); // Lectura de datos
        if (temperatura >= 40.0){ // Si la temperatura es mayor o igual a 40.
            System.out.print("¡Alerta! Riesgo de golpe de calor extremo."); // Salida.

        } // Fin de la condicional
    } // Fin del metodo.
} // Fin del programa.