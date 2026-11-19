/*Confeccionar un programa que permita cargar un numero entero positivo de hasta tres cifras 
y muestre un mensaje indicando si tiene 1, 2 o 3 cifras. Mostrar un mensaje de error si el numero de cifras es mayor.*/
import java.util.Scanner; // Importamos la libreria.




public class cifras { // Crear el archivo.
    public static void main (String [] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); //Declaramos la variable del escaner.
        int x; // Declaramos la variable
        System.out.print("Ingrese el numero: "); // Salida
        x = e.nextInt(); // Entrada 
        if (x<=9 && x>=0){ // Primera condicional
            System.out.print("Numero de 1 digito."); // Salida
        } else if (x>9 && x<100){ // Segunda condicional
            System.out.print("El numero es de 2 digitos."); // Salida
        } else if (x>99 && x<1000){ // Tercera condicional 
            System.out.print("El numero es de 3 digitos."); // Salida.
        }
        e.close();
    }
}
