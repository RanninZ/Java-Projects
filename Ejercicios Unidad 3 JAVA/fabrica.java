/* Una planta que fabrica perfiles de hierro posee un lote de n piezas.
Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar 
y luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud este comprendida en
el rango de 1.20 a 1.30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote. */

import java.util.Scanner;

public class fabrica {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int n, d=0, s=0;
        double a;
        System.out.println("¿Cuantas piezas se van a ingresar?:");
        n = e.nextInt();
        for (int i=1;i<=n; i++){
            System.out.println("Ingresa la longitud (m) de la pieza #"+i);
            a=e.nextDouble();
            if (a>=1.20 && a<=1.30){
                d++;
            }
            
        }
        System.out.println("La cantidad de piezas aptas son de: "+d);
        e.close();
    }
}
