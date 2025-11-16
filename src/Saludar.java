import java.util.Scanner;
public class Saludar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Hora");
        int hora = lector.nextInt();
        if (hora <= 11){
            System.out.printf("Buenos Dias");
        }else if ((hora >= 12) && (hora <= 17)) {
            System.out.printf("Buenas Tardes");
        }else if ((hora >=18) && (hora <=24)){
            System.out.printf("Buenas noches");
        }
    }
}
