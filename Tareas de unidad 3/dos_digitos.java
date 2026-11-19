/* Se ingresa por teclado un número positivo de uno o dos digitos (1..99) mostrar su mensaje 
indicando si el número tiene uno o dos digitos. */

import javax.swing.JOptionPane; // Importamos la libreria que queremos usar.

public class dos_digitos { // Creamos el archivo.
    public static void main (String [] args){ // Iniciamos el metodo.
        double a; // Creamos la variable original
        String aStr; // Creamos la variable que se va a usar para la salida.

        aStr = JOptionPane.showInputDialog("Dame tu número: "); // Definimos la variable para la salida.
        a = Double.parseDouble(aStr); // Convertimos la variable de salida a la variable original.
        if (a<=9){ // Creamos la condicional donde nuestra variable a es menor o igual a 9.
            JOptionPane.showMessageDialog(null, "Tu número tiene 1 digito."); // El mensaje que muestra si se cumple.

        } else { // Creamos una excepcion
            if (a>9){ // Creamos la condicional donde nuestra variable es mayor a 9.
                JOptionPane.showMessageDialog(null, "Tu número tiene 2 digitos."); // EL mensaje que muestra si se cumple.
            }
        }
    }
}
