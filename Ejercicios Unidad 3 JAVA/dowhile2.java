/*Problema 2: Mantener menu activo en pantalla hasta que el usuario elija la opcion de salir(3) */

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class dowhile2 {
    public static void main(String[] args){
        String a_str;
        int a;
        do{
            a_str = JOptionPane.showInputDialog(null, "[1]Hackear la NASA \n [2]Hackear el ITD \n [3]Salir", "Menu jaker", JOptionPane.QUESTION_MESSAGE);
            a = Integer.parseInt(a_str);
            switch (a){
                case 1:
                    JOptionPane.showMessageDialog(null, "jejeje hackeado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "jejeje ya tienes 10 jeje");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del hackeo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, invalido", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (a!=3);
    }
}