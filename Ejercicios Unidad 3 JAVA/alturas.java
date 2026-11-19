/*Se ingresan un conjunto de n alturas de personas por teclado. 
Mostrar la altura promedio de las personas.
*/


import java.util.Scanner; // Importamos el escaner




public class alturas { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaramos el escaner
        System.out.println("--- Alturas ---"); // Titutlo
        System.out.println("¿Cuantas personas son?"); // Salida
        int n = e.nextInt(); // Entrada
        int i = 1; // Incremento
        double estatura, promedio; // declaramos la variable
        double total = 0; // Declaramos el total

        while (i<=n){ // Mientras que el numero de personas sea mayor o igual a i
            System.out.println("Dame la estatura de "+i+" persona en metros: "); // Salida
            estatura = e.nextDouble(); // Entrada
            total = total + estatura; // Proceso
            i++; // Incremento
        }

        promedio = total / n; // Promedio
        System.out.println("El promedio total de estaturas de "+n+" personas es de: "+ promedio); // Salida
        e.close(); // Cerramos escaner
    } // Fin del metodo
} // Fin del programa