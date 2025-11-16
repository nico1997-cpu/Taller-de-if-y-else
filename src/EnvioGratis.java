import java.util.Scanner;
public class EnvioGratis {    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.print("Haces parte de la mebresia? ");
    String mebresia = lector.next();
    System.out.println("¿Cual es el monto de la compra?");
    int monto= lector.nextInt();
    if (mebresia.equals("si")|| (monto >=50)){
        System.out.println("Envio gratis");
    }else {
        System.out.println("El envio tiene costo");
    }
}
}
