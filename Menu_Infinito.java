import java.util.Scanner;

public class Menu_Infinito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("______                                                 _      _           \r\n" + //
                        "| ___ \\                                               (_)    | |          \r\n" + //
                        "| |_/ / __ ___   __ _ _ __ __ _ _ __ ___   __ _    ___ _  ___| | ___  ___ \r\n" + //
                        "|  __/ '__/ _ \\ / _` | '__/ _` | '_ ` _ \\ / _` |  / __| |/ __| |/ _ \\/ __|\r\n" + //
                        "| |  | | | (_) | (_| | | | (_| | | | | | | (_| | | (__| | (__| | (_) \\__ \\\r\n" + //
                        "\\_|  |_|  \\___/ \\__, |_|  \\__,_|_| |_| |_|\\__,_|  \\___|_|\\___|_|\\___/|___/\r\n" + //
                        "                 __/ |                                                    \r\n" + //
                        "                |___/                                                     ");
        System.out.println("=================================================");
        System.out.println("Por favor, escoja una opción:");
        System.out.println("=================================================");
        System.out.println("1. Sumar n-esimo término de la serie de Fibonacci");
        System.out.println("2. Calcular el n-esimo número primo");
        System.out.println("3. Calcular las raices de una ecuación cuadrática");
        System.out.println("4. Calcular el promedio de n números");
        System.out.println("5. Salir");
        System.out.println("=================================================");
        System.out.print("Ingrese su selección: ");

        int opcion = sc.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("Sumar n-esimo término de la serie de Fibonacci");
                    System.out.println("==============================================");

                    System.out.print("Ingrese el termino que quiere encontrar: ");

                    int numeroTerminos = sc.nextInt();

                    if (numeroTerminos <= 0) {
                        System.out.println("El termino pedido es 0 o negativo!");
                        System.out.println("No se puede continuar.");

                        break;
                    }

                    int primerTermino = 0;
                    int segundoTermino = 1;

                    int terminoPrevio = primerTermino;
                    int termino = segundoTermino;

                    if (numeroTerminos == 1) {
                        System.out.println("=========================");
                        System.out.println("El termino " + numeroTerminos + " es: " + primerTermino);
                        System.out.println("=========================");

                        break;
                    } else if (numeroTerminos == 2) {
                        System.out.println("=========================");
                        System.out.println("El termino " + numeroTerminos + " es: " + segundoTermino);
                        System.out.println("=========================");

                        break;
                    }

                    // Se itera dos veces menos porque el caso 1 y 2 ya estan resueltos.
                    for (int i = 0; i < (numeroTerminos - 2); i++) {
                        int terminoSiguiente = termino + terminoPrevio;
                        terminoPrevio = termino;
                        termino = terminoSiguiente;
                    }
                    System.out.println("=========================");
                    System.out.println("El termino " + numeroTerminos + " es: " + termino);
                    System.out.println("=========================");

                    break;

                case 2:
                    System.out.println("================================");
                    System.out.println("Calcular el n-esimo número primo");
                    System.out.println("================================");

                    System.out.print("¿Qué número primo quieres encontrar (n): ");
                    int num = sc.nextInt();

                    if (num <= 0) {
                        System.out.println("El termino pedido es 0 o negativo!");
                        System.out.println("No se puede continuar.");
                    } else {
                        int contador = 0;
                        int numeroActual = 1;

                        while (contador < num) {
                            numeroActual++;
                            boolean esPrimo = true;

                            for (int i = 2; i <= Math.sqrt(numeroActual); i++) {
                                if (numeroActual % i == 0) {
                                    esPrimo = false;
                                    break;
                                }
                            }

                            if (esPrimo) {
                                contador++;
                            }
                        }

                        System.out.println("=================================");
                        System.out.println("El primo número " + num + " es: " + numeroActual);
                        System.out.println("=================================");
                    }
                    break;

                case 3:
                    System.out.println("==============================================");
                    System.out.println("Calcular las raices de una ecuación cuadrática");
                    System.out.println("==============================================");

                    System.out.print("Ingrese el coeficiente de x²: ");
                    double a = sc.nextDouble();

                    if (a == 0) {
                        System.out.println("No es una funcion cuadratica!");
                        System.out.println("No se puede continuar.");

                        break;
                    }

                    System.out.print("Ingrese el coeficiente de x: ");
                    double b = sc.nextDouble();

                    System.out.print("Ingrese el termino independiente: ");
                    double c = sc.nextDouble();

                    double discriminador = (b * b) - (4 * a * c);

                    if (discriminador < 0) {
                        double raizReal = (-b) / (2 * a);
                        double raizCompleja = Math.sqrt(-discriminador) / (2 * a);

                        String raizUno = raizReal + " + " + raizCompleja + "i";
                        String raizDos = raizReal + " - " + raizCompleja + "i";

                        System.out.println("==========================================================");
                        System.out.println("La raiz uno es: " + raizUno);
                        System.out.println("La raiz dos es: " + raizDos);
                        System.out.println("==========================================================");

                    } else if (discriminador == 0) {
                        double raiz = (-b) / (2 * a);

                        System.out.println("====================");
                        System.out.println("La raiz es: " + raiz);
                        System.out.println("====================");

                    } else {
                        double raizUno = ((-b) + Math.sqrt(discriminador)) / (2 * a);
                        double raizDos = ((-b) - Math.sqrt((discriminador))) / (2 * a);
                        
                        System.out.println("==========================================================");
                        System.out.println("La raiz uno es: " + raizUno);
                        System.out.println("La raiz dos es: " + raizDos);
                        System.out.println("==========================================================");

                    }

                    break;

                case 4:
                    System.out.println("=================================");
                    System.out.println("Calcular el promedio de n números");
                    System.out.println("=================================");
                    System.out.print("Ingresa la cantidad de numeros a calcular: ");

                    int n = sc.nextInt();

                    double suma = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.print("Ingresa el número " + i + ": ");
                        double numero = sc.nextDouble();
                        suma += numero;
                    }

                    double promedio = suma / n;

                    System.out.println("===========================");
                    System.out.println("El promedio es: " + promedio);
                    System.out.println("===========================");

                    break;

                default:
                    System.out.println("Por favor, ingrese una opción válida");
            }

            // Espaciador con la salida anterior.
            System.out.println();

            System.out.println("=================================================");
            System.out.println("______                                                 _      _           \r\n" + //
                                "| ___ \\                                               (_)    | |          \r\n" + //
                                "| |_/ / __ ___   __ _ _ __ __ _ _ __ ___   __ _    ___ _  ___| | ___  ___ \r\n" + //
                                "|  __/ '__/ _ \\ / _` | '__/ _` | '_ ` _ \\ / _` |  / __| |/ __| |/ _ \\/ __|\r\n" + //
                                "| |  | | | (_) | (_| | | | (_| | | | | | | (_| | | (__| | (__| | (_) \\__ \\\r\n" + //
                                "\\_|  |_|  \\___/ \\__, |_|  \\__,_|_| |_| |_|\\__,_|  \\___|_|\\___|_|\\___/|___/\r\n" + //
                                "                 __/ |                                                    \r\n" + //
                                "                |___/                                                     ");
            System.out.println("=================================================");
            System.out.println("Por favor, escoja una opción:");
            System.out.println("=================================================");
            System.out.println("1. Sumar n-esimo término de la serie de Fibonacci");
            System.out.println("2. Calcular el n-esimo número primo");
            System.out.println("3. Calcular las raices de una ecuación cuadrática");
            System.out.println("4. Calcular el promedio de n números");
            System.out.println("5. Salir");
            System.out.println("=================================================");
            System.out.print("Ingrese su selección: ");

            opcion = sc.nextInt();
        }

        System.out.println("=========================================");
        System.out.println("Gracias por usar el programa, hasta luego");
        System.out.println("=========================================");

        sc.close();
    }
}
