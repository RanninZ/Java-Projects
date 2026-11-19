/* Ejercicio 4: Calculadora de promedio de calificaciones */
/* Un profesor necesita calcular el promedio de su grupo, pero no sabe exactamente 
cuantos alumnos vinieron hoy. El programa debe pedir calificaciones una por una y preguntar al final
de cada ingreso: "¿Desea ingresar otra calificacion? (s/n)". Cuando el profesor escribe 'n', el ciclo termina y calcula 
el promedio general */
import javax.swing.JOptionPane; // Importamos la liberia


public class califwhile { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        String a_str, n_str; // Declaracion de variables de cadena
        int i=1; // Variable contador
        double a, at=0, ap; // Variables reales
        boolean bandera = false; // Variable condicional en falso
        char n; // Variable de texto
        do{ // Hacer mientas bandera se mantenga en verdadero
            //Salida
            a_str = JOptionPane.showInputDialog(null, "Ingresa la calificacion del alumno #"+i,"Promedio calificaciones", JOptionPane.INFORMATION_MESSAGE);
            //Entrada
            a = Double.parseDouble(a_str);
            // Proceso del total
            at = at + a;
            //Salida
            n_str = JOptionPane.showInputDialog(null, "¿Desea ingresar otra calificacion? Ingrese s = Si n = No", "Promedio calificaciones", JOptionPane.QUESTION_MESSAGE);
            // Entrada
            n = n_str.charAt(0);
            switch(n){ // Condicional del dato que se ingreso
                case 's': // Si se escribe s
                    bandera = true; // bandera se convierte en verdadero por lo que se repite
                    break;
                case 'n': // Si se escribe n
                    bandera = false; // banera se convierte en falso por lo que se sale del ciclo
                    break;
            }
            i++;
        }while (bandera); // Fin del ciclo
        ap = at / i; // Promedio
        // Salida
        JOptionPane.showMessageDialog(null, "El promedio de las calificaciones de "+i+" es de: "+ap);

    } // Fin del metodo
} // Fin del ciclo