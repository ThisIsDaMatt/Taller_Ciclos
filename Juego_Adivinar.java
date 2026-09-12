import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego_Adivinar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int limInf = 0;
        int limSup = 0;
        int intento = 0;
        int intentos = 0;
        int secreto;
        boolean infOk = false;
        boolean supOk = false;
        boolean intentoOk;
        boolean acerto = false;

        System.out.println("============================================================");
        System.err.println("  ___      _ _       _                    _                                        \r\n" + //
                        " / _ \\    | (_)     (_)                  | |                                       \r\n" + //
                        "/ /_\\ \\ __| |___   ___ _ __   __ _    ___| |  _ __  _   _ _ __ ___   ___ _ __ ___  \r\n" + //
                        "|  _  |/ _` | \\ \\ / / | '_ \\ / _` |  / _ \\ | | '_ \\| | | | '_ ` _ \\ / _ \\ '__/ _ \\ \r\n" + //
                        "| | | | (_| | |\\ V /| | | | | (_| | |  __/ | | | | | |_| | | | | | |  __/ | | (_) |\r\n" + //
                        "\\_| |_/\\__,_|_| \\_/ |_|_| |_|\\__,_|  \\___|_| |_| |_|\\__,_|_| |_| |_|\\___|_|  \\___/ \r\n" + //
                        "                                                                                   \r\n" + //
                        "                                                                                   ");
        System.out.println("============================================================");

        while (!infOk) {
            try {
                System.out.print("Ingresa el límite inferior (n): ");
                limInf = lector.nextInt();
                infOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número válido. Intenta de nuevo.");
                lector.next();
            }
        }

        while (!supOk) {
            try {
                System.out.print("Ingresa el límite superior (m): ");
                limSup = lector.nextInt();
                supOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número válido. Intenta de nuevo.");
                lector.next();
            }
        }

        secreto = (int) (Math.random() * (limSup - limInf + 1)) + limInf;

        System.out.println("Adivina el número entre " + limInf + " y " + limSup);

        while (!acerto) {
            intentoOk = false;
            intento = 0;

            while (!intentoOk) {
                try {
                    System.out.print("Tu intento: ");
                    intento = lector.nextInt();
                    intentoOk = true;
                } catch (InputMismatchException e) {
                    System.out.println("Eso no es un número válido. Intenta de nuevo.");
                    lector.next();
                }
            }

            intentos++;

            if (intento == secreto) {
                System.out.println("¡Felicidades! Adivinaste en " + intentos + " intentos.");
                acerto = true;
            } else if (intento < secreto) {
                System.out.println("El número secreto es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número secreto es menor. Intenta de nuevo.");
            }
        }

        lector.close();
    }
}
