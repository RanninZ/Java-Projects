/* Ejercicio 4: Calculadora de promedio de calificaciones */
/* Un profesor necesita calcular el promedio de su grupo, pero no sabe exactamente 
cuantos alumnos vinieron hoy. El programa debe pedir calificaciones una por una y preguntar al final
de cada ingreso: "¿Desea ingresar otra calificacion? (s/n)". Cuando el profesor escribe 'n', el ciclo termina y calcula 
el promedio general */
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;


public class califwhile {
    public static void main(String[] args){
        String a_str, n_str;
        int i=1;
        double a, at=0, ap;
        boolean bandera = false;
        char n;
        do{
            a_str = JOptionPane.showInputDialog(null, "Ingresa la calificacion del alumno #"+i,"Promedio calificaciones", JOptionPane.INFORMATION_MESSAGE);
            a = Double.parseDouble(a_str);
            at = at + a;
            n_str = JOptionPane.showInputDialog(null, "¿Desea ingresar otra calificacion? Ingrese s = Si n = No", "Promedio calificaciones", JOptionPane.QUESTION_MESSAGE);
            n = n_str.charAt(0);
            switch(n){
                case 's':
                    bandera = true;
                    break;
                case 'n':
                    bandera = false;
                    break;
            }
            i++;
        }while (bandera);
        ap = at / i;
        JOptionPane.showMessageDialog(null, "El promedio de las calificaciones de "+i+" es de: "+ap);

    }
}