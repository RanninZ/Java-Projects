/*Solicitar a los usuarios 2 numeros y un simbolo de operacion (+,-,x,/) Dependiente del simbolo
Realizar la operacion matematica correspondiente */



import java.util.Scanner; // Importamos la libreria escaner.



public class calculadora_basica { // Creamos la clase.
    public static void main(String[] args){ // Inicio del programa
        Scanner e = new Scanner(System.in); // Declaramos la variable del escaner.
        double a, b, mult, div, suma, resta; // Declaracion de variables.
    
        System.out.print("Dame el primer numero: "); // Salida
        a = e.nextDouble(); // Entrada
        System.out.print("Dame el segundo numero: "); // Salida
        b = e.nextDouble(); // Entrada

        System.out.println("---- CALCULADORA BASICA ----"); // Titulo
        System.out.println("[+]Suma"); // Primera opcion
        System.out.println("[-]Resta"); // Segunda opcion.
        System.out.println("[*]Multiplicacion"); // Tercera opcion.
        System.out.println("[/]Division"); // Cuarta opcion.
        System.out.println("[5]Salir"); // Quinta opcion 
        char opcion = e.next().charAt(0); // Inicio de la variable caracter.

        switch (opcion) { // Inicio de la funcion switch
            case '+': // al interactuar 1
                suma = a + b; // Operacion
                System.out.println("La suma es: "+suma); // Salida
                break; // Ruptura
            case '-': // Al interactuar 2
                resta = a-b; // Operacion
                System.out.println("La resta es:"+resta); // Salida
                break; // Ruptura
            case '*': // Al interactuar 3
                mult = a*b; // Operacion 
                System.out.println("La multiplicacion es: "+mult); // Salida
                break; // Ruptura
            case '/': // Al interactuar 4
                if (b==0){ // Condicional si se divide entre 0
                    System.out.print("No se puede dividir entre 0"); // Salida
                } else {
                    div = a / b; // Operacion
                    System.out.print("La division es: "+div); //Salida
                }
                break; // Ruptura
            case '5': // Al interactuar 5
                System.out.print("Hasta luego!"); // Salida
                break; // Ruptura
            default: // NO se interactua con ningun numero mencionado
                System.out.print("Debes de escoger una opcion del 1 - 5"); // Salida
                break; // Ruptura

            
        } // Fin del switch
        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo
} // Fin del programa
