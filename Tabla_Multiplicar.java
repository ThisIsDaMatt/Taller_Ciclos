import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numTabla = 0;
        boolean numOk = false;

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

        while (!numOk) {
            try {
                System.out.print("Ingresa el número del que quieres la tabla: ");
                numTabla = lector.nextInt();
                numOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número válido. Intenta de nuevo.");
                lector.next();
            }
        }

        System.out.println("Tabla del " + numTabla + ":");

        for (int mult = 1; mult <= 10; mult++) {
            System.out.println(numTabla + " x " + mult + " = " + (numTabla * mult));
        }

        lector.close();
    }
}
