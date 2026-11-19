/*Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos. */
import javax.swing.JOptionPane; // Importamos el escaner.

public class numayorstr { // Creamos la clase.
    public static void main (String[] args){ // Inicio del metodo.
        int a, b; // Declaramos las 2 variables originales.
        String aStr, bStr; // Declaramos las 2 variables de salida.
        

        aStr = JOptionPane.showInputDialog("Ingrese el numero A: "); // Definimos la variable de salida.
        a = Integer.parseInt(aStr); // Convertimos la variable de salida a la variable original.
        bStr = JOptionPane.showInputDialog("Ingese el numero B: "); // Definimos la variable de salida.
        b = Integer.parseInt(bStr); // Convertimos la variable de salida a la variable original.

        if (a>b){ // Primera condicional donde a es mayor que b.
            JOptionPane.showMessageDialog(null, "El número "+a+" es mayor que" +b); // Mensaje de salia de la primera opción.

        }else {
            if (b>a){ // Segunda condicional donde b es mayor que a.
                JOptionPane.showMessageDialog(null,"El número "+b+" es mayor que"+a); // Mensaje de salida de la segunda opción.
            } else {
                if (a==b){ // Ultima condicional donde las 2 son iguales.
                    JOptionPane.showMessageDialog(null, "Ambos números son iguales."); // Mensaje de salida para la tercera opción.
                }
            }
        }
    }
}
