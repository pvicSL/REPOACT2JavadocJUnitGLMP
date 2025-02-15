package calculadora;

import calculadora.Cociente;

import java.util.Scanner;

/** La clase Main representa un menú de funciones de una calculadora,
 * con las siguientes opciones: suma, resta, producto y cociente.
 *
 * <p>Ejemplo de uso:</p>
 *
 *
 * @author
 * @version 0
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
                    System.out.println("Aquí tiene que irse al menú de la suma");
                    break;
                case "R":
                case "r":
                    System.out.println("Has seleccionado Resta");
                    Resta.menuResta();
                    break;
                case "P":
                case "p":
                    System.out.println("Has seleccionado Producto");
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
        System.out.println("Seleccione el tipo de operación que desee:");
        System.out.println("S - Suma.");
        System.out.println("R - Resta");
        System.out.println("P - Producto");
        System.out.println("C - Cociente");

        System.out.println("Teclee la opción deseada, F para finalizar.");
        option = String.valueOf(sc.next());

        while (!("S".equalsIgnoreCase(option) || "R".equalsIgnoreCase(option) || "P".equalsIgnoreCase(option) || "C".equalsIgnoreCase(option) || "F".equalsIgnoreCase(option))) {
            System.out.println("Opción errónea.");
            option = String.valueOf(sc.next());
        }
        return option;
    }
}