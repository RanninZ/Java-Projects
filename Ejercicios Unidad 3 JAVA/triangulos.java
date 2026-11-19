/*Crear un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triangulo, el programa debera informar:
De cada triangulo, la medida de su base, su altura y su superficie
La cantidad de triángulos cuya superficie es mayor a 12
 */

import javax.swing.JOptionPane; // Importamos la liberia


public class triangulos { // Iniciamos el programa
    public static void main(String[] args){ // Iniciamos el metodo
        String n_str, h_str, b_str, c=""; // Declaramos la variable cadena
        double h, b, a; // Declaramos la variable de los valores, altura, base y area
        int n, at=0; // Declaramos las varibbles de los valores para el contador y la cantidad de triangulos

        n_str = JOptionPane.showInputDialog(null, "Ingrese la cantidad de triangulos que desea medir: ", "Triangulos", JOptionPane.INFORMATION_MESSAGE); // Salida
        n = Integer.parseInt(n_str); // Convertimos a su forma entera
        for(int i = 1; i<=n; i++){ // Ciclo for 
            h_str = JOptionPane.showInputDialog(null, "Ingrese la altura en metros del triangulo #"+i, "Triangulos", JOptionPane.INFORMATION_MESSAGE); // Salida
            h = Double.parseDouble(h_str); // Convertimos a su forma entera
            b_str = JOptionPane.showInputDialog(null, "Ingrese la base en metro del triangulo #"+i, "Triangulos", JOptionPane.INFORMATION_MESSAGE); // Salida
            b = Double.parseDouble(b_str); // Convertimos a su forma entera
            a = (b*h)/2; // Proceso del area
            if (a > 12){ // Si el area salio mayor de 12
                at++; // Se suma uno al contador del total
            }
            c = c + "\n Area: "+a+" Base: "+b+" Altura: "+h; // Salida por cada triangulo
        }   

        JOptionPane.showMessageDialog(null, c, "Triangulos", JOptionPane.INFORMATION_MESSAGE); // Salida completa
        // Salida final
        JOptionPane.showMessageDialog(null, "La cantidad de triangulos que superaron en su superficie 12 son: "+at, "Triangulos", JOptionPane.INFORMATION_MESSAGE);
        
    } // Fin del metodo
} // Fin del programa