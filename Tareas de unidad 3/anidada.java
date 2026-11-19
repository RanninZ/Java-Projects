/* Ejercicio 2: Cotizador de Seguros de Auto por Perifil 
 Una aseguradora calcula el costo de una poliza basandose en la edad y el historial de accidentes del conductor.
 Primero pregunta si el conductor tiene menos de 25 años.
 
 Si tiene menos de 25 años (alto riesgo): Se le pregunta internamente si ha tenido accidentes
 Si la respuesta es si, la poliz cuesta $1,500USD; si es no, cuesta $1000USD
 
 Si tiene 25 años o mas (Bajo riesgo): Se le hace la misma pregunta sobre accidentes
 Si es si, cuesta $800USD; si es no, cuesta $500USD*/


import java.util.Scanner;


public class anidada {
    public static void main(String [] args){
        Scanner e = new Scanner(System.in);
        System.out.println("--- COTIZADOR DE SEGUROS ---");
        System.out.println("Digite su edad en años:" );
        int edad = e.nextInt();
        if (edad<25){
            System.out.print("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No ");
            int res = e.nextInt();
            while (res != 1 && res != 2){
                System.out.print("Error, los digitos no son correctos, intente de nuevo");
                System.out.println("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No ");
                res = e.nextInt();
            }
            if (res == 1){
                System.out.print("Su costo de poliza sera: $1,500USD");

            } else {
                System.out.print("SU costo de poliza sera: $1,000USD");

            }
        } else { 
            System.out.println("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No ");
            int res = e.nextInt();
            while (res != 1 && res != 2){
                System.out.print("Error, los digitos no son correctos, intente de nuevo");
                System.out.print("¿Alguna vez ha tenido algún accidente?: \n [1]Si \n [2]No ");
                res = e.nextInt();
            }
            if (res == 1){
                System.out.print("Su costo de poliza sera: $800USD");

            } else {
                System.out.print("SU costo de poliza sera: $500USD");

            }
        }  
        e.close();  
    }  

}
