import java.util.Scanner; // Importacion de la variable de lectura
 

//Determinar si la suma de cualquier pareja de ellos es iguall al tercer numero.
//Si cumple esta condicion, escribir "iguales y, en caso contrario, distintos."


public class anidado { // Inicio del programa
    public static void main (String[] args){ // Inicio del metodo
        Scanner e=new Scanner(System.in); // Declaracion de la variable de lectura
        int n1, n2, n3; // Declaracion de variables
        

        System.out.print("Dame el primer numero: "); // Salida
        n1 = e.nextInt(); // Entrada
        System.out.print("Dame el segundo numero: "); // Salida
        n2 = e.nextInt(); // Entrada
        System.out.print("Dame el tercer numero: "); // Salida
        n3 = e.nextInt(); // Entrada

        if (n3==n2+n1){ // SI n3 es igual a n2 mas n1
            System.out.print("Son iguales"); // Salida

        }else { // Si no
            if (n2==n3+n1){ // Si n2 es igual a n3 + n1
                System.out.print("Son iguales"); // Son iguales


            }else { // Sino
                if (n1==n2+n3){ // si n1 es igual a n2 + n3
                    System.out.print("Son iguales"); // Son iguales
                }else { // Si no
                    System.out.print("Son distintos"); // Son distitntos
                } // Fin de la condicional anidada 1
            } // Fin de la condicional anidada 2
        } // Fin de la condicional
        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo
    
} // Fin del programa
