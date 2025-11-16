
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Edad");
        Scanner lector1 = new Scanner(System.in);
        int edad = lector1.nextInt();
        if (edad < 18) {
            System.out.printf("Nesecita un acompañante mayor de edad");
        } else if (edad >= 18) {
            System.out.printf("Puede Entrar");
        } else {
            System.out.printf("Dato Invalido");
        }
    }
}