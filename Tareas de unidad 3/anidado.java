import java.util.Scanner;
 

//Determinar si la suma de cualquier pareja de ellos es iguall al tercer numero.
//Si cumple esta condicion, escribir "iguales y, en caso contrario, distintos."


public class anidado {
    public static void main (String[] args){
        Scanner e=new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        

        System.out.print("Dame el primer numero: ");
        n1 = e.nextInt();
        System.out.print("Dame el segundo numero: ");
        n2 = e.nextInt();
        System.out.print("Dame el tercer numero: ");
        n3 = e.nextInt();

        if (n3==n2+n1){
            System.out.print("Son iguales");

        }else {
            if (n2==n3+n1){
                System.out.print("Son iguales");


            }else {
                if (n1==n2+n3){
                    System.out.print("Son iguales");
                }else {
                    System.out.print("Son distintos");
                }
            }
        }

    }

    
}
