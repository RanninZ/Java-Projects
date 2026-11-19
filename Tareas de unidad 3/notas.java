/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete 
mostrar un mensaje "Promocionando" */

import java.util.Scanner; // Importamos la libreria para la lectura.


public class notas { // Creamos el archivo.
    public static void main (String [] args){ // Iniciamos el metodo.
        Scanner e = new Scanner(System.in); // Definimos la variable que usaremos para la lectura.
        double prom, a, suma; // Declaramos las variable como tipo decimal.
        suma = 0; // Inicializamos el acumulador.
        for (int i = 1; i <= 3; i++){ // Creamos un bucle for que tenga un limite de 3 para preguntar.
            System.out.print("La "+i+" nota: "); // Salida para preguntar por las notas.
            a = e.nextDouble(); // Leemos la variable.
            while (a>10){ // Creamos una validacion con while para que no se sobrepase de 10.
                System.out.print("Debe ser de menos de 10: "); // Mensaje de la validacion.
                a = e.nextDouble(); // Leemos la variable nuevamente.
            }
            suma = suma + a; // Usamos el acumulador.

        }
        prom = suma / 3; // Calculamos el promedio.

        if (prom >= 7){ // Creamos una condicional si el promedio es mayor o igual a 7.
            System.out.print("Promocionando."); // El mensaje que mostrara.
        }
    }
}
