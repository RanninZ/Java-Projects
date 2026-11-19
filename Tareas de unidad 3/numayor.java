/*Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos. */
import java.util.Scanner; // Importamos el escaner.

public class numayor { // Creamos la clase.
    public static void main (String[] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Definimos el escaner.
        int a, b; // Definimos las 2 variables.
        
        System.out.print("Ingresa el numero A: "); // Mensaje de salida para solicitar la variable a.
        a = e.nextInt(); // Se lee la variable.
        System.out.print("Ingresa el numero B:"); // Mensaje de salida para solicitar la variable b.
        b = e.nextInt(); // Se lee la variable.

        if (a>b){ // Primera condicional donde a es mayor que b.
            System.out.print("El numero"+a+" es mayor que "+b);

        }else {
            if (b>a){ // Segunda condicional donde b es mayor que a.
                System.out.print("El numero "+b+" es mayor que "+a);
            } else {
                if (a==b){ // Ultima condicional donde las 2 son iguales.
                    System.out.print("Los dos numeros son iguales.");
                }
            }
        }
    }
}
