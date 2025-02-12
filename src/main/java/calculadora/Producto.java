package calculadora;

import java.util.Scanner;

public class Producto {

    /**
     * Esta clase ofrece un menú con 4 operaciones de multiplicación básicas,
     * y una quinta opción para salir del menú.
     * <p>
     * Opción 1 - cálculo del producto de dos números reales.
     * Opción 2 - cálculo del producto de dos números enteros.
     * Opción 3 - cálculo del producto de tres números reales.
     * Opción 4 - cálculo de la potencia con una base y un exponente.
     * Opción 5 - salida del menú.
     *
     * @author Patricia Victoria Sanz Lopez
     * @version 0.5
     * id gitHub: pvicSL
     */

    //Creación de objeto de clase Scanner para el input del usuario.
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        //Declaración de los datos que empleará la clase
        double opreal1, opreal2, opreal3, opreal4, opreal5;
        int opent1, opent2;
        double base1, exponente1;

        int opcion = 0;

        //Ejecuta el menú hasta que el usuario elija la opción de salida (5)
        do {
            opcion = multiMenu();
        } while (opcion != 5);

        System.out.println("Fin de la operacion.");
        sc.close();
    }

    /**
     * Presenta un menú de opciones al usuario, con cuatro posibles
     * operaciones de multiplicación con distintos parámetros,
     * y una quinta opción para salir del menú.
     *
     * @return devuelve la funcionalidad de la opción seleccionada.
     */
    public static int multiMenu() {

        System.out.println("Elige lo que deseas hacer:");
        System.out.println("\n1- Producto de 2 números reales.");
        System.out.println("2- Producto de 2 números enteros.");
        System.out.println("3- Producto de 3 números reales");
        System.out.println("4- Potencia.");
        System.out.println("\nTeclea una opción, 5 para salir.");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Producto de dos números reales");
                System.out.println("Introduce el primer operando");
                double opreal1 = sc.nextDouble();
                System.out.println("Introduce el segundo operando");
                double opreal2 = sc.nextDouble();
                prod2reales(opreal1, opreal2);
                break;
            case 2:
                System.out.println("Producto de dos números enteros");
                System.out.println("Introduce el primer operando");
                int opent1 = sc.nextInt();
                System.out.println("Introduce el segundo operando");
                int opent2 = sc.nextInt();
                prod2enteros(opent1, opent2);
                break;
            case 3:
                System.out.println("Producto de tres números reales");
                System.out.println("Introduce el primer operando.");
                double opreal3 = sc.nextDouble();
                System.out.println("Introduce el segundo operando.");
                double opreal4 = sc.nextDouble();
                System.out.println("Introduce el tercer operando.");
                double opreal5 = sc.nextDouble();
                prod3reales(opreal3, opreal4, opreal5);
                break;
            case 4:
                System.out.println("Potencia");
                System.out.println("Introduce la base.");
                double base1 = sc.nextDouble();
                System.out.println("Introduce el exponente.");
                double exponente1 = sc.nextDouble();
                potencia(base1, exponente1);
                break;

        } while (opcion < 1 || opcion > 5) {
            System.out.println("Opción incorrecta.");
            opcion = sc.nextInt();
            if (!sc.hasNextInt()) {
                System.out.println("Has tecleado una letra.");
                opcion = sc.nextInt();
            }
        }
        return opcion;

    }

    //Métodos propios de la clase Producto

    /**
     * Calcula el resultado de multiplicar los dos números reales
     * (con o sin decimales) que haya introducido el usuario.
     * @param opreal1 debe ser un número real (con decimales)
     * @param opreal2 debe ser un número real (con decimales)
     * El resultado se muestra acompañado de un texto (Resultado: ...)
     */
    public static void prod2reales(double opreal1, double opreal2) {
        System.out.println("Resultado: " + (opreal1 * opreal2) + "\n");
    }

    /**
     * Calcula el resultado de multiplicar los dos números enteros
     * que haya introducido el usuario.
     * @param opent1
     * @param opent2
     * El resultado se muestra acompañado de un texto (Resultado: ...)
     */
    public static void prod2enteros(int opent1, int opent2) {
        System.out.println("Resultado: " + (opent1 * opent2) + "\n");
    }

    /**
     * Calcula el resultado de multiplicar tres números reales
     * (con o sin decimales) que haya introducido el usuario.
     * @param opreal3
     * @param opreal4
     * @param opreal5
     * El resultado se muestra acompañado de un texto (Resultado: ...)
     */
    public static void prod3reales(double opreal3, double opreal4, double opreal5) {
        System.out.println("Resultado: " + (opreal3 * opreal4 * opreal5) + "\n");
    }

    /**
     * Calcula la potencia de un número, para lo cual el usuario
     * debe introducir la base y el exponente de la operación.
     * Trabaja con reales para ampliar su versatilidad.
     * @param base1
     * @param exponente1
     * El resultado se muestra acompañado de un texto (Resultado: ...)
     */
    public static void potencia(double base1, double exponente1) {
        System.out.println("El resultado es: " + Math.pow(base1, exponente1) + "\n");
    }

    //No se requieren métodos adicionales en las instrucciones de trabajo.

}
