
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double saldo;

        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el tu saldo actual");
        saldo = leer.nextDouble();
        
        if (saldo < 0) {
            System.out.println("Cuenta en mora");
        } else if (saldo >= 0 && saldo <= 100000) {
            System.out.println("Cuenta basica");
        } else {
            System.out.println("Cuenta Preferencial");
        }
            leer.close();}
}