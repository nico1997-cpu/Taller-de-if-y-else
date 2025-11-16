import java.util.Scanner;
public class AproboExamen {
    public static void main(String[]args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe Tu Edad: ");
        int edad = lector.nextInt();
        Scanner lector2 = new Scanner(System.in);
        System.out.print("Aprobo Examen Teorico: ");
        String nota = lector2.next();
        if ((edad >= 18) && (nota.equals("true"))){
            System.out.print("Licencia Habilitada");
        }else {
            System.out.printf("No Cumple Los Requisitos");
        }
    }
}
