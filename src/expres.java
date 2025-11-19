import java.util.Scanner;
public class expres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el tipo de envio si express o estadar");
        String tipo = sc.nextLine();
        if (tipo.equals("express")) {
            System.out.println("Tiene un costo extra");
        }else if (tipo.equals("estandar")) {
            System.out.println("No tendria un costo extra");
        }else  {
            System.out.println("No es valido lo digitado");
        }
    }
}