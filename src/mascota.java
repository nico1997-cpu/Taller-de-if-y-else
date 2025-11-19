import  java.util.Scanner;
public class mascota Ejemplo10 {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Traes mascota?¿Y si es asi cual traes?");
        String Tipo=sc.nextLine();
        if (Tipo.equals("Perro")){
            System.out.println("Hay parque canino disponible");
        }else if (Tipo.equals("No tengo mascota")){
            System.out.println("Sin restricciones");
        }else if (Tipo.equals("Gato")){
            System.out.println("Bienvenido a la zona comun");
        }else if (Tipo.equals("Cerdito")){
            System.out.println("Bienvenido a la zona comun");
        }else if (Tipo.equals("Tortuga")){
            System.out.println("Bienvenido a la zona comun");
        }else if (Tipo.equals("Nutria")){
            System.out.println("Bienvenido a la zona comun");
        }else if (Tipo.equals("Caballo")){
            System.out.println("Bienvenido a la zona comun");
        }else if (Tipo.equals("Mono")){
            System.out.println("Bienvenido a la zona comun");
        }else
            System.out.println("Dato no valido");
    }
}
}