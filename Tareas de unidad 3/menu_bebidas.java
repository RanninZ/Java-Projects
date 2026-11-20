/*Ejercicio 4: Menu de bebidas de una Maquina expendedora
Problema: Mostrar un menu con 3 opciones de bebida.
El usuario digita el numero de su opcion y el programa muestra el precio a pagar. */

import java.util.Scanner;

public class menu_bebidas {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);

        //DECLARACION DEL MENU
        System.out.println("--- MENU DE BEBIDAS ---");
        System.out.println("1. Cafe americano");
        System.out.println("2. Té verde");
        System.out.println("3. Jugo de Naranja.");
        System.out.print("Selecciona una opción (1-3): ");
        //int opcion = e.nextInt();
        char opcion  = e.next().charAt(0); // Funcion del charAt()
        /*La funcion charAt funciona para obtener un caracter especifico de una cadena
        mediante un indice, comenzando en 0. */

        switch (opcion) {
            case '1':
                System.out.print("Has seleccionado Café. El costo es de $50 pesos.");
                break;
            case '2':
                System.out.print("Has seleccionado Té Verde. El costo es de $55 pesos.");
                break;
            case '3':
                System.out.print("Has seleccionado Jugo de Naranja. El costo es de $58 pesos.");
                break;
            default:
                System.out.print("Seleccion incorrecta, selecciona del 1 al 3");
                break;
            
            

        }
        e.close();
    }
}