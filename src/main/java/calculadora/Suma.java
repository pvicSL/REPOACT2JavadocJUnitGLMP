package calculadora;
import java.util.Scanner;

public class Suma {  // Cambio de nombre de la clase

    static class SumaInt {
        private double valorAcumulado = 0;

        public double sumaDosNumerosReales(double primerNumero, double segundoNumero) {
            return primerNumero + segundoNumero;
        }

        public int sumaDosNumerosEnteros(int primerNumero, int segundoNumero) {
            return primerNumero + segundoNumero;
        }

        public double sumaTresNumerosReales(double primerNumero, double segundoNumero, double tercerNumero) {
            return primerNumero + segundoNumero + tercerNumero;  // Corregí la operación
        }

       public double sumaValorAcumulado(double primerNumero) {
            return this.valorAcumulado + primerNumero;  // Ahora suma en vez de restar
        }
    }

    static class MenuOperaciones {
        public static void pintarOpcionesOperaciones() {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma de dos números reales");
            System.out.println("2. Suma de dos números enteros");
            System.out.println("3. Suma de tres números reales");
            System.out.println("4. Suma con valor acumulado");
            System.out.println("Ingrese su opción:");
        }

        public static void menuOperaciones() {
            Scanner leer = new Scanner(System.in);
            Suma suma = new Suma();

            pintarOpcionesOperaciones();
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer número real: ");
                    double num1 = leer.nextDouble();
                    System.out.println("Introduce el segundo número real: ");
                    double num2 = leer.nextDouble();
                    System.out.println("Resultado: " + suma.sumaDosNumerosReales(num1, num2));
                    break;
                case 2:
                    System.out.println("Introduce el primer número entero: ");
                    int num3 = leer.nextInt();
                    System.out.println("Introduce el segundo número entero: ");
                    int num4 = leer.nextInt();
                    System.out.println("Resultado: " + suma.sumaDosNumerosEnteros(num3, num4));
                    break;
                case 3:
                    System.out.println("Introduce el primer número real: ");
                    double num5 = leer.nextDouble();
                    System.out.println("Introduce el segundo número real: ");
                    double num6 = leer.nextDouble();
                    System.out.println("Introduce el tercer número real: ");
                    double num7 = leer.nextDouble();
                    System.out.println("Resultado: " + suma.sumaTresNumerosReales(num5, num6, num7));
                    break;
                case 4:
                    System.out.println("Introduce el número a sumar al valor acumulado: ");
                    double num8 = leer.nextDouble();
                    System.out.println("Resultado: " + suma.sumaValorAcumulado(num8));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            leer.close();
        }

        public static void main(String[] args) {
            menuOperaciones();
        }
    }

	public String sumaDosNumerosReales(double num1, double num2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String sumaValorAcumulado(double num8) {
		// TODO Auto-generated method stub
		return null;
	}

	public String sumaTresNumerosReales(double num5, double num6, double num7) {
		// TODO Auto-generated method stub
		return null;
	}

	public String sumaDosNumerosEnteros(int num3, int num4) {
		// TODO Auto-generated method stub
		return null;
	}
}

