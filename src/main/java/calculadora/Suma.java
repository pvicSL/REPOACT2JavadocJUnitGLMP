package calculadora;
import java.util.Scanner;

import java.util.InputMismatchException;

/**
 * Clase que maneja operaciones de suma con diferentes tipos de números,
 * incluyendo enteros y reales. Además, mantiene un valor acumulado
 * que se puede ir sumando sucesivamente.
 *
 * @author Gregory López Gómez
 * @version 1.2*
 */
public class Suma {

    static Scanner sc = new Scanner(System.in);
    static float acumulado;
    static boolean primero = false;
    static boolean flag=true;
    /**
     * Muestra un menú y maneja las diferentes opciones de suma elegidas por el usuario.
     * Permite sumarr 2 números reales, 2 números enteros, 3 números reales,
     * o sumar al valor acumulado.
     */
    public static void menuResta() {
        int introducido = 0;

        // Bucle infinito hasta que el usuario elija salir
        while (true) {
            System.out.println("Elija como deseas sumar:");
            System.out.println("\n1+ Sumar 2 numeros reales.");
            System.out.println("2+ Sumar 2 numeros enteros.");
            System.out.println("3+ Sumar 3 numeros reales");
            System.out.println("4+ Sumar al acumulado");
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
                            System.out.println("Introduzca el valor al que se le va a sumar.");
                            float sumarreal1 = sc.nextFloat();
                            System.out.println("Introduzca el valor sumado.");
                            float sumarreal2 = sc.nextFloat();
                            System.out.println("Resultado: " + sumaReal(sumarreal1, sumarreal2));
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
                            System.out.println("Introduzca el valor al que se le va a sumar.");
                            int sumaent1 = sc.nextInt();
                            System.out.println("Introduzca el valor sumado.");
                            int sumaent2 = sc.nextInt();
                            System.out.println("Resultado: " + sumaEntero(sumaent1, sumaent2));
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
                            System.out.println("Introduzca el valor al que se le va a sumar.");
                            float sumatres1 = sc.nextFloat();
                            System.out.println("Introduzca el primer valor sumado.");
                            float sumatres2 = sc.nextFloat();
                            System.out.println("Introduzca el segundo valor sumado.");
                            float restatres3 = sc.nextFloat();
                            System.out.println("Resultado: " + sumaTres(sumatres1, sumatres2, restatres3));
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
                                System.out.println("Introduzca el valor al que se le va a sumar.");
                                float sumar = sc.nextFloat();
                                setAcumulado(sumar);
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

                                System.out.println("Introduzca el valor que se va a sumar.");
                                float sumar = sc.nextFloat();
                                System.out.println("Nuevo valor acumulado: " + sumaAcumulada(sumar));
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
     * Suma dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El resultado de la suma de a y b.
     */
    public static int sumaEntero(int a, int b) throws InputMismatchException {

        return a+b;
    }

    /**
     * Suma dos números reales (decimales).
     *
     * @param a El primer número real.
     * @param b El segundo número real.
     * @return El resultado de la suma de a y b.
     */
    public static float sumaReal(float a, float b) throws InputMismatchException {

        return a + b;
    }

    /**
     * Suma tres números reales (decimales).
     *
     * @param a El primer número real.
     * @param b El segundo número real.
     * @param c El tercer número real.
     * @return El resultado de la suma de a, b y c.
     */
    public static float sumaTres(float a, float b, float c) throws InputMismatchException {

        return a + b + c;
    }

    /**
     * Realiza una suma acumulada, es decir, suma el valor proporcionado al
     * valor acumulado actual.
     *
     * @param valor El valor a sumar al acumulado.
     * @return El nuevo valor acumulado después de la suma.
     */
    public static float sumaAcumulada(float valor) throws InputMismatchException {

        acumulado += valor; // Resta el valor al acumulado
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
        Suma.acumulado = acumulado;
    }
}
