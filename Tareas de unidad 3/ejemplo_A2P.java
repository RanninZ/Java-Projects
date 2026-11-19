/* Crea un sitema de inicio de sesion basico. 
El programa primero debe pedir la contraseña del usuario.
Si la contraseña es incorrecta, muestra un error y termina.
Si la contraseña es correcta ("Admin123"), el sistema entra en una condicion anidada
y solicita un codigo numerico de verificacioin de 6 digitos que fue enviado al telefono.
Si el codigo es correcto (987654), otorga el acceso; de lo contrario, 
muestra un error de seguridad. */



import java.util.Scanner;


public class ejemplo_A2P {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        // -- PASO 1: SOLICITAR Y VALIDAR LA CONTRASEÑA --
        System.out.print("Ingrese su contraeña de acceso: ");
        String password = e.nextLine();

        // Primera capa de decision
        /* uso de equals(): Java optimiza la memoria guardando textos identicos en un lugar 
        llamdo String Pool 
        Si declaras dos textos directamente, == podria date true por casualidad.
        Pero su el texto vuebe de una base de datos, 
        del usuario o de un archivo, == fallará rotundamente: */
        if (password.equals("Admin123")){
            password = "Admin123";
            System.out.print("Contraseña correcta.");

            // Estructura anidada para el segundo factor (2FA o A2P)
            System.out.print("Ingrese el codigo enviado a su celular (6 digitos): ");
            int codigo = e.nextInt();

            if (codigo == 987654) {
                System.out.print("¡Acceso Total Concedido al Sistema");

            } else {
                System.out.print("Error: Codigo de verificacion incorrecto. Cuenta bloqueada.");

            }
        } else {
            System.out.println("Error: Contraseña incorrecta. Acceso Denegado");

        }

        e.close();
    }
}
