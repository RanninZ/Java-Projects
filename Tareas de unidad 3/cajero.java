import java.util.Scanner;

//Cajero con límite de retiro. El usuario ingresa un saldo inicial y luego hace 5 retiros. 
// En cada uno, si el retiro es mayor al saldo muestra “Fondos insuficientes” y no lo descuentes. 
// Al final muestra el saldo restante y cuántos retiros fueron rechazados.

public class cajero {
    public static void main (String[] args){
        Scanner e = new Scanner(System.in);

        double saldo;
        double r;
        
        int rechazados;


        rechazados = 0;
        

        System.out.print("Introduce el saldo: ");
        saldo = e.nextDouble();
    
        for (int i = 1; i <= 5; i++){
        System.out.print("¿Cuanto realizas retirar?: ");
        r = e.nextDouble();
        while (r<1){
            System.out.print("Cantidad invalida, no podriamos restar por negativos o por 0. \nIntroducelo de nuevo ");
            r= e.nextDouble();
        }
        if (r>saldo){
            System.out.print("Fondos insuficientes\n");
            rechazados = rechazados + 1;
        } else {
            saldo = saldo - r;
            }
        }
    
        System.out.print("El saldo restante es de: $"+ saldo +" La cantidad de retiros rechazados fue de: "+ rechazados + " retiros");
    }
   

    
    


}
