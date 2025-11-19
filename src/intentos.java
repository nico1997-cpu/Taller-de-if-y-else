import java.util.Scanner;
public class intentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String contra="Juan27";
            String entrada;
            int intentos=3;
            while(intentos>0 ) {
            System.out.println("Pon la contraseña");
            entrada = scanner.nextLine();
            intentos--;
            if(entrada.equals(contra)) {
                        System.out.println("Tu Contraseña es correcta");
            } else if (intentos>0) {
                System.out.println("vuelvelo a intentar ");
            }
        }if (intentos == 0) {
            System.out.print("Usuario bloqueado");
        }
    }
}