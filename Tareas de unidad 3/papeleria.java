import java.util.Scanner;

public class papeleria {
    public static void main (String[] args) {
        Scanner a=new Scanner(System.in);

        int hojas;
        double precio;
        double total;


        System.out.print("Teclea la cantidad de hojas");
        hojas = a.nextInt();
        if (hojas>100) {
            precio=0.35;
            
        } else {
            precio=0.50;
        }

        total = hojas*precio;

        System.out.print("El precio total es: $"+total);
        a.close();
    }
    
}
