/*EJERCICIO B: Validador de Rango de Porcentaje (Notas de Examen)

    Solicitar al usuario la nota final de un examen, 
    asegurando estrictamente que el valor ingresado se encuentre en el rango de 0.0 a 10.0. */
import java.util.Scanner;
public class notas {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        double a;
        do{
            System.out.println("Ingresa el resultado del examen: ");
            a = e.nextDouble();
            if (a >10.0 || a<0.0){
                System.out.println("Error. Solo hay rangos de 0.0 a 10.0");
            }
        } while(a >10.0 || a<0.0);
        e.close();

    }
}