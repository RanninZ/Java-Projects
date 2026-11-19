/*Ejercicio B con Bandera: El Buscador Lógico Primo

Solicitar un número al usuario y determinar si es un número primo (un número que solo es divisible entre 1 y sí mismo). 
Usaremos una variable booleana llamada esPrimo como bandera. 
El ciclo while se detendrá anticipadamente si la bandera cambia a false. */
import java.util.Scanner;
public class primo {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int a, i=2;
        System.out.println("Ingresa el numero");
        a = e.nextInt();
        boolean esPrimo = a>1;
        
        while (esPrimo && i * i<=a){
            if(a%i==0){
                esPrimo=false;
            }else {
                esPrimo = true;
            }

            i++;
        }
    }
}