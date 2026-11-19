import java.util.Scanner;

public class tipo_de_cambio {
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        double pesosMexicanos;
        double tipoCambio;
        double dolares;

        System.out.print("Ingresa la cantidad de pesos");
        pesosMexicanos = obj.nextDouble();

        System.out.print("Ingresa el tipo de cambio");
        tipoCambio = obj.nextDouble();

        dolares = pesosMexicanos / tipoCambio;

        System.out.print("Cantidad en dolares :$" + dolares);

            


    }
}