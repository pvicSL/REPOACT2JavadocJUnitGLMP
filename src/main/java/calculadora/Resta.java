package calculadora;

public class Resta {
        private float creal;
        private int c;
        private float acumulado;  // Para la resta acumulada

        // Constructor para valores enteros
        public Resta(int a, int b) {
            this.c = a - b;
            this.acumulado = this.c; // Inicializa el valor acumulado con el resultado de la resta
        }

        // Constructor para valores flotantes
        public Resta(float a, float b) {
            this.creal = a - b;
            this.acumulado = this.creal; // Inicializa el valor acumulado con el resultado de la resta
        }

        // Métodos para obtener la resta de tipo entero
        public int getRestaInt() {
            return c;
        }

        // Métodos para obtener la resta de tipo flotante
        public float getRestaFloat() {
            return creal;
        }

        // Método para la resta de tres números reales
        public float restaDeTres(float a, float b, float c) {
            return a - b - c;
        }

        // Método para la resta acumulada (resta sucesiva)
        public float restaAcumulada(float valor) {
            this.acumulado -= valor; // Resta el valor al acumulado
            return this.acumulado; // Retorna el valor acumulado
        }

        // Método para obtener el valor acumulado
        public float getAcumulado() {
            return acumulado;
        }

}
