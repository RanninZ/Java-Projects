import java.util.Scanner; // Importacion de la variable escaner

public class cobro_restaurante { // Inicio del programa
    public static void main (String[] args) { // Inicio del metodo
        Scanner a=new Scanner(System.in); // Declaracion de la variable escaner
        double propina; // Declaracion 
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
