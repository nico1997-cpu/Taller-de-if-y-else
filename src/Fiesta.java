import java.util.Scanner;
public class Fiesta {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe Tu Edad: ");
        int edad = lector.nextInt();
        // cantidad de cupos
        int cantidad = 2;
        if (edad >= 18) {
            if (cantidad > 0) {
                System.out.print("Puede pasar");
                cantidad--;
            } else {
                System.out.print("no puede entrar no hay cupos");
            }
        }else {
            System.out.print("debe ser mayor de edad");
        }
    }
}
