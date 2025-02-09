package calculadora;

import java.util.Scanner;

public class Producto {

    /**
     * Esta clase ofrece un menú con 4 operaciones básicas al usuario:
     * cálculo del producto de dos números reales (opción 1)
     * cálculo del producto de dos números enteros (opción 2)
     * cálculo del producto de tres números reales (opción 3)
     * cálculo de la potencia con una base y un exponente.
     *
     * @author Patricia Victoria Sanz Lopez
     * id gitHub: pvicSL
     */

    //Creación de objeto de clase Scanner para el input del usuario.
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Datos que empleará la clase
        double param1, param2, param3;
        int param4, param5;
        double base1, exponente1;

        int opcion = 0;

        //Ejecuta el menú hasta que el usuario elija la opción para salir.
        do {
            opcion = multiMenu();
        }while (opcion != 5);

        System.out.println("Fin de la operacion.");
        sc.close();
    }

    //Menu de operaciones de producto

    public static int multiMenu() {

        System.out.println("Elige lo que deseas hacer:");
        System.out.println("\n1- Producto de 2 números reales.");
        System.out.println("2- Producto de 2 números enteros.");
        System.out.println("3- Producto de 3 números reales");
        System.out.println("4- Potencia.");
        System.out.println("\nTeclea una opción, 5 para salir.");

        int opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Producto de dos números reales");
                prod2reales();
                break;
            case 2:
                System.out.println("Producto de dos números enteros");
                prod2enteros();
                break;
            case 3:
                System.out.println("Producto de tres números reales");
                prod3reales();
                break;
            case 4:
                System.out.println("Potencia");
                potencia();
                break;
        }while (opcion < 1 || opcion > 5) {
            System.out.println("Opción incorrecta.");
            opcion = sc.nextInt();
        }

        return opcion;
    }

    //Métodos propios de la clase Producto

    public static double prod2reales() {
        System.out.println("Introduce el primer operando");
        double param1 = sc.nextDouble();
        System.out.println("Introduce el segundo operando");
        double param2 = sc.nextDouble();
        System.out.println("Resultado: " + (param1 * param2) + "\n");
        return param1 * param2;
    }

    public static int prod2enteros() {
        System.out.println("Introduce el primer operando");
        int param4 = sc.nextInt();
        System.out.println("Introduce el segundo operando");
        int param5 = sc.nextInt();
        System.out.println("Resultado: " + (param4 * param5) + "\n");
        return param4 * param5;
    }


    public static double prod3reales() {
        System.out.println("Introduce el primer operando.");
        double param1 = sc.nextDouble();
        System.out.println("Introduce el segundo operando.");
        double param2 = sc.nextDouble();
        System.out.println("Introduce el tercer operando.");
        double param3 = sc.nextDouble();
        System.out.println("Resultado: " + (param1 * param2 * param3) + "\n");
        return param1 * param2 * param3;
    }

    public static double potencia() {
        System.out.println("Introduce la base.");
        double base1 = sc.nextDouble();
        System.out.println("Introduce el exponente.");
        double exponente1 = sc.nextDouble();
        System.out.println("El resultado es: " + Math.pow(base1, exponente1) + "\n");
        return Math.pow(base1, exponente1);
    }

    //No hay requerimiento de métodos adicionales para los fines
    //del ejercicio.

}
