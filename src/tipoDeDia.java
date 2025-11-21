import java.util.Scanner;
public class tipoDeDia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es de noche? (true/false): ");
        boolean esDeNoche = scanner.nextBoolean();
        System.out.print("¿La puerta está abierta? (true/false): ");
        boolean puertaAbierta = scanner.nextBoolean();

        if (esDeNoche && puertaAbierta) {
            System.out.println("Deeberias segura la puerta");
        } else {
            System.out.println("Esta todo bien");
        }
    }
}