package calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que maneja operaciones de resta con diferentes tipos de números,
 * incluyendo enteros y reales. Además, mantiene un valor acumulado
 * que se puede ir restando sucesivamente.
 * <p>
 * Opción 1 - cálculo de la resta de dos números reales.
 * Opción 2 - cálculo de la resta de dos números enteros.
 * Opción 3 - cálculo de la resta de tres números reales.
 * Opción 4 - cálculo de la resta acumulada.
 * Opción 5 - regresar al menú principal de la calculadora.
 * <p>
 * @author Manuel Alejandro Lopez Ortega
 * @version 1.1*
 * <p>
 * URL repositorio Github: https://github.com/pvicSL/REPOACT2JavadocJUnitGLMP.git
 */
public class Resta {

    static Scanner sc = new Scanner(System.in);
    static float acumulado;
    static boolean primero = false;
    static boolean flag=true;
    /**
     * Presenta un menú de 5 opciones al usuario, con cuatro posibles
     * operaciones de resta con distintos parámetros.
     * <p>
     * El usuario debe introducir un número del 1 al 4 para operar,
     * o 5 si desea regresar al menú inicial de la calculadora.
     * <p>
     * @return devuelve la funcionalidad de la opción seleccionada.
     */
    public static void menuResta() {
        int introducido = 0;

        // Bucle infinito hasta que el usuario elija salir
        while (true) {
            System.out.println("Elige lo que deseas hacer:");
            System.out.println("\n1- Resta de 2 numeros reales.");
            System.out.println("2- Resta de 2 numeros enteros.");
            System.out.println("3- Resta de 3 numeros reales");
            System.out.println("4- Resta al acumulado");
            System.out.println("5- Volver al menu inicial.");

            try {
                introducido = sc.nextInt(); // Leer la opción seleccionada
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un numero entero.");
                sc.nextLine();  // Limpiar el buffer de entrada
                continue;  // Volver a pedir el menú
            }

            switch (introducido) {
                case 1:
                    while (true) {
                        try {
                            System.out.println("Introduzca el valor al que se le va a restar.");
                            float restareal1 = sc.nextFloat();
                            System.out.println("Introduzca el valor restado.");
                            float restareal2 = sc.nextFloat();
                            System.out.println("Resultado: " + restaReal(restareal1, restareal2));
                            break;  // Salir del bucle una vez que la entrada es válida
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debes ingresar numeros reales.");
                            sc.nextLine(); // Limpiar el buffer de entrada
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        try {
                            System.out.println("Introduzca el valor al que se le va a restar.");
                            int restarent1 = sc.nextInt();
                            System.out.println("Introduzca el valor restado.");
                            int restarent2 = sc.nextInt();
                            System.out.println("Resultado: " + restaEntero(restarent1, restarent2));
                            break;  // Salir del bucle una vez que la entrada es válida
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debes ingresar numeros enteros.");
                            sc.nextLine();  // Limpiar el buffer de entrada
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        try {
                            System.out.println("Introduzca el valor al que se le va a restar.");
                            float restatres1 = sc.nextFloat();
                            System.out.println("Introduzca el primer valor restado.");
                            float restatres2 = sc.nextFloat();
                            System.out.println("Introduzca el segundo valor restado.");
                            float restatres3 = sc.nextFloat();
                            System.out.println("Resultado: " + restarTres(restatres1, restatres2, restatres3));
                            break;  // Salir del bucle una vez que la entrada es válida
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debes ingresar numeros reales.");
                            sc.nextLine();  // Limpiar el buffer de entrada
                        }
                    }
                    break;

                case 4:
                    if (!primero) {
                        while (true) {
                            try {
                                System.out.println("Introduzca el valor al que se le va a restar.");
                                float restar = sc.nextFloat();
                                setAcumulado(restar);
                                primero = true;
                                System.out.println("Valor acumulado: " + getAcumulado());
                                break;  // Salir del bucle una vez que la entrada es válida
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Debes ingresar un numero real.");
                                sc.nextLine();  // Limpiar el buffer de entrada
                            }
                        }
                    } else {
                        while (true) {
                            try {
                                System.out.println("Introduzca el valor que se va a restar.");
                                float restar = sc.nextFloat();
                                System.out.println("Nuevo valor acumulado: " + restaAcumulada(restar));
                                break;  // Salir del bucle una vez que la entrada es válida
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Debes ingresar un numero real.");
                                sc.nextLine();  // Limpiar el buffer de entrada
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nRegresando...\n");
                    return;

                default:
                    System.out.println("Opcion incorrecta.");
            }
        }
    }

    /**
     * Resta dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El resultado de la resta de a y b.
     */
    public static int restaEntero(int a, int b) throws InputMismatchException {

            return a-b;
    }

    /**
     * Resta dos números reales (decimales).
     *
     * @param a El primer número real.
     * @param b El segundo número real.
     * @return El resultado de la resta de a y b.
     */
    public static float restaReal(float a, float b) throws InputMismatchException {

                return a - b;
    }

    /**
     * Resta tres números reales (decimales).
     *
     * @param a El primer número real.
     * @param b El segundo número real.
     * @param c El tercer número real.
     * @return El resultado de la resta de a, b y c.
     */
    public static float restarTres(float a, float b, float c) throws InputMismatchException {

                return a - b - c;
    }

    /**
     * Realiza una resta acumulada, es decir, resta el valor proporcionado al
     * valor acumulado actual.
     *
     * @param valor El valor a restar al acumulado.
     * @return El nuevo valor acumulado después de la resta.
     */
    public static float restaAcumulada(float valor) throws InputMismatchException {

                acumulado -= valor; // Resta el valor al acumulado
                return acumulado; // Retorna el valor acumulado
    }

    /**
     * Obtiene el valor acumulado actual.
     *
     * @return El valor acumulado.
     */
    public static float getAcumulado() {
        return acumulado;
    }

    /**
     * Establece el valor acumulado.
     *
     * @param acumulado El valor acumulado a establecer.
     */
    public static void setAcumulado(float acumulado) {
        Resta.acumulado = acumulado;
    }
}