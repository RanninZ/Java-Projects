/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. */
import java.util.Scanner; //Importar la libreria.

public class pos_neg { // Crear archivo.
    public static void main (String [] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Declaramos la variable de escaner.
        int x; // Variable
        System.out.print("Ingresa el numero: "); // Salida.
        x = e.nextInt(); // Entrada 
        if (x<0){ // Primera condicional
            System.out.print("El numero es negativo."); // Salida.
        } else if (x==0){ // Segunda condicional
            System.out.print("El numero es nulo."); // Salida.
        } else if (x>0){ // Ultimas
            System.out.print("El numero es positivo"); // Salida.
        }
    }
}
