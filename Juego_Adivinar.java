import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego_Adivinar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        int n = 0;
        boolean nValido = false;
        while (!nValido) {
            try {
                System.out.print("Ingresa el límite inferior (n): ");
                n = sc.nextInt();
                nValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número válido. Intenta de nuevo.");
                sc.next();
            }
        }

        int m = 0;
        boolean mValido = false;
        while (!mValido) {
            try {
                System.out.print("Ingresa el límite superior (m): ");
                m = sc.nextInt();
                mValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número válido. Intenta de nuevo.");
                sc.next();
            }
        }

        int numeroSecreto = (int) (Math.random() * (m - n + 1)) + n;

        int intento;
        boolean acerto = false;
        int intentos = 0;

        System.out.println("Adivina el número entre " + n + " y " + m);

        while (!acerto) {
            boolean intentoValido = false;
            intento = 0;

            while (!intentoValido) {
                try {
                    System.out.print("Tu intento: ");
                    intento = sc.nextInt();
                    intentoValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Eso no es un número válido. Intenta de nuevo.");
                    sc.next();
                }
            }

            intentos++;

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste en " + intentos + " intentos.");
                acerto = true;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número secreto es menor. Intenta de nuevo.");
            }
        }

        sc.close();
    }
}
