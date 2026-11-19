/*Problema 1: Obligar al usuario a ingresar un numero mayor a cero, repitiendo la petición si se equivoca */

import javax.swing.JOptionPane;


public class dowhile1 {
    public static void main(String[] args){
        String a_str;
        int a;
        do{
            a_str= JOptionPane.showInputDialog(null, "Ingresa el numero positivo");
            a = Integer.parseInt(a_str);
            if(a<=0){
                JOptionPane.showMessageDialog(null, "Error, numeo invalido");

            }
        }while(a<=0);
    }
}