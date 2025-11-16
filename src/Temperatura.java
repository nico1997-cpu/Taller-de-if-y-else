import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Temperatura C°: ");
        int temp = lector.nextInt();
        if (temp < 10) {
            System.out.printf("Frio");
        } else if ((temp > 11) && (temp <= 25)) {
            System.out.printf("Agradable");
        } else {
            System.out.printf("Caloroso");
        }
    }
}
