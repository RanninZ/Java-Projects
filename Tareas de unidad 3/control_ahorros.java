/*Ejercicio A: Control de Ahorros

Una persona establece una meta económica de ahorro. 
El programa solicita el monto de la meta (ej. $500 USD). 
Luego, mediante un ciclo while, pide ingresos semanales de dinero acumulándolos de forma progresiva. 
El ciclo debe detenerse inmediatamente en cuanto la suma acumulada alcance o supere la meta estipulada. */

import javax.swing.JOptionPane;

public class control_ahorros{
    public static void main(String[] args){
        String monto_str, acumula_str;
        int monto, acumula, i=1, total=0;
        acumula = 0;
        monto_str = JOptionPane.showInputDialog(null, "¿Cuanto es el monto que quieres ahorrar?", "Caja de ahorro", JOptionPane.QUESTION_MESSAGE);
        monto = Integer.parseInt(monto_str);
        while (total<monto){
            acumula_str = JOptionPane.showInputDialog(null, "Ingresa la cantidad de la semana #"+i, "Caja de ahorro", JOptionPane.QUESTION_MESSAGE);
            acumula = Integer.parseInt(acumula_str);
            total = total + acumula;
            i++;

        }
    }
}