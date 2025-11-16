
import java.util.Scanner;
public class Vacante {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Tiene licencia: ");
        String licencia = lector.next();
        //segundo escaner
        Scanner lector2 = new Scanner(System.in);
        System.out.print("Esta Vigente: ");
        String vigente = lector2.next();
        // tercer scaner
        Scanner lector3 = new Scanner(System.in);
        System.out.print("Categoria: ");
        String categoria = lector3.next();
        if((licencia.equals("si")) && (vigente.equals("si")) && (categoria.equals("si"))){
            System.out.printf("Puede Aplicar A Vacante");
        }else {
            System.out.printf("No puede aplicar a Vacante");
        }
    }
}


