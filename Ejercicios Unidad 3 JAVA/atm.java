/*Cajero automático (ATM): el usuario tiene un saldo inicial de $5,000. Crea un menú con while 
(1. Consultar saldo, 2. Depositar, 3. Retirar, 4. Salir). Valida que no se pueda retirar más del saldo disponible. */

import javax.swing.JOptionPane;

public class atm{
    public static void main(String[] args){
        String menu_str, deposito_str, retirar_str;
        int a = 5000, menu, dep, ret;
        menu = 0;
        while (menu!=4){
            menu_str = JOptionPane.showInputDialog(null,"¿Que opcion desea escoger?:\n[1]Consultar saldo\n[2]Depositar\n[3]Retirar\n[4]Salir", "ATM", JOptionPane.QUESTION_MESSAGE);
            menu = Integer.parseInt(menu_str);
            if (menu==1){
                JOptionPane.showMessageDialog(null, "Su saldo total es de: $"+a, "ATM", JOptionPane.PLAIN_MESSAGE);
            }else if (menu==2){
                deposito_str = JOptionPane.showInputDialog(null, "¿Cuanto desea depositar? $", "ATM", JOptionPane.QUESTION_MESSAGE);
                dep = Integer.parseInt(deposito_str);
                a = a + dep;
                JOptionPane.showMessageDialog(null, "Tu saldo total es de: "+a, "ATM", JOptionPane.QUESTION_MESSAGE);
            } else if (menu==3){
                retirar_str = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea retirar", "ATM", JOptionPane.QUESTION_MESSAGE);
                ret = Integer.parseInt(retirar_str);
                if (ret<=a){
                    a = a - ret;
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad invalida, el saldo solicitado es mayor.", "ATM", JOptionPane.ERROR_MESSAGE);

                }
                JOptionPane.showMessageDialog(null, "Tu saldo total es de: "+a, "ATM", JOptionPane.QUESTION_MESSAGE);
            }
        }
        
    }
}