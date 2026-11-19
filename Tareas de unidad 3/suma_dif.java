/*Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma
y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo. */


import javax.swing.JOptionPane; // Importamos la libreria que vamos a usar.

public class suma_dif { // Creamos el archivo.
    public static void main (String [] args){ // Iniciamos el metodo.
        double a, b, suma, resta, m, d; // Declaramos las variables originales
        String aStr, bStr; // Declaramos las variables de salida.

        aStr = JOptionPane.showInputDialog("Dame el primer numero:"); // Definimos la variable de salida
        a = Double.parseDouble(aStr); // Convertimos la variable de salida a su variable original.
        bStr = JOptionPane.showInputDialog("Dame el segundo numero: ");
        b = Double.parseDouble(bStr);
        while (b==0){ // Creamos una validacion si el numero b es igual a 0 ya que no se puede dividir por 0.
            bStr= JOptionPane.showInputDialog("No se puede dividir por 0. Intenta de nuevo");
            b = Double.parseDouble(bStr);
            
        }
        if (a>b){ // Creamos la condicional si a es mayor que b se aplican las siguientes operaciones.
            suma = a+b;
            resta = a-b;
            JOptionPane.showMessageDialog(null, "Su suma es: "+suma+"\n Su diferencia es: "+resta);

        } else { // Creamos la excepcion y asignamos las operaciones que se van a realizar.
            m = a*b;
            d = a / b;
            JOptionPane.showMessageDialog(null, "Su multiplicacion es: "+m+"\n Su division es: "+d);
        }

    }

}
