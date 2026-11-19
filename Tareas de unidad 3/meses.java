/* Solicitar al usuario un número del 1 - 12 que represente un mes del año.
Utilizar un switch agrupado para mostrar a que estación del año pertenece: 
Invierno (12,1 y 2)
Primavera (3, 4 y 5)
Verano (6, 7 y 8)
Otoño (9, 10 y 11)*/
import java.util.Scanner;

public class meses {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        System.out.println("--- ESTACIONES DEL AÑO ---");
        System.out.println("[1] Enero");
        System.out.println("[2] Febrero");
        System.out.println("[3] Marzo");
        System.out.println("[4] Abril");
        System.out.println("[5] Mayo");
        System.out.println("[6] Junio");
        System.out.println("[7] Julio");
        System.out.println("[8] Agosto");
        System.out.println("[9] Septiembre");
        System.out.println("[10] Octubre");
        System.out.println("[11] Noviembre");
        System.out.println("[12] Diciembre");
        System.out.println("Escoge alguno!: ");
        int opcion = e.nextInt();
        switch (opcion){
            case 1, 2, 12:
                System.out.print("Es INVIERNO!!!");
                break;
            case 3, 4, 5:
                System.out.print("Es PRIMAVERA!!!");
                break;
            case 6, 7, 8:
                System.out.print("Es VERANO!!!");
                break;
            case 9, 10, 11:
                System.out.print("Es OTOÑO!!!");
                break;
           
        }
    }
}
