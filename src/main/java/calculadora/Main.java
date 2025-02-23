package calculadora;

import calculadora.Cociente;

import java.util.Scanner;

/** La clase Main representa un menú de funciones de una calculadora,
 * con las siguientes opciones: suma, resta, producto y cociente.
 *
 * <p>Ejemplo de uso:</p>
 * El usuario elige una opción del menú, que le redirige a otro menú
 * con opciones para realizar las operaciones.
 * Al seleccionar una de ellas, debe introducir los parámetros que se le
 * indiquen; se realizará la operación, mostrando el resultado, y el programa
 * devolverá al usuario al menú para que vuelva a elegir una opción.
 *
 * @author Gregory López Gómez
 * @author Manuel Alejandro Lopez Ortega
 * @author Patricia Victoria Sanz López
 * @author Laura Vinseiro Gutiérrez
 *
 * @version 0.6
 * URL repositorio Github: https://github.com/pvicSL/REPOACT2JavadocJUnitGLMP.git
 */
public class Main {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String option = " ";

        do {
            option = printMenu();
            switch (option) {
                case "S":
                case "s":
                    System.out.println("Has seleccionado Suma:");
                    Suma.menuSuma();
                    break;
                case "R":
                case "r":
                    System.out.println("Has seleccionado Resta:");
                    Resta.menuResta();
                    break;
                case "P":
                case "p":
                    System.out.println("Has seleccionado Producto:");
                    Producto.multiMenu();
                    break;
                case "C":
                case "c":
                    System.out.println("Has seleccionado Cociente:");
                    Cociente.menuCociente();
                    break;
            }
        } while (!option.equalsIgnoreCase("F"));

        System.out.println("Fin del programa.");

        sc.close();
    }

    //Aquí se imprime el menú inicial
    public static String printMenu() {
        String option = " ";
        System.out.println("CALCULADORA");
        System.out.println("Selecciona el tipo de operacion:");
        System.out.println("S - Suma.");
        System.out.println("R - Resta");
        System.out.println("P - Producto");
        System.out.println("C - Cociente");

        System.out.println("Teclea la opcion deseada, F para finalizar.");
        option = String.valueOf(sc.next());

        while (!("S".equalsIgnoreCase(option) || "R".equalsIgnoreCase(option) || "P".equalsIgnoreCase(option) || "C".equalsIgnoreCase(option) || "F".equalsIgnoreCase(option))) {
            System.out.println("Opcion erronea.");

            System.out.println("Selecciona el tipo de operacion:");
            System.out.println("S - Suma.");
            System.out.println("R - Resta");
            System.out.println("P - Producto");
            System.out.println("C - Cociente");

            System.out.println("Teclea la opcion deseada, F para finalizar.");

            option = String.valueOf(sc.next());
        }
        return option;
    }
}