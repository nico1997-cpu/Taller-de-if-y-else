import java.util.Scanner;
public class bateria {
    static void main( ) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "¿Cuanto carga tiene de celular?");
        int porcentaje= sc.nextInt();
        if (porcentaje <=20) {
            System.out.println("Deberias cargar tu celular");
        }else if (porcentaje <=80){
            System.out.println("Suficiente");
        }else if (porcentaje >80){
            System.out.println("Alta bateria");
        }
    }
}