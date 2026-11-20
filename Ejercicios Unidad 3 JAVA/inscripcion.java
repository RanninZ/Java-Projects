/*EJERCICIO A: Simulador de Inscripción Universitaria con Control Total
Un sistema que administra la inscripción de materias para un alumno. Utiliza un do-while para el menú, un switch para elegir la facultad, 
un while para validar los créditos disponibles y un for para desglosar el calendario de pagos. */
import java.util.Scanner; // Importamos la liberia de escaner
public class inscripcion { // Inicio del programa
    public static void main(String[] args){ // Inicio del metodo
        Scanner e = new Scanner(System.in); // Declaramos la variable de lectura
        String facultad = "Sin seleccionar", lista=""; // Declaramos la variable de tipo cadena o texto
        int creditos = 30, creditos_t=0, materias=0, opcion; // Declaramos las variables enteras
        double costo = 0, cuota = 1500.00; // Declaramos las variables con punto decimal
        do{ // Hacer mientras opcion no sea igual a 5
            System.out.println("-----INCRIPCION DEL ITD-----"); // Salida (titulo)
            System.out.println("Facultad: "+facultad); // Salida (Facultad actual)
            System.out.println("Creditos disponibles: "+(creditos - creditos_t)); // Salida (Creditos disponibles)
            System.out.println("[1] Elige la facultad"); // Salida (Primera opcion)
            System.out.println("[2] Inscribirse a una materia"); // Salida (Segunda opcion)
            System.out.println("[3] Ver tus materias"); // Salida (Tercera opcion)
            System.out.println("[4] Calendario de pagos"); // Salida (Cuarta opcion)
            System.out.println("[5] Salida"); // Salida (quinta opcion)
            System.out.print("Selecciona una opcion: "); // Salida (eleccion)
            opcion = e.nextInt(); // Entrada
            switch (opcion){ // switch  dependiendo lo que se pulso
                case 1: // Si se oprimio 1
                    System.out.println("\n[1] Ingeneria en sistemas computacionales: ($900 / credito)"); // Salida Ing en sistemas
                    System.out.println("[2] Ingeneria en TICs: ($800 / credito)"); // Salida Ing en TICs
                    System.out.println("[3] Ingeneria en informatica: ($750 / credito)"); // Salida Ing en informatica
                    System.out.println("[4] Ingeneria en Inteligencia Artificial ($1,000 / credito)"); // Salida IA
                    int a = e.nextInt(); // Entrada
                    switch (a){ // Switch dependiento lo que se pulso en la variable a
                        case 1:  // Si se oprimio 1
                            facultad = "Sistemas computacionales"; // Facultad deja de ser "Sin facultad" a " Sistemas computacionales"
                            costo = 900; // El costo se vuelve de 900
                            break; // ruptura
                        case 2: // Si se oprimio 2
                            facultad = "TICs"; // Facultad deja de ser "Sin facultad" a "TICs"
                            costo = 800; // El costo se vuelve de 800
                            break; // ruptura
                        case 3: // Si se oprimio 3
                            facultad = "Informatica"; // Facultad deja de ser "Sin facultad" a "Informatica"
                            costo = 750; // El costo se vuelve de 750
                            break; // ruptura
                        case 4: // Si se oprimio 4
                            facultad = "IA"; // Facultad deja de ser "Sin facultad" a "Inteligencia artificial"
                            costo = 1000; // El costo se vuelve de 1000
                            break; // ruptura
                        default: // Si no se oprimio ningun numero anterior
                            System.out.println("Facultad invalida."); // Salida de error

                            
                    }
                    if (costo > 0 ){ // Si el costo es mayor a 0
                        System.out.println("Facultad seleccionada: "+ facultad); // Salida la seleccion se vuelve verdadera
                    }
                    break; // ruptura
                case 2: // Si oprimio 2
                    if (costo == 0){ // Si costo es igual a 0 
                        System.out.println("Primero elige una facultad."); // Salida
                        break; // ruptura
                    } // Fin de la condicional
                    int disponibles = creditos - creditos_t; // Se declara una variable disponibles que es igual a la resta de los 30 creditos que ya teniamos menos los creditos que usamos
                    if (disponibles == 0){ // Si disponibles es igual a 0
                        System.out.println("Alcanzaste el maximo de creditos"); // Salida
                        break; // Ruptura
                    } // Fin de la condicional
                    System.out.print("Nombre de la materia: "); // Salida
                    e.nextLine(); // Salto de linea
                    String nombre = e.nextLine(); // Entrada

                    System.out.print("Creditos de la materia (disponibles: "+disponibles+"): "); // Creditos de la materia a la que se va a inscribir
                    int c = e.nextInt(); // entrada

                    while (c<=0 || c > disponibles){ // Mientras c sea menor o igual a 0 o c sea mayor a disponibles
                        System.out.print("Invalido. Ingresa entre 1 y "+disponibles+" creditos: "); // Salida
                        c = e.nextInt(); // Entrada
                    } // Fin del ciclo
                    materias++; // Incremento al valor de materias
                    lista = lista + materias + ",  " + nombre + " - " + c + " creditos\n"; // la list a de materias
                    creditos_t = creditos_t + c; // Se suma los creidtos que vas a usar
                    System.out.println("Materia inscrita: "+nombre+" ("+c+" creditos)"); // Salida
                    break; // ruptura
                case 3: // Si se oprimio 3
                    if(materias == 0){ // Si materias es igual a 0
                        System.out.println("No hay materias inscritas"); // Salida

                    } else { // Si no
                        System.out.println("\n --- Materias inscritas ---"); // Salida (titulo)
                        System.out.print(lista); // Salida

                    } // Fin del condicional
                    break; // ruptura
                case 4: // Si se oprimio 4
                    if (creditos_t == 0){ // Si los creditos usados son 0 
                        System.out.println("Tienes que inscribirte a una primero"); // Salida
                        break; // ruptura
                    }
                    double total = cuota + creditos_t * costo; // Declaracion de una variable total con la operacion
                    System.out.println("\n Total a pagar: $"+ total); // Salida
                    System.out.println("En cuantos pagos? (1-6): "); // Salida
                    int pagos = e.nextInt(); // Entrada
                    while (pagos < 1 || pagos > 6){ // Mientras pagos sea menor a 1 o mayor a 6
                        System.out.print("Elige entre 1 y 6 pagos: "); // Salida
                        pagos = e.nextInt(); // Entrada

                    }// Fin del ciclo
                    double monto = total / pagos; // Declaracion de variable monto que es igual al total entre los pagos
                    System.out.println("\n --- Calendario de pagos ---"); // Salida (titulo)
                    for (int i = 1 ; i<=pagos; i++){ // Para que se cumpla la siguiente condicion i tiene que ser menor o igual a pagos
                        double saldo = total - monto * i; // Declaracion de la variable saldo que es igual a total menos monto por el incremento
                        System.out.println("Pago del mes #"+i+ " Saldo restante: $"+saldo); // Salida

                    } // Fin del ciclo
                    break; // ruptura
                case 5: // Si se oprimio 5
                    System.out.println("Hasta luego!"); // Salida
                    break; // ruptura
                default: // Si no se oprimio ninguno de los numeros anteriormente mencionados
                    System.out.println("Opcion no valida"); // Salida
            } // Fin del switch
        } while (opcion != 5); // Fin del ciclo

        e.close(); // Cierre de la variable de lectura
    } // Fin del metodo
} // Fin del programa
