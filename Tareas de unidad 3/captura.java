import java.util.Scanner;

//Grupos de alumnos. Un while externo pregunta “¿Capturar otro grupo? (1 = si, 2 = no)”. 
// Por cada grupo, un for pide 5 calificaciones. 
// Por grupo muestra el promedio y cuántos reprobaron. 
// Al final muestra qué grupo tuvo el mejor promedio y el total de reprobados.



public class captura {
    public static void main (String[] args){
        Scanner e = new Scanner(System.in);
        double calif;
        int grupos;
        double promedio;
        int reprobados;
        int capturar;
        double total;
        double suma;

        System.out.print("Capturar otro grupo?");
        capturar = e.nextInt();
        
        while (capturar == 1){
            suma = 0;
            
            for (int i = 1; i<=5; i++){
                System.out.print("Dame la calificacion "+ i +": ");
                calif = e.nextDouble();

            }
            

        }
    }
}
