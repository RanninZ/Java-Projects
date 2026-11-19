import java.util.Scanner;

public class perimetro_area {
    public static void main (String[] args){
        Scanner a= new Scanner(System.in);
        double ancho;
        double largo;
        double area;
        double perimetro;

        System.out.print("Teclea el ancho");
        ancho=a.nextDouble();

        System.out.print("Teclea el largo");
        largo=a.nextDouble();

        area = largo * ancho;
        perimetro = 2*(ancho+largo);

        System.out.print("Estos son el area y el perimetro: " + area+"m"+perimetro+"m");
        

        
    }

    
}
