package calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que maneja operaciones de resta con diferentes tipos de números,
 * incluyendo enteros y reales. Además, mantiene un valor acumulado
 * que se puede ir restando sucesivamente.
 *
 * @author Manuel Alejandro Lopez Ortega
 * @version 1.1*
 */
public class Resta {

    static Scanner sc = new Scanner(System.in);
    static float acumulado;
    static boolean primero = false;
    static boolean flag=true;
    /**
     * Muestra un menú y maneja las diferentes opciones de resta elegidas por el usuario.
     * Permite restar 2 números reales, 2 números enteros, 3 números reales,
     * o restar al valor acumulado.
     */
    public static void menuResta() {
        int introducido = 0;

        // Bucle infinito hasta que el usuario elija salir
        while (true) {
            System.out.println("Elija como deseas restar:");
            System.out.println("\n1- Restar 2 numeros reales.");
            System.out.println("2- Restar 2 numeros enteros.");
            System.out.println("3- Restar 3 numeros reales");
            System.out.println("4- Restar al acumulado");
            System.out.println("\nIntroduzca 5 para salir.");

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
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción incorrecta.");
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
    public static int restaEntero(int a, int b) {
        return a - b;
    }

    /**
     * Resta dos números reales (decimales).
     *
     * @param a El primer número real.
     * @param b El segundo número real.
     * @return El resultado de la resta de a y b.
     */
    public static float restaReal(float a, float b) {
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
    public static float restarTres(float a, float b, float c) {
        return a - b - c;
    }

    /**
     * Realiza una resta acumulada, es decir, resta el valor proporcionado al
     * valor acumulado actual.
     *
     * @param valor El valor a restar al acumulado.
     * @return El nuevo valor acumulado después de la resta.
     */
    public static float restaAcumulada(float valor) {
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