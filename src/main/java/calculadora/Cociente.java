package calculadora;

import java.util.Scanner;

public class Cociente {

    /**
     * La clase Cociente representa un menú de funciones relacionadas con la operación cociente.
     * Las opciones son: división de números enteros, división de números reales,
     * inverso de un número real y raíz cuadrada.
     * @author Laura Vinseiro
     * @version 1.0*/

    static Scanner sc = new Scanner(System.in);

    public static void menuCociente() {


        System.out.println("¿Qué quieres hacer ahora? Introduce el número correspondiente a cada opción: ");
        System.out.println("1. División de dos números reales.");
        System.out.println("2. División de dos números enteros. ");
        System.out.println("3. Inverso de un número real. ");
        System.out.println("4. Raíz cuadrada de un número.");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                divisionReal();
                break;
            case 2:
                System.out.println(divisionEntero());
                break;
            case 3:
                System.out.println(inversoReal());
                break;
            case 4:
                System.out.println(raizCuadrada());
                break;
        } while (opcion <1 || opcion >4) {
            System.out.println("Opción no válida. Introduce otro número.");
            opcion = sc.nextInt();
        }
    }

    public static double divisionReal() {
        System.out.println("Introduce el dividendo: ");
        double dividendoReal = sc.nextDouble();
        System.out.println("Introduce el divisor: ");
        double divisorReal = sc.nextDouble();
        System.out.println("Resultado: " + dividendoReal / divisorReal);
        return dividendoReal/divisorReal;
    }

    public static int divisionEntero() {
        System.out.println("Introduce el dividendo: ");
        int dividendoEntero = sc.nextInt();
        System.out.println("Introduce el divisor: ");
        int divisorEntero = sc.nextInt();
        System.out.println("Resultado: " + dividendoEntero/divisorEntero);
        return dividendoEntero/divisorEntero;
    }

    public static double inversoReal() {
        System.out.println("Introduce el número a calcular: ");
        double numeroInverso = sc.nextDouble();
        System.out.println("Resultado: " + numeroInverso);
        return 1/numeroInverso;
    }

    public static double raizCuadrada() {
        System.out.println("Introduce el número a calcular: ");
        double raiz = sc.nextDouble();
        System.out.println("Resultado: " + raiz);
        return Math.sqrt(raiz);
    }
}
