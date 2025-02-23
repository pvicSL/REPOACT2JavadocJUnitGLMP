package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cociente {

    /**
     * La clase Cociente representa un menú de funciones relacionadas con
     * las operaciones de cociente básicas.
     * <p>
     * Opción 1 - cálculo de la división de dos números reales.
     * Opción 2 - cálculo de la división de dos números enteros.
     * Opción 3 - cálculo del inverso de un número real.
     * Opción 4 - cálculo de la raíz cuadrada de un número real.
     * Opción 5 - regresar al menú principal de la calculadora.
     * <p>
     * @author Laura Vinseiro Gutiérrez
     * @version 2.0*
     * <p>
     * id gitHub: Lauu92
     * URL repositorio Github: https://github.com/pvicSL/REPOACT2JavadocJUnitGLMP.git
     */

    //Creación de objeto de clase Scanner para recibir el input del usuario.
    static Scanner sc = new Scanner(System.in);


    //Función de menú de la clase Producto, para mostrar opciones al usuario.
    /**
     * Presenta un menú de 5 opciones al usuario, con cuatro posibles
     * operaciones de cociente con distintos parámetros.
     * <p>
     * El usuario debe introducir un número del 1 al 4 para operar,
     * o 5 si desea regresar al menú inicial de la calculadora.
     * <p>
     * @return devuelve la funcionalidad de la opción seleccionada.
     */
    public static void menuCociente() {


        System.out.println("Elige lo que deseas hacer: ");
        System.out.println("\n1- Division de dos numeros reales.");
        System.out.println("2- Division de dos numeros enteros. ");
        System.out.println("3- Inverso de un numero real. ");
        System.out.println("4- Raiz cuadrada de un numero.");
        System.out.println("5- Volver al menu inicial.");


        while (!sc.hasNextInt()) {
            System.out.println("Has tecleado una letra.");
            System.out.println("Introduce un numero.");
            sc.nextLine();
        }

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                try {
                    System.out.println("Introduce el dividendo: ");
                    double dividendoReal = sc.nextDouble();
                    System.out.println("Introduce el divisor: ");
                    double divisorReal = sc.nextDouble();
                    divisionReal(dividendoReal, divisorReal);

                }
                catch (InputMismatchException e) {
                    System.out.println("Dato erroneo. No es un numero real.");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                Cociente.menuCociente();
                break;

            case 2:
                try {
                    System.out.println("Introduce el dividendo: ");
                    int dividendoEntero = sc.nextInt();
                    System.out.println("Introduce el divisor: ");
                    int divisorEntero = sc.nextInt();
                    divisionEntero(dividendoEntero, divisorEntero); }
                catch (InputMismatchException e) {
                    System.out.println("Dato erroneo. No es un numero entero.");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                Cociente.menuCociente();
                break;
            case 3:
                try {
                    System.out.println("Introduce el numero a calcular: ");
                    double numeroInverso = sc.nextDouble();
                    inversoReal(numeroInverso);
                }
                catch (InputMismatchException e) {
                    System.out.println("Dato erroneo. No es un numero real.");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                Cociente.menuCociente();
                break;
            case 4:
                try {
                    System.out.println("Introduce el numero a calcular: ");
                    double raiz = sc.nextDouble();
                    raizCuadrada(raiz);
                }
                catch (InputMismatchException e) {
                    System.out.println("Dato erroneo. No es un numero real.");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                Cociente.menuCociente();
                break;
            case 5:
                System.out.println("\nRegresando...\n");
                break;

        } while (opcion <1 || opcion >5) {
            System.out.println("Opcion no valida. Introduce otro numero.");
            opcion = sc.nextInt();

        }
    }

    //Métodos propios

    /**
     * Calcula el resultado de dividir un número real entre otro número real, ambos introducidos
     * por el usuario. El bucle while blinda que el usuario no pueda meter nunca un cero como divisor.
     * @param dividendoReal número real introducido por el usuario.
     * @param divisorReal número real introducido por el usuario.
     * @return dividendoReal/divisorReal.
     */

    public static double divisionReal(double dividendoReal, double divisorReal) throws InputMismatchException {
        while (divisorReal == 0) {
            System.out.println("Introduce otro numero. El divisor no puede ser cero.");
            divisorReal = sc.nextInt();
        }
        System.out.println("Resultado: " + dividendoReal / divisorReal);
        return dividendoReal/divisorReal;
    }

    /**
     * Calcula el resultado de dividir un número entero entre otro número entero introducidos
     * por el usuario. El bucle while blinda que el usuario no pueda meter nunca un cero como divisor.
     * Con InputMismatchException controlamos si el usuario pasa como parámetro un
     * número real.
     * @param divisorEntero número entero introducido por el usuario.
     * @param dividendoEntero número entero introducido por el usuario.
     * @return dividendoEntero / divisorEntero
     */

    public static int divisionEntero(int dividendoEntero, int divisorEntero) throws InputMismatchException {
        while (divisorEntero == 0) {
            System.out.println("Introduce otro numero. El divisor no puede ser cero.");
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
    public static double inversoReal(double numeroInverso) throws InputMismatchException {
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
    public static double raizCuadrada(double raiz) throws InputMismatchException {
        while (raiz < 0) {
            System.out.println("Introduce otro numero. No se puede calcular la raiz de un numero negativo.");
            raiz = sc.nextDouble();
        }
        System.out.println("Resultado: " + Math.sqrt(raiz));
        return Math.sqrt(raiz);

    }
}
