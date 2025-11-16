import java.util.Scanner;
public class Inpar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Numero");
        int numero = lector.nextInt();
        if (numero % 2 == 0){
            System.out.print("Es par");
        }else {
            System.out.print("no es par");
        }
    }
}
