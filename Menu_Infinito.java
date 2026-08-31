import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu_Infinito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        while (true) {
            try {

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
                System.out.println("3. Calcular las raíces de una ecuación cuadrática");
                System.out.println("4. Calcular el promedio de n números");
                System.out.println("5. Salir");
                System.out.println("=================================================");

                System.out.print("Ingrese su selección: ");

                opcion = sc.nextInt();

                break;
            } catch (InputMismatchException e) {
                System.out.println("No es una opción valida!");
                System.out.println();

                sc.next(); // Limpia el buffer de sc.
            }
        }

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("Sumar n-esimo término de la serie de Fibonacci");
                    System.out.println("==============================================");

                    int numeroTerminos;

                    while (true) {
                        try {
                            System.out.print("Ingrese el termino que quiere encontrar: ");

                            numeroTerminos = sc.nextInt();

                            if (numeroTerminos <= 0) {
                                System.out.println("El termino pedido es 0 o negativo!");

                            } else {
                                break;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            sc.next();
                        }
                    }

                    int primerTermino = 0;
                    int segundoTermino = 1;

                    long terminoPrevio = primerTermino;
                    long termino = segundoTermino;

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

                    // Se itera dos veces menos porque el caso 1 y 2 ya están resueltos.
                    for (int i = 0; i < (numeroTerminos - 2); i++) {
                        long terminoSiguiente = termino + terminoPrevio;
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

                    int num;

                    while (true) {
                        try {
                            System.out.print("¿Qué número primo quieres encontrar (n): ");
                            num = sc.nextInt();

                            if (num <= 0) {
                                System.out.println("El termino pedido es 0 o negativo!");

                            } else {
                                break;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            sc.next();
                        }
                    }

                    int numeroActual;

                    // El 2 es el unico par primo, se debe tratar especialmente.
                    if (num == 1) {
                        numeroActual = 2;

                        // La raiz de 3 es 1 cuando se redondea, no funciona bien con el algoritmo.
                    } else if (num == 2) {
                        numeroActual = 3;

                    } else {
                        int contador = 2; // Los primeros dos casos están cubiertos.
                        numeroActual = 3;

                        while (contador < num) {
                            boolean esPrimo = true;
                            numeroActual = numeroActual + 2;

                            // Incremento para que i solo sea impar
                            for (int i = 3; i <= Math.sqrt(numeroActual); i = i + 2) {
                                if (numeroActual % i == 0) {
                                    esPrimo = false;
                                    break;
                                }
                            }

                            if (esPrimo) {
                                contador++;
                            }
                        }
                    }

                    System.out.println("=================================");
                    System.out.println("El primo número " + num + " es: " + numeroActual);
                    System.out.println("=================================");

                    break;

                case 3:
                    System.out.println("==============================================");
                    System.out.println("Calcular las raíces de una ecuación cuadrática");
                    System.out.println("==============================================");

                    double a;
                    double b;
                    double c;

                    while (true) {
                        try {
                            System.out.print("Ingrese el coeficiente de x²: ");
                            a = sc.nextDouble();

                            if (a == 0) {
                                System.out.println("No es una función cuadrática!");
                            } else {
                                break;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            sc.next();
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese el coeficiente de x: ");
                            b = sc.nextDouble();

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            sc.next();
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese el termino independiente: ");
                            c = sc.nextDouble();

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");
                            sc.next();
                        }
                    }


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

                    int n;

                    while (true) {
                        try {
                            System.out.print("Ingresa la cantidad de números a calcular: ");

                            n = sc.nextInt();

                            if (n > 0) {
                                break;
                            }

                            System.out.println("No es un número positivo!");

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            sc.next();
                        }

                    }
                    double suma = 0;

                    for (int i = 1; i <= n; i++) {
                        double numero;

                        while (true) {
                            try {
                                System.out.print("Ingresa el número " + i + ": ");
                                numero = sc.nextDouble();

                                break;

                            } catch (InputMismatchException e) {
                                System.out.println("No es un número!");

                                sc.next();
                            }
                        }

                        suma += numero;
                    }

                    double promedio = suma / n;

                    System.out.println("===========================");
                    System.out.println("El promedio es: " + promedio);
                    System.out.println("===========================");

                    break;

                default:
                    System.out.println("Por favor, ingrese una opción válida.");
            }

            while (true) {
                try {
                    // Espaciador con la salida anterior.
                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println("______                                                 _      _           " +
                            "\r\n" + //
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
                    System.out.println("3. Calcular las raíces de una ecuación cuadrática");
                    System.out.println("4. Calcular el promedio de n números");
                    System.out.println("5. Salir");
                    System.out.println("=================================================");

                    System.out.print("Ingrese su selección: ");

                    opcion = sc.nextInt();

                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No es una opción valida!");
                    System.out.println();

                    sc.next(); // Limpia el buffer de sc.
                }
            }
        }

        System.out.println("=========================================");
        System.out.println("Gracias por usar el programa, hasta luego.");
        System.out.println("=========================================");

        sc.close();
    }
}
