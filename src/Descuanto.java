import java.util.Scanner;
public class Descuanto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Eres VIP? ");
        String vip = lector.next();

        System.out.print("Cuentas Con Cupon? ");
        String cupon = lector.next();

        if (vip.equals("si") || (cupon.equals("si"))) {
            System.out.printf("aplicar descuento");
        } else {
            System.out.printf("No Aplica Descuneto");
        }
    }
}

