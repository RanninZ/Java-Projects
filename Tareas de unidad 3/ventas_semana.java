import java.util.Scanner;
//Ventas de la semana. 
// Pide la venta de cada uno de 7 días. 
// Acumula el total, calcula el promedio diario y cuenta cuántos días superaron los $1,000

public class ventas_semana {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        double total;
        double venta;
        double promedio;
        int dias;

        total = 0;
        dias = 0;

        for (int i=1; i<=7; i++){
            System.out.print("Introduce la venta del dia");
            venta = s.nextDouble();
            if (venta>1000){
                dias = dias + 1;
            } else {}
            total = total + venta;
            

        }
        promedio = total / 7;
        System.out.print("Este es el total: $" + total + " ,el promedio "+ promedio + ", y se superaron los $1000 " + dias +" dias");
        s.close();

    }
}
