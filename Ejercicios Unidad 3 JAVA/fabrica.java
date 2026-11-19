/* Una planta que fabrica perfiles de hierro posee un lote de n piezas.
Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar 
y luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud este comprendida en
el rango de 1.20 a 1.30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote. */

import java.util.Scanner;//Importacion de la liberia
public class fabrica { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable escaner
        int n, d=0; // Declaracion de la variables enteras
        double a; // Declaracion de la variable en putno decimal
        System.out.println("¿Cuantas piezas se van a ingresar?:"); // Salida
        n = e.nextInt(); // Entrada
        for (int i=1;i<=n; i++){ // Para que se cumpla el contador tiene que ser menor o igual a n
            System.out.println("Ingresa la longitud (m) de la pieza #"+i); // Salida
            a=e.nextDouble(); // Entrda
            if (a>=1.20 && a<=1.30){ // Si a es mayor o igual a 1.20 y menor o igual a 1.30
                d++; // Contador
            } // Fin de la condicional
            
        } // Fin del ciclo
        System.out.println("La cantidad de piezas aptas son de: "+d); // Salida
        e.close(); // cierre de la variable de lectura
    } // Fin del metodo
} // Fin del programa
