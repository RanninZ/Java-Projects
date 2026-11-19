/*En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500.
Realizar un programa que lea los sueldos que cobra cada empleado informe cuantos empleados cobran entre $100 y $300
y cuantos cobran mas de $300. Ademas el programa debera informar el imporque e gasta la empresa en sueldos al pesronal. */

import java.util.Scanner; // Importarmos la liberia escaner

public class sueldos { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaramos la variable de escaner
        System.out.println("Digite la cantidad de empleados: "); // Salida
        int n = e.nextInt(); // Entrada
        int i = 1; // Incremento
        int sueldo;
        int total = 0; // Sueldo
        int empleado1 = 0; // Primer grupo
        int empleado2 = 0; // Segunddo grupo
        while (i<=n){ // Mientras que el numero de empleados sea mayor o igual a i
            System.out.println("Cuanto cobra el empleado numero ["+i+"]"); // Salida
            System.out.print("(el rango es de $100 - $500): $"); // Rango
            sueldo = e.nextInt(); // Entrada
            total = sueldo+total;
            if (sueldo>=100 && sueldo<=300){ // Si el sueldo es mayor o igual a 100 y menor o igual a 300
                empleado1 = empleado1 + 1; // Proceso
                i++; // Incremento
            }else if (sueldo>500){ // Si el sueldo es mayor a 500
                System.out.println("Cantidad invalida, intentelo de nuevo"); // Salia validacion
            } else { // Ninguna de las anteriores
                empleado2 = empleado2 + 1; // Proceso
                i++; // Incremento
            }
            
        }
        System.out.println("La cantidad de empleados que cobran entre $100 y $300 es de: "+empleado1); // Salida
        System.out.println("La cantidad de empleados que cobran más de $300 es de: "+ empleado2); // Salida
        System.out.println("El sueldo total gastado es de: $"+total);
        e.close(); // Cierre de escaner
    } // Fin del metodo
} // Fin del programa