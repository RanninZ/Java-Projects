import java.util.Scanner;

public class descuento {
    public static void main (String[] args) {
        Scanner a= new Scanner(System.in);
        double pC;
        double pT;
        double d;
        int nC;

        System.out.print("Teclea la cantidad de camisas");
        nC=a.nextInt();
        
        System.out.print("Teclea el precio total de las camisas");
        pC=a.nextDouble();

        if (nC>=3) {
            d = pC * 0.20;
            
        }else {
            d = pC * 0.10;
        }
        pT = pC - d;

        System.out.print("Tu pago total de las "+nC+" es de " + pT);
    }
    
}
