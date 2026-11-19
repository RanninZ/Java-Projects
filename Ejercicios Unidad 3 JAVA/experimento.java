import java.util.Scanner; // Importamos la libreria


public class experimento { // Iniciamos el programa
    public static void main(String[] args){ // Iniciamos el metodo
        Scanner e = new Scanner(System.in); // Declaramos la lectura
        int[]b = new int[15];
        int[]a = new int[15]; // Declaramos las variables de entrada
        int totallista1 = 0; // El total de la lista 1
        int totallista2 = 0; // El total de la lista 2
        int i = 1; // Acumulador de la lista 1
        int c = 1;// Acumulador de la lista 2
        String ta_str = " ";
        String str1 = " ";
        String str2 = " ";
        while (i<=15){ // Mientras i sea menor o igual a 15
            System.out.println("Ingrese la "+i+" cantidad de la primera lista: "); // Salida
            a[i-1] = e.nextInt(); // Entrada
            totallista1 = totallista1 + a[i-1]; // Proceso
            str1 = str1 + a[i-1]+ " \n";
            i++; // Acumulador i + 1
        }
        while (c<=15){ // Mientras c sea menor o igual a 15
            System.out.println("Ingrese la "+c+" cantidad de la segunda lista: "); // Salida
            b[c-1] = e.nextInt(); // Entrada
            totallista2 = totallista2 + b[c-1]; // Proceso
            str2 = str2 + b[c-1]+ " \n";
            c++; // Acumulador c + 1
        }

        ta_str = "Lista 1: ["+str1+"] | Lista 2: ["+str2+"]";

        if (totallista1>totallista2){ // Si la lista 1 es mayor
            System.out.println("La primera lista es mayor."); // Salida
        } else if (totallista2>totallista1){ //  Si la lista 2 es mayor
            System.out.println("La segunda lista es mayor."); // Salida
        } else { // Si son iguales
            System.out.println("Las 2 listas son iguales."); // Salida
        } // Fin de la condicion
        System.out.println(ta_str); // Salida final
        e.close(); // Cierre de la variable de escaner
    } // Fin del metodo
    
} // Fin del programa