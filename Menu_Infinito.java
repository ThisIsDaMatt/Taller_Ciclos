import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu_Infinito {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        int cantTerm = 0;
        int term1 = 0;
        int term2 = 1;
        int numPrimo = 0;
        int primo = 0;
        int contPrimos = 0;
        int cantNum = 0;
        int indice;
        long ant = term1;
        long act = term2;
        long sig;
        double coefA = 0;
        double coefB = 0;
        double coefC = 0;
        double discr;
        double raizReal;
        double raizComp;
        double raiz1;
        double raiz2;
        double suma = 0;
        double promedio;
        double numIng;
        boolean esPrimo;
        String raizComp1;
        String raizComp2;

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

                opcion = lector.nextInt();

                break;
            } catch (InputMismatchException e) {
                System.out.println("No es una opción valida!");
                System.out.println();

                lector.next(); // Limpia el buffer de entrada.
            }
        }

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("Sumar n-esimo término de la serie de Fibonacci");
                    System.out.println("==============================================");

                    while (true) {
                        try {
                            System.out.print("Ingrese el termino que quiere encontrar: ");

                            cantTerm = lector.nextInt();

                            if (cantTerm <= 0) {
                                System.out.println("El termino pedido es 0 o negativo!");

                            } else {
                                break;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            lector.next();
                        }
                    }

                    ant = term1;
                    act = term2;

                    if (cantTerm == 1) {
                        System.out.println("=========================");
                        System.out.println("El termino " + cantTerm + " es: " + term1);
                        System.out.println("=========================");

                        break;
                    } else if (cantTerm == 2) {
                        System.out.println("=========================");
                        System.out.println("El termino " + cantTerm + " es: " + term2);
                        System.out.println("=========================");

                        break;
                    }

                    // Se itera dos veces menos porque el caso 1 y 2 ya están resueltos.
                    for (indice = 0; indice < (cantTerm - 2); indice++) {
                        sig = act + ant;
                        ant = act;
                        act = sig;
                    }
                    System.out.println("=========================");
                    System.out.println("El termino " + cantTerm + " es: " + act);
                    System.out.println("=========================");

                    break;

                case 2:
                    System.out.println("================================");
                    System.out.println("Calcular el n-esimo número primo");
                    System.out.println("================================");

                    while (true) {
                        try {
                            System.out.print("¿Qué número primo quieres encontrar (n): ");
                            numPrimo = lector.nextInt();

                            if (numPrimo <= 0) {
                                System.out.println("El termino pedido es 0 o negativo!");

                            } else {
                                break;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            lector.next();
                        }
                    }

                    // El 2 es el unico par primo, se debe tratar especialmente.
                    if (numPrimo == 1) {
                        primo = 2;

                        // La raiz de 3 es 1 cuando se redondea, no funciona bien con el algoritmo.
                    } else if (numPrimo == 2) {
                        primo = 3;

                    } else {
                        contPrimos = 2; // Los primeros dos casos están cubiertos.
                        primo = 3;

                        while (contPrimos < numPrimo) {
                            esPrimo = true;
                            primo = primo + 2;

                            // Incremento para que i solo sea impar
                            for (indice = 3; indice <= Math.sqrt(primo); indice = indice + 2) {
                                if (primo % indice == 0) {
                                    esPrimo = false;
                                    break;
                                }
                            }

                            if (esPrimo) {
                                contPrimos++;
                            }
                        }
                    }

                    System.out.println("=================================");
                    System.out.println("El primo número " + numPrimo + " es: " + primo);
                    System.out.println("=================================");

                    break;

                case 3:
                    System.out.println("==============================================");
                    System.out.println("Calcular las raíces de una ecuación cuadrática");
                    System.out.println("==============================================");

                    while (true) {
                        try {
                            System.out.print("Ingrese el coeficiente de x²: ");
                            coefA = lector.nextDouble();

                            if (coefA == 0) {
                                System.out.println("No es una función cuadrática!");
                            } else {
                                break;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            lector.next();
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese el coeficiente de x: ");
                            coefB = lector.nextDouble();

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            lector.next();
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese el termino independiente: ");
                            coefC = lector.nextDouble();

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");
                            lector.next();
                        }
                    }


                    discr = (coefB * coefB) - (4 * coefA * coefC);

                    if (discr < 0) {
                        raizReal = (-coefB) / (2 * coefA);
                        raizComp = Math.sqrt(-discr) / (2 * coefA);

                        raizComp1 = raizReal + " + " + raizComp + "i";
                        raizComp2 = raizReal + " - " + raizComp + "i";

                        System.out.println("==========================================================");
                        System.out.println("La raiz uno es: " + raizComp1);
                        System.out.println("La raiz dos es: " + raizComp2);
                        System.out.println("==========================================================");

                    } else if (discr == 0) {
                        raizReal = (-coefB) / (2 * coefA);

                        System.out.println("====================");
                        System.out.println("La raiz es: " + raizReal);
                        System.out.println("====================");

                    } else {
                        raiz1 = ((-coefB) + Math.sqrt(discr)) / (2 * coefA);
                        raiz2 = ((-coefB) - Math.sqrt((discr))) / (2 * coefA);

                        System.out.println("==========================================================");
                        System.out.println("La raiz uno es: " + raiz1);
                        System.out.println("La raiz dos es: " + raiz2);
                        System.out.println("==========================================================");

                    }

                    break;

                case 4:
                    System.out.println("=================================");
                    System.out.println("Calcular el promedio de n números");
                    System.out.println("=================================");

                    while (true) {
                        try {
                            System.out.print("Ingresa la cantidad de números a calcular: ");

                            cantNum = lector.nextInt();

                            if (cantNum > 0) {
                                break;
                            }

                            System.out.println("No es un número positivo!");

                        } catch (InputMismatchException e) {
                            System.out.println("No es un número entero!");

                            lector.next();
                        }

                    }
                    suma = 0;

                    for (indice = 1; indice <= cantNum; indice++) {
                        while (true) {
                            try {
                                System.out.print("Ingresa el número " + indice + ": ");
                                numIng = lector.nextDouble();

                                break;

                            } catch (InputMismatchException e) {
                                System.out.println("No es un número!");

                                lector.next();
                            }
                        }

                        suma += numIng;
                    }

                    promedio = suma / cantNum;

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

                    opcion = lector.nextInt();

                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No es una opción valida!");
                    System.out.println();

                    lector.next(); // Limpia el buffer de entrada.
                }
            }
        }

        System.out.println("=========================================");
        System.out.println("Gracias por usar el programa, hasta luego.");
        System.out.println("=========================================");

        lector.close();
    }
}
