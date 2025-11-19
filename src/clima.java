import java.util.Scanner;
public class clima {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que clima tienes en tu ciudad? Para recomendarte que utilzar");
        String clima = sc.nextLine();
        if(clima.equals("Lluvioso")){
            System.out.println("Paraguas");
        }else if(clima.equals("Soleado")){
            System.out.println("Bloqueador solar");
        }else if(clima.equals("Nublado")){
            System.out.println("Chaqueta ligera");
        }else {
            System.out.println("No es valido lo digitado");
        }
    }
}