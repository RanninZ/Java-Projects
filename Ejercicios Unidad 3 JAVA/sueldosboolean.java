/*El programa pide cuántos empleados hay y, para cada uno, solicita su sueldo, validando que esté entre $100 y $500 
(si no, lo vuelve a pedir). 
Clasifica a cada trabajador como sueldo normal ($100 a $300) o sueldo alto (más de $300 hasta $500). 
Al final muestra cuántos empleados tienen sueldo normal, cuántos tienen sueldo alto y la suma total de todos los sueldos. */

import java.util.Scanner; // Importamos la variable escaner

public class sueldosboolean { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de lectura
        int n; // Variable n
        int i=1, sueldoAlto=0, sueldoNormal=0; // Inicializacion de las variables
        double sueldo=0, total=0; // Variables con punto decimal
        boolean bandera = false; // Variable con condicional que esta inicializada en falsa
        System.out.println("Ingrese el numero de empleados: "); // Salida
        n = e.nextInt(); // Entrada
        while(i<=n){ // Mientras i sea menor o igual a n
            bandera = false; // bandera se mantiene en falsa
            while(!bandera){ // Mientras bandera sea verdadera
                System.out.println("Ingrese el sueldo del trabajador " + i+" rango entre $100 y $500"); // Salida
                sueldo = e.nextDouble(); // Entrada
                if(sueldo>=100 && sueldo<=500){ // Si sueldo es mayor o igual a 100 y menor o igual a 500
                    bandera = true; // bandera es verdadera por lo que se sale del ciclo
                } else{ // Si no
                    System.out.println("El sueldo que esta ingresando no esta en el rango requerido"); // Salida
                } // Fin de la condicional

            } // Fin del ciclo anidado

            if(sueldo>=100 && sueldo<=300){ // Si el sueldo es mayor o igual a 100 y menor o igual a 300
                sueldoNormal++; // Incremento en la variable sueldoNormal
            }else{ // Si no
                sueldoAlto++; // Incremento en la variable sueldoAlto
            }
            total+=sueldo; // Suma del total dependiendo del sueldo
            i++; // Incremento de la variable contador i
        }
        System.out.println("La cantidad de empleados que tiene un sueldo normal es de: "+sueldoNormal); // Salida
        System.out.println("La cantidad de empleados que tiene un sueldo alto es de: "+sueldoAlto); // Salida
        System.out.println("El total de los sueldos es de: $"+total); // Salida
        e.close(); // Cierre de la variable de lectura

    } // Fin del metodo
} // Fin del programa