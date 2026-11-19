import java.util.Scanner;

public class calificacion {
    public static void main (String[] args) {
        Scanner a= new Scanner(System.in);
        int cF;
        int p;

        System.out.print("Teclea tu calificación final");
        cF=a.nextInt();

        if (cF<=100){
            if (cF>=70){
                System.out.print("Felicidades pasaste");
            }else {
                p = 70-cF;
                System.out.print("Reprobaste, te faltaron: " + p + "puntos");
            }
        } else {
            System.out.print("Numero invalido");
        }
    }
}
