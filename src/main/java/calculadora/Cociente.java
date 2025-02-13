package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cociente {

    /**
     * La clase Cociente representa un menú de funciones relacionadas con la operación cociente.
     * Las opciones son: división de números enteros, división de números reales,
     * inverso de un número real y raíz cuadrada.
     * @author Laura Vinseiro
     * @version 2.0*
     * id gitHub: Lauu92
     */

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
                System.out.println("Introduce el dividendo: ");
                double dividendoReal = sc.nextDouble();
                System.out.println("Introduce el divisor: ");
                double divisorReal = sc.nextDouble();
                divisionReal(dividendoReal, divisorReal);
                break;
            case 2:
                try {
                    System.out.println("Introduce el dividendo: ");
                    int dividendoEntero = sc.nextInt();
                    System.out.println("Introduce el divisor: ");
                    int divisorEntero = sc.nextInt();
                    divisionEntero(dividendoEntero, divisorEntero); }
                catch (InputMismatchException e) {
                    System.out.println("Dato erróneo. No es un número real.");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                break;
            case 3:
                System.out.println("Introduce el número a calcular: ");
                double numeroInverso = sc.nextDouble();
                inversoReal(numeroInverso);
                break;
            case 4:
                System.out.println("Introduce el número a calcular: ");
                double raiz = sc.nextDouble();
                raizCuadrada(raiz);
                break;
        } while (opcion <1 || opcion >4) {
            System.out.println("Opción no válida. Introduce otro número.");
            opcion = sc.nextInt();
        }
    }

    //Métodos propios

    /**
     * Calcula el resultado de dividir un número real entre otro número real introducidos
     * por el usuario. El bucle while blinda que el usuario no pueda meter nunca un cero como divisor.
     * @param dividendoReal múmero real introducido por el usuario.
     * @param divisorReal múmero real introducido por el usuario.
     * @return dividendoReal/divisorReal.
     */

    public static double divisionReal(double dividendoReal, double divisorReal) {
        while (divisorReal == 0) {
            System.out.println("Introduce otro número. El divisor no puede ser cero.");
            divisorReal = sc.nextInt();
        }
        System.out.println("Resultado: " + dividendoReal / divisorReal);
        return dividendoReal/divisorReal;
    }

    /**
     * Calcula el resultado de dividir un número entero entre otro númer entero introducidos
     * por el usuario. El bucle while blinda que el usuario no pueda meter nunca un cero como divisor.
     * Con InputMismatchException controlamos si el usuario pasa como parámetro un
     * número real.
     * @param divisorEntero número entero introducido por el usuario.
     * @param dividendoEntero número entero introducido por el usuario.
     * @return dividendoEntero / divisorEntero
     */

    public static int divisionEntero(int dividendoEntero, int divisorEntero) throws InputMismatchException{
        while (divisorEntero == 0) {
            System.out.println("Introduce otro número. El divisor no puede ser cero.");
            divisorEntero = sc.nextInt();
        }
        System.out.println("Resultado: " + dividendoEntero / divisorEntero);
        return dividendoEntero / divisorEntero;
    }

    /**
     * Calcula el número inverso de un número real introducido por el usuario.
     * @param numeroInverso número real introducido por el usuario.
     * @return 1/numeroInverso.
     */
    public static double inversoReal(double numeroInverso) {
        System.out.println("Resultado: " + 1/numeroInverso);
        return 1/numeroInverso;
    }

    /**
     * Calcula la raíz cuadrada de un número real introducido por el usuario.
     * El while blinda que el usuario no pueda introducir un número negativo,
     * ya que no podemos calcular la raíz cuadrada de un negativo.
     * @param raiz número real introducido por el usuario.
     * @return Math.sqrt(raiz).
     */
    public static double raizCuadrada(double raiz) {
        while (raiz < 0) {
            System.out.println("Introduce otro número. No se puede calcular la raíz de un número negativo.");
            raiz = sc.nextDouble();
        }
        System.out.println("Resultado: " + Math.sqrt(raiz));
        return Math.sqrt(raiz);

    }
}
