
import java.util.Scanner;
public class semaforo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Color de Semaforo: ");
        String color = lector.next();
        if (color.equals("verde")) {
            System.out.print("Puede seguir");
        }else if (color.equals("amarillo")){
            System.out.print("Atento");
        }else if(color.equals("rojo")){
            System.out.print("No Puede Pasar");
    }else {
            System.out.printf("incorrecto");}
    }

}
