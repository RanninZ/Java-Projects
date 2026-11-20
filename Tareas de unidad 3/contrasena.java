import java.util.Scanner;


//Contraseña con intentos. La contraseña correcta es 1234. 
// Pide la contraseña con un while; el usuario tiene máximo 3 intentos. 
// Si acierta, muestra “Acceso concedido” y en cuántos intentos lo logró. Si falla los 3, muestra “Cuenta bloqueada”.


public class contrasena {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        int contra;
        int intentos;
        intentos = 0;

        System.out.print("Ingresa la contraseña ");
        contra = e.nextInt();
        
        while (contra != 1234){
            System.out.print("Incorrecto. Intente de nuevo ");
            contra = e.nextInt();
            intentos = intentos + 1;
            if (intentos>=2){
            System.out.print("Superaste la cantidad de intentos.");
            System.exit(0);
            }    
            
        }
        

        System.out.print("Contraseña correcta.");
        e.close();
    }
}
