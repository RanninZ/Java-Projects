import java.util.Scanner;

public class sueldosboolean {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int n;
        int i=1, sueldoAlto=0, sueldoNormal=0;
        double sueldo=0, total=0;
        boolean bandera = false;
        System.out.println("Ingrese el numero de empleados: ");
        n = e.nextInt();
        while(i<=n){
            bandera = false;
            while(!bandera){
                System.out.println("Ingrese el sueldo del trabajador " + i+" rango entre $100 y $500");
                sueldo = e.nextDouble();
                if(sueldo>=100 && sueldo<=500){
                    bandera = true;
                } else{
                    System.out.println("El sueldo que esta ingresando no esta en el rango requerido");
                }

            }

            if(sueldo>=100 && sueldo<=300){
                sueldoNormal++;
            }else{
                sueldoAlto++;
            }
            total+=sueldo;
            i++;
        }
        System.out.println("La cantidad de empleados que tiene un sueldo normal es de: "+sueldoNormal);
        System.out.println("La cantidad de empleados que tiene un sueldo alto es de: "+sueldoAlto);
        System.out.println("El total de los sueldos es de: $"+total); 

    }
}