import java.util.Scanner;
public class pelicula  {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Dime que quieres publicar hoy? y claro que no contenga spoilers de una pelicula");
        String spoilers = sc.nextLine();
        if (spoilers.toLowerCase().contains("spoiler")) {
            System.out.println("!SIN SPOILERS DIJE");
        }else
            System.out.println( "Epa no me dijiste ningun spoiler");
    }
}