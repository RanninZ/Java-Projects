/* Una tienda ofrece envío gratis solo si el monto de la compra supera los $500 USD. 
Escribe un algoritmo que reciba el costo de la compra. 
Si califica para envío gratis, debe restarle $50 de costo de envío simulado al total a pagar. */
import java.util.Scanner; // Importar libreria.


public class descuento_minimo { // Inicio del programa.
    public static void main(String[]args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Declaramos escaner.
        int costo; // Declaramos el costo.
        System.out.print("Cuanto fue el costo de la compra: $"); // Salida
        costo = e.nextInt(); // Lectura del valor
        if (costo >500){ // Si es mayor a 500.
            costo = costo - 50; // Restamos los 50.
            System.out.print("El costo final es de: $"+costo); // Salida
        }
            
        
    } // Fin del metodo.
} // Fin del programa.