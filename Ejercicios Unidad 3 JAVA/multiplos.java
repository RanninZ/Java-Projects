/* Mostrar los multiplos de 8 hasta 500. Debe de aparecer en pantalla 8, 16, 24, etc. */



public class multiplos { // Iniciamos el programa
    public static void main(String[] args){ // Iniciamos el metodo
        int a = 8; // Declaramos la variable
        while(a<=500){ // Mientras la variables sea igual o menor a 500
            System.out.print(a+", ");  // Salida
            a = a + 8; // Proceso
        } // Fin del ciclo
    } // Fin del metodo
} // Fin del programa