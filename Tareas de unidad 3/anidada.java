/* Ejercicio 2: Cotizador de Seguros de Auto por Perifil 
 Una aseguradora calcula el costo de una poliza basandose en la edad y el historial de accidentes del conductor.
 Primero pregunta si el conductor tiene menos de 25 años.
 
 Si tiene menos de 25 años (alto riesgo): Se le pregunta internamente si ha tenido accidentes
 Si la respuesta es si, la poliz cuesta $1,500USD; si es no, cuesta $1000USD
 
 Si tiene 25 años o mas (Bajo riesgo): Se le hace la misma pregunta sobre accidentes
 Si es si, cuesta $800USD; si es no, cuesta $500USD*/


import java.util.Scanner; // Importamos la liberia de lectura


public class anidada { // Inicio del programa
    public static void main(String [] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion de la variable de lectura
        System.out.println("--- COTIZADOR DE SEGUROS ---"); // Salida (titulo)
        System.out.println("Digite su edad en años:" ); // Salida
        int edad = e.nextInt(); // Entrada
        if (edad<25){ // Si edad es menor a 25
            System.out.print("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No "); // Salida
            int res = e.nextInt(); // Entrada
            while (res != 1 && res != 2){ // Mientras que la respuestas no sea 1 y no sea 2
                System.out.print("Error, los digitos no son correctos, intente de nuevo"); // Salida
                System.out.println("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No "); // Salida (repetida)
                res = e.nextInt(); // Entrada (repetida)
            } // Fin del ciclo
            if (res == 1){ // Si el resultado es igual a 1 
                System.out.print("Su costo de poliza sera: $1,500USD"); // Salida

            } else { // Si el resultado es igual a 2
                System.out.print("SU costo de poliza sera: $1,000USD"); // Salida

            } // Fin de la condicional anidada
        } else {  // Si no es menor a 25
            System.out.println("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No "); // Salida
            int res = e.nextInt(); // Entrada
            while (res != 1 && res != 2){// Misma validacion
                System.out.print("Error, los digitos no son correctos, intente de nuevo");
                System.out.print("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No ");
                res = e.nextInt();
            } // Fin del ciclo
            if (res == 1){ // Si resultado es igual a 1
                System.out.print("Su costo de poliza sera: $800USD"); // Salida

            } else { // Si el resultado es igual a 2
                System.out.print("SU costo de poliza sera: $500USD"); // Salida

            } // Fin de la condicional anidada
        }  // Fin de la condicional
        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo

} // Fin del programa
