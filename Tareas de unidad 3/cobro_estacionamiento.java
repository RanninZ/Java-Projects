import java.util.Scanner;


public class cobro_estacionamiento {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        int horas;
        double aPagar;

        System.out.print("Teclea la cantidad de horas");
        horas = a.nextInt();

        aPagar = horas*15;

        System.out.print("Pago total: $"+aPagar);
    }

    
}
