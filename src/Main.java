import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int numero;
    static int opcion;
    static int i;
    static boolean impar = true;

    public static void main(String[] args) {
        //Ejercicio 2: Verificar si un número ingresado es primo
        do {
            menu();
            System.out.print("\nDIGITE UNA OPCIÓN: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("\n___________________________________");
                        System.out.print("DIGITE UN NÚMERO: ");
                        numero = sc.nextInt();
                        esPrimo();
                    } while (numero < 2);
                    System.out.println("___________________________________");

                    break;
                case 2:
                    System.out.println("\n¡GRACIAS POR USAR MI PROGRAMA! \uD83D\uDE0E");
                    break;
                default:
                    System.out.println("LA OPCIÓN ES INCORRECTA. DIGITE NUEVAMENTE.");
            }
        } while (opcion != 2);
    }

    //FUNCIÓN: MENU
    public static void menu() {
        System.out.println("\n===================================");
        System.out.println("  1. VERIFICAR NÚMERO");
        System.out.println("  2. SALIR");
        System.out.println("===================================");
    }
    //FUNCIÓN: VERIFICAR SI ES PRIMO
    public static void esPrimo() {
        if (numero > 1) {
            if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
                System.out.println("\uD83D\uDCA0 EL NÚMERO '" + numero + "' ES NÚMERO PRIMO \uD83D\uDCA0");
            } else if (numero % 2 == 0) {
                System.out.println("\uD83D\uDCA0 EL NÚMERO '" + numero + "' ES COMPUESTO \uD83D\uDCA0");
            } else {
                for (i = 3; i <= (int) Math.sqrt(numero); i +=2 ) {
                    if (numero % i == 0) {
                        impar = false;
                    }
                }
                if (impar == true) {
                    System.out.println("\uD83D\uDCA0 EL NÚMERO '" + numero + "' ES NÚMERO PRIMO \uD83D\uDCA0");
                } else {
                    System.out.println("\uD83D\uDCA0 EL NÚMERO '" + numero + "' ES COMPUESTO \uD83D\uDCA0");
                }
            }
        } else {
            System.out.println("EL NÚMERO TIENE QUE SER MAYOR A 1");
        }
    }
}
