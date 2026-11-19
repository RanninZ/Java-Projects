import java.util.Scanner;


public class sueldos {
    public static void main (String[] args) {
        Scanner cS = new Scanner(System.in);
        int s;
        int a;
        int b;
    
        int suma;

        suma = 0;
        s = 0;
        a = 0;
        b = 0;

        for (int x = 1; x <= 8; x++) {
            System.out.print("Ingresa tu sueldo");
            s=cS.nextInt();
            suma = s+suma;
            if (s<=8000) {
                b = b+1;
            } else {
                a = a+1;
            }



        }
        System.out.print(b+ " Tienen sueldo base " + a + " tienen sueldo alto, la cantidad total que se gasto la empresa es: $" + suma);
    }   
}
