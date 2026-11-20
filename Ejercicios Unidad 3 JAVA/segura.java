/*EJERCICIO A: Validación de Autenticación Segura (con Bandera boolena)
Controlar un acceso del sistema. El usuario debe ingresar una contraseña ("Secreto125"). 
Usaremos una bandera booleana llamada intentoFallido para gestionar de forma 
elegante si el bucle debe volver a repetirse o si se le otorga el acceso definitivo. */
import java.util.Scanner; // Importacion de libreria
public class segura { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de lectura
        String a = "Secreto125", c; // Declaracion de las variables de cadena
        boolean intentoFallido = true; // Declaracion del booleano en verdadero
        do{ // Hacer mientras que el intentoFallido no sea verdadero
            System.out.println("Ingresa la contraseña:"); // Salida
            c = e.next(); // Entrada
            if (c.equals(a)){ // Si lo que ingresamos es igual a "Secreto125"
                intentoFallido = true; // la variable se vuelve verdadera
            }else{ // Si no
                System.out.println("Contrasña incorreta intente de nuevo"); // Salida
                intentoFallido = false; // La variable se vuelve negativa por lo que se repite el ciclo
            }

        }while(!intentoFallido); // Fin del ciclo
        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo
} // Fin del programa
