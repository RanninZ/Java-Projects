/*Un postulante a un empleo, realiza un test de capacitacion, se obtuvo la siguiente
informacion: cantidad total de preguntas que se realizan y la cantidad de preguntas que contesto correctamente.
Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo segun el porcentaje de 
respuestas correctas que ha obtenido, y sabiendo que.
Nivel maximo: Porcentaje >=90%
Nivel medio: Porcentaje >= 75% y <90%
Nivel regular: Porcentaje >=50% y 75%
Fuera de nivel: Porcentaje < 50% */

import java.util.Scanner; // Importar la libreria.

public class test_cap { // Crear el archivo.
    public static void main (String [] args){ // Inicio del metodo.
        Scanner e = new Scanner(System.in); // Declaramos el escaner.
        double p, r; // Creamos las variables enteras
        double porcent, res; // Creamos la variable del porcentaje y del resultado
        System.out.print("Ingresa la cantidad de preguntas: "); // Salida
        p = e.nextInt(); // Entrada
        System.out.print("Ingresa la cantidad de preguntas correctas: "); // Salida
        r = e.nextInt(); // Entrada
        res=(r/p);
        porcent = (res)*(100); // Proceso
        if (porcent>=90){ // Primera condicional
            System.out.print("Alcanzaste el nivel maximo."); // Salida
        } else if (porcent >= 75 && porcent<90){ // Segunda condicional
            System.out.print("Alcanzaste el nivel medio."); // Salida
        } else if (porcent >= 50 && porcent <75){ // Tercera condicional
            System.out.print("Alcanzaste el nivel regular."); // Salida
        }else if (porcent < 50){ // Ultima conidicional
            System.out.print("Estas fuera de nivel."); // Salida
        }
        e.close();
        
    }
}