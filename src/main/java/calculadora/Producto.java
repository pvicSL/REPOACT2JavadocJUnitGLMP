package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {

    /**
     * Esta clase ofrece un menú con 4 operaciones de multiplicación básicas.
     * <p>
     * Opción 1 - cálculo del producto de dos números reales.
     * Opción 2 - cálculo del producto de dos números enteros.
     * Opción 3 - cálculo del producto de tres números reales.
     * Opción 4 - cálculo de la potencia con una base y un exponente.
     * Opción 5 - regresar al menú principal de la calculadora.
     *  <p>
     * @author Patricia Victoria Sanz Lopez
     * @version 0.9
     *  <p>
     * id gitHub: pvicSL
     * URL repositorio Github: https://github.com/pvicSL/REPOACT2JavadocJUnitGLMP.git
     */

    //Creación de objeto de clase Scanner para recibir el input del usuario.
    static Scanner sc = new Scanner(System.in);

    //Función de menú de la clase Producto, para mostrar opciones al usuario.
    /**
     * Presenta un menú de 5 opciones al usuario, con cuatro posibles
     * operaciones de multiplicación con distintos parámetros.
     * <p>
     * El usuario debe introducir un número del 1 al 4 para operar,
     * o 5 si desea regresar al menú inicial de la calculadora.
     * <p>
     * @return devuelve la funcionalidad de la opción seleccionada.
     */
    public static int multiMenu() {

        System.out.println("Elige lo que deseas hacer:");
        System.out.println("1- Producto de 2 numeros reales.");
        System.out.println("2- Producto de 2 numeros enteros.");
        System.out.println("3- Producto de 3 numeros reales.");
        System.out.println("4- Potencia.");
        System.out.println("5- Volver al menu inicial.");

        while (!sc.hasNextInt()) {
            System.out.println("Has tecleado una letra.");
            System.out.println("Introduce un numero.");
            sc.nextLine();
            Producto.multiMenu();
        }


        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                try {
                System.out.println("Producto de dos numeros reales:");
                System.out.println("Introduce el primer operando.");
                double opreal1 = sc.nextDouble();
                System.out.println("Introduce el segundo operando.");
                double opreal2 = sc.nextDouble();
                prod2reales(opreal1, opreal2);}
                catch (InputMismatchException e){
                    System.out.println("Dato incorrecto: teclea numeros reales.");
                    System.out.println("Reiniciando...");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                Producto.multiMenu();
                break;
            case 2:
                try {
                System.out.println("Producto de dos numeros enteros:");
                System.out.println("Introduce el primer operando.");
                int opent1 = sc.nextInt();
                System.out.println("Introduce el segundo operando.");
                int opent2 = sc.nextInt();
                prod2enteros(opent1, opent2); }
                catch (InputMismatchException e){
                    System.out.println("Dato incorrecto: teclea enteros.");
                    System.out.println("Reiniciando...");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                    }
                Producto.multiMenu();
                break;
            case 3:
                try {
                System.out.println("Producto de tres numeros reales:");
                System.out.println("Introduce el primer operando.");
                double opreal3 = sc.nextDouble();
                System.out.println("Introduce el segundo operando.");
                double opreal4 = sc.nextDouble();
                System.out.println("Introduce el tercer operando.");
                double opreal5 = sc.nextDouble();
                prod3reales(opreal3, opreal4, opreal5);}
                catch (InputMismatchException e){
                    System.out.println("Dato incorrecto: teclea reales.");
                    System.out.println("Reiniciando...");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                Producto.multiMenu();
                break;
            case 4:
                try {
                System.out.println("Potencia:");
                System.out.println("Introduce la base.");
                double base1 = sc.nextDouble();
                System.out.println("Introduce el exponente.");
                double exponente1 = sc.nextDouble();
                potencia(base1, exponente1);}
                catch (InputMismatchException e){
                    System.out.println("Dato incorrecto: teclea numeros.");
                    System.out.println("Reiniciando...");
                    //La línea siguiente limpia el flujo de entrada.
                    sc.nextLine();
                }
                Producto.multiMenu();
                break;
            case 5:
                System.out.println("\nRegresando...\n");
                break;

        } while (opcion < 1 || opcion > 5) {
            System.out.println("\nOpcion incorrecta. Introduce una de las siguientes:");
            System.out.println("1. Producto de 2 numeros reales.");
            System.out.println("2. Producto de 2 numeros enteros.");
            System.out.println("3. Producto de 3 numeros reales.)");
            System.out.println("4. Potencia.");
            System.out.println("5. Volver al menu inicial.");
            opcion = sc.nextInt();
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
    public static double prod2reales(double opreal1, double opreal2) {
        System.out.println("El resultado es: " + (opreal1 * opreal2) + "\n");
        return (opreal1 * opreal2);
    }

    /**
     * Calcula el resultado de multiplicar los dos números enteros
     * que haya introducido el usuario.
     * @param opent1
     * @param opent2
     * El resultado se muestra acompañado de un texto (Resultado: ...)
     */
    public static int prod2enteros(int opent1, int opent2) {
        System.out.println("El resultado es: " + (opent1 * opent2) + "\n");
        return (opent1 * opent2);
    }

    /**
     * Calcula el resultado de multiplicar tres números reales
     * (con o sin decimales) que haya introducido el usuario.
     * @param opreal3
     * @param opreal4
     * @param opreal5
     * El resultado se muestra acompañado de un texto (Resultado: ...)
     */
    public static double prod3reales(double opreal3, double opreal4, double opreal5) {
        System.out.println("El resultado es: " + (opreal3 * opreal4 * opreal5) + "\n");
        return (opreal3 * opreal4 * opreal5);
    }

    /**
     * Calcula la potencia de un número, para lo cual el usuario
     * debe introducir la base y el exponente de la operación.
     * Trabaja con reales para ampliar su versatilidad.
     * @param base1
     * @param exponente1
     * El resultado se muestra acompañado de un texto (Resultado: ...)
     */
    public static double potencia(double base1, double exponente1) {
        System.out.println("El resultado es: " + Math.pow(base1, exponente1) + "\n");
        return (Math.pow(base1, exponente1));
    }

    //No se requieren métodos adicionales en las instrucciones de trabajo.

}
