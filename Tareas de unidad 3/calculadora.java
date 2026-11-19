import java.util.Scanner;





public class calculadora {

    static double a, multi, division, suma, resta;
    static Scanner e = new Scanner (System.in);
    static int r;
    public static void main (String[] args){
        int x;
        System.out.print("Que quieres hacer?");
        System.out.print("\n[1]Suma\n[2]Resta\n[3]Multiplicacion\n[4]Division\n[5]Salir\n: ");
        x = e.nextInt();


        while (x!=5){
            if (x==1){
                suma(e);
            }

            if (x==2){
                resta (e);
            }

            if (x==3){
                multi(e);
            }

            if (x==4){
                division(e);
            }
            System.out.println("Que quieres hacer?");
            System.out.print("\n[1]Suma\n[2]Resta\n[3]Multiplicacion\n[4]Division\n[5]Salir\n: ");
            x = e.nextInt();
        }
    }

    public static void suma (Scanner e){
        System.out.print("Cuantos numeros vas a sumar: ");
        int r = e.nextInt();
        suma = 0;
        for (int i=1; i<=r; i++){
            System.out.print("Dame los numeros que vas a sumar: ");
            double a = e.nextDouble();
            suma = suma + a;
            }
        System.out.println("La suma total es de: " + suma);
    }

    public static void resta (Scanner e){
        System.out.print("Cuantos numeros vas a restar: ");
        r = e.nextInt();
        resta = 0;
        for (int i=1; i<=r; i++){
            System.out.print("Dame los numeros que vas a restar: ");
            a = e.nextDouble();
            if (i==1){
                resta = a;
                } else {
                    resta = resta - a;
                }
                
            }
            System.out.println("La resta total es de: "+resta);
    }

    public static void multi (Scanner e){
        System.out.print("Cuantos numeros vas a multiplicar: ");
        r = e.nextInt();
        multi = 1;
        for (int i=1; i<=r; i++){
            System.out.print("Dame los numeros que vas a multiplicar: ");
            a = e.nextDouble();
            multi = multi * a;

        }
        System.out.println("La multiplicacion total es de: " + multi);
    }

    public static void division (Scanner e){
        System.out.print("Cuantos numeros vas a dividir: ");
        r = e.nextInt();
        division = 1;
        for (int i=1; i<=r; i++){
            System.out.print("Dame los numeros que vas a dividir: ");
            a = e.nextDouble();
            if (i==1){
                division = a;
            } else {
                division = division / a;
                }
                
        }

        System.out.println("La division final es de: "+division);
    }

    
}
