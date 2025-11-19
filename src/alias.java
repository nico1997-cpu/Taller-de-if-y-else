import java.util.Scanner;

public class alias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu alias para la red social: ");
        String alias=scanner.nextLine();
        int longitud=alias.length();
        if (longitud<4) {
            System.out.println("Alias inválido: Debe tener al menos 3 caracteres");
        } else if (longitud>15) {
            System.out.println("Alias inválido: No puede tener más de 15 caracteres");
        } else if (alias.contains(" ")) {
            System.out.println("Alias inválido: No puede contener espacios");
        } else {
            System.out.println("Alias válido:Bienvenido @"+alias);
        }
        scanner.close();
    }
}