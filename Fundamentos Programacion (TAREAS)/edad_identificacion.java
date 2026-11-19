/*Diseña un sistema para un club nocturno. Primero evalúa si la persona es mayor de edad (≥ 18). 
Si es menor, se le niega la entrada de inmediato. 
Si es mayor de edad, se ejecuta una condición interna que valida si trae su identificación física en mano (Verdadero/Falso). 
Si no la trae, tampoco entra */


import java.util.Scanner; // Importamos la libreria.


public class edad_identificacion { // Inicio del programa
    public static void main(String [] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Declaracion del escaner
        int edad; // Declaracion de variables
        System.out.println("--- NIGHT'S CLUB ---"); // Titulo
        System.out.println("Por favor, ingrese su edad: "); // Salida
        edad = e.nextInt(); // Entrada
        if (edad >=18){ // Si es mayor o igual a 18
            System.out.println("Cuenta con identificación: \n [S]Si\n [N]No"); // Salida (Verdadero / Falso)
            char id = e.next().charAt(0); // Declaramos la variable de si o no
            switch (id){ 
                case 'S': // Si se introdujo 'S'
                    System.out.print("Bienvenido!"); // Salida
                    break;
                case 'N': // Si se introdujo 'N'
                    System.out.print("Lo siento, no puedes entrar."); // Salida
                    break;
                default: // Si se introdujo otro caracter.
                    System.out.print("Error, intente de nuevo"); // Salida
            }
        } else { 
            System.out.print("Lo siento, no puedes entrar."); // Salida
        }
            
        e.close();   
    } // Fin del metodo
} // Fin del programa