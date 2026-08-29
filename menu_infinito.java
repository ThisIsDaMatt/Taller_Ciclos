import java.util.Scanner;

public class menu_infinito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("Bienvenido al programa");
        System.out.println("=================================================");
        System.out.println("Por favor, escoja una opción:");
        System.out.println("=================================================");
        System.out.println("1. Sumar n-esimo término de la serie de Fibonacci");
        System.out.println("2. Calcular el n-esimo número primo");
        System.out.println("3. Calcular las raices de una ecuación cuadrática");
        System.out.println("4. Calcular el promedio de n números");
        System.out.println("0. Salir");
        System.out.println("=================================================");
        

        Integer opcion = sc.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Sumar n-esimo término de la serie de Fibonacci");
            }
        }

    }
}