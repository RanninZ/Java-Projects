/*Ejercicio B: Cálculo de Potencia Manual

    Calcular la potencia de un número de forma manual (sin usar libreria math). 
    Solicitar la base y el exponente enteros, y utilizar un ciclo for para multiplicar 
    la base por sí misma tantas veces como indique el exponente. */
import java.util.Scanner;
public class potencia{
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int a, p, t=1;
        System.out.println("--- POTENCIA MANUAL --- ");
        System.out.println("Ingresa el numero que quieres potencias: ");
        a = e.nextInt();
        System.out.println("Ha que potencia lo quieres multiplicar: ");
        p = e.nextInt();
        for (int i = 1; i<=p ;i++){
            t = t * a;
        }
        System.out.println(t);
        e.close();
    }
}