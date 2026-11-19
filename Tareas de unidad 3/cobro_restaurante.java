import java.util.Scanner;

public class cobro_restaurante {
    public static void main (String[] args) {
        Scanner a=new Scanner(System.in);
        double propina;
        double consumo;
        double cantidadApagar;
        double consumoPorpersona;
        double cantidadPersonas;

        System.out.print("Teclea la cantidad de personas");
        cantidadPersonas= a.nextDouble();
        
        System.out.print("Teclea el consumo total");
        consumo=a.nextDouble();


        propina = consumo * 0.10;
        cantidadApagar = consumo + propina;
        consumoPorpersona = cantidadApagar / cantidadPersonas;

        System.out.print("Este es el total: $"+cantidadApagar+"Esto es por cada uno: $"+consumoPorpersona);
    }
}
