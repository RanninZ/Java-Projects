import java.util.Scanner;


public class edad1 {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        int edad;
        String nombre;
        

        System.out.print("Dame tu edad: ");
        edad = e.nextInt();
        e.nextLine();
        System.out.print("Dame tu nombre: ");
        nombre = e.nextLine();

        System.out.print("Hola "+ nombre + " tienes "+ edad + " años");
    }
}
