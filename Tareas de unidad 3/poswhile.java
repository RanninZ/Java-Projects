/*Escribir */

import javax.swing.JOptionPane;



public class poswhile {
    public static void main(String[] args){
        String a_str;
        int a;
        int i = 1;
        String cadena = ""; 
        a_str = JOptionPane.showInputDialog("Ingresa el numero limite:");
        a = Integer.parseInt(a_str);
        while (i<=a){
            cadena = cadena+i+"\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
