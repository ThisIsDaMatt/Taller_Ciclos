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
        System.out.print("Ingresa el límite inferior (n): ");
        int n = sc.nextInt();

        System.out.print("Ingresa el límite superior (m): ");
        int m = sc.nextInt();

        int numeroSecreto = (int) (Math.random() * (m - n + 1)) + n;

        int intento;
        boolean acerto = false;
        int intentos = 0;

        System.out.println("Adivina el número entre " + n + " y " + m);

        while (!acerto) {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
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
