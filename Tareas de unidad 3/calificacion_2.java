import java.util.Scanner;


public class calificacion_2 {

    public static void main (String[] args) {
        Scanner e = new Scanner(System.in);
        double calif1;
        double calif2;
        double calif3;
        double promedio;
        String nombre;
        String apellido;
        double puntos;

        System.out.print("Ingresa tu nombre: ");
        nombre = e.nextLine();

        System.out.print("Ingresa tu apellido: ");
        apellido = e.nextLine();

        System.out.print("Ingresa la primera calificacion: ");
        calif1 = e.nextDouble();
        System.out.print("Ingresa la segunda calificacion: ");
        calif2 = e.nextDouble();
        System.out.print("Ingresa la tercera calificacion: ");
        calif3 = e.nextDouble();

        promedio = (calif1+calif2+calif3)/3;

        if (promedio<70) {

            puntos = 70 - promedio;
            System.out.print("Hola "+nombre+" Tu calificacion promedio es de: "+promedio + " Lo siento reprobaste, te falto: "+puntos);
        } else {
            System.out.print("Hola "+nombre+apellido+"Felicidades aprobaste con un promedio de: "+promedio);
        }

        


    }

    
}
