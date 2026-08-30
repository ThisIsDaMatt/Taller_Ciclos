import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================================================");
        System.err.println(" _____     _     _             _       ___  ___      _ _   _       _ _                \r\n" + //
                        "|_   _|   | |   | |           | |      |  \\/  |     | | | (_)     | (_)               \r\n" + //
                        "  | | __ _| |__ | | __ _    __| | ___  | .  . |_   _| | |_ _ _ __ | |_  ___ __ _ _ __ \r\n" + //
                        "  | |/ _` | '_ \\| |/ _` |  / _` |/ _ \\ | |\\/| | | | | | __| | '_ \\| | |/ __/ _` | '__|\r\n" + //
                        "  | | (_| | |_) | | (_| | | (_| |  __/ | |  | | |_| | | |_| | |_) | | | (_| (_| | |   \r\n" + //
                        "  \\_/\\__,_|_.__/|_|\\__,_|  \\__,_|\\___| \\_|  |_/\\__,_|_|\\__|_| .__/|_|_|\\___\\__,_|_|   \r\n" + //
                        "                                                            | |                       \r\n" + //
                        "                                                            |_|                       ");
        System.out.println("==================================================================================");

        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingresa el número del que quieres la tabla: ");
                numero = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número válido. Intenta de nuevo.");
                sc.next();
            }
        }

        System.out.println("Tabla del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
