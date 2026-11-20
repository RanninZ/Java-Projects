import java.util.Scanner;

//Contraseñas de varios usuarios. Hay 4 usuarios (for). Cada uno tiene máximo 3 intentos para escribir la contraseña 1234 (while). 
// Por cada usuario muestra si entró o quedó bloqueado y en cuántos intentos. 
// Al final muestra cuántos entraron y cuántos se bloquearon.

public class contras_varios_us {
    public static void main (String[] args){
        Scanner e = new Scanner(System.in);
        int contra;
        int bloqueado;
        int intentos;
        int entro;

        bloqueado = 0;
        entro = 0;
        intentos = 0;

        for (int i = 1; i<=4; i++){

            System.out.print("Introduce tu contraseña");
            contra = e.nextInt();
            while (intentos==3) {
                System.out.print("Tienes: " + intentos+ " intentos");
                System.out.print("Ingresa la contraseña: ");
                contra = e.nextInt();
                if (contra ==1234){
                    System.out.print("Entraste, bienvenid@");
                    entro = entro +1;
                } else {
                    System.out.print("Incorrecto, intente de nuevo: ");
                
                }
                intentos = intentos + 1;
                if (intentos ==3){
                    bloqueado = bloqueado + 1;
                }
            }
            
            

            
        }

        System.out.print("En los 4 usuarios: \n"+ bloqueado + " bloqueados\n" + entro + " entraron");
        e.close();

    }
}
