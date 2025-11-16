import java.util.Scanner;
public class Contraseña {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa tu contraseña ");
        String  cadena = lector.next();
        if (cadena.equals("secreto123")){
            System.out.printf("Acceso concedido");
        }else {
            System.out.printf("Acceso denegado");
        }
    }
}
