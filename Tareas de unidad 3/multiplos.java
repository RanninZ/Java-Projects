/*Ejercicio A: Generador de Múltiplos Personalizados

    Solicitar al usuario un número base y un número límite. 
    El programa debe imprimir todos los múltiplos del número base que se encuentren entre el 1 y el límite establecido. */
import java.util.Scanner;
public class multiplos{
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int a, b, d;
        System.out.println("--- MULTIPLOS ---");
        System.out.println("Ingresa el numero");
        a = e.nextInt();
        System.out.println("Ingresa el limite especifico: ");
        b = e.nextInt();
        for (int i = 1; i<=b; i++){
            d = a * i;
            System.out.println(d);
        }
        e.close();
    }
}