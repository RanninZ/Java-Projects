/*Solicita el IMC de una persona (valor decimal) y clasifícalo bajo los siguientes criterios médicos estándar: 
bajo peso (menor a 18.5), 
peso normal (18.5 a 24.9), 
sobrepeso (25.0 a 29.9)  
obesidad (30.0 o más).
 */


import java.util.Scanner; // Importamos la libreria

public class imc { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaracion del escaner
        double imc; // Declaracion de la variable
        System.out.print("Ingrsa tu IMC: "); // Salida
        imc = e.nextDouble(); // Entrada
        if (imc<18.5){  // Si es menor a 18.5
            System.out.print("Bajo peso."); // Salida
        } else if (imc<25.0){ // Si es mayor o igual a 18.5 y menor o igual a 24.9
            System.out.print("Peso normal."); // Salida
        } else if (imc<30.0){ // Si es mayor o igual a 25.0 y menor o igual a 29.9
            System.out.print("Sobre peso."); // Salida
        } else{
            System.out.print("Obesidad."); // Salida
        }
        e.close();
    } // Fin del metodo
} // Fin del programa