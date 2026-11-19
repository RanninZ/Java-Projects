import java.util.Scanner;



public class busca_minas {


    int filas, columnas, totalMinas;
    boolean [][] mina, abierta, marcada;
    int [][] vecinas;
    int casillasAbiertas = 0;
    public static void main (String[] args){
        Scanner e = new Scanner(System.in);
        static int lEntero = (Scanner e, String mensaje, int min, int max) {
            while (true) {
                System.out.print(mensaje);
                try {
                    int n = Integer.parseInt(sc.nextLine().tim());
                    if (n>= min && n<=max)return n;
                } catch (NumberFormatException e){ }
                System.out.print("Escribe el numero "+min+" y "+max);
            }
        }
    }    
}
