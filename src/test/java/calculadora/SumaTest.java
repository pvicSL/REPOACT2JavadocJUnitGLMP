package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test mediante JUnit 5 destinada a probar los métodos de la clase Suma.
 * @author Manuel Alejandro
 * @version 1
 */
class SumaTest {


    //Tests sumar dos numeros reales sumaDosNumerosReales().
    @Test
    void sumaDosNumerosRealesPositivos() {
        assertEquals(7.2, Suma.sumaDosNumeroReales(3.2, 4));
    }

    @Test
    void sumaDosNumerosRealesNegativos() {
        assertEquals(-1, Suma.sumaDosNumeroReales(3, -4));
    }

    @Test
    void sumaDosNumeroReales() {
        assertEquals(7, Suma.sumaDosNumeroReales(3, 4));
    }

    @Test
    void sumaDosNumeroRealesString() {
        assertEquals(NumberFormatException.class, Suma.sumaDosNumeroReales("hola", "4"));
    }


    //Tests sumar numeros enteros sumaDosNumerosEnteros().
    @Test
    void sumaDosNumerosEnterosPositivos() {
        assertEquals(7, Suma.sumaDosNumerosEnteros(3, 4));
    }

    @Test
    void sumaDosNumerosEnterosNegativos() {
        assertEquals(-1, Suma.sumaDosNumeroEnteros(3, -4));
    }

    @Test
    void sumaDosNumeroEnteros() {
        assertEquals(NumberFormatException.class, Suma.sumaDosNumeroEnteros("hola", "4"));
    }

    //Tests sumar tres numeros reales sumaTresNumerosReales().
    @Test
    void sumaTresNumerosRealesPositivos() {
        assertEquals(13.4, Suma.sumaTresNumerosReales(3, 4.4, 6));
    }

    @Test
    void sumaTresNumerosRealesNegativos() {
        assertEquals(-1, Suma.sumaTresNumerosReales(3, 4, -6));
    }

    @Test
    void sumaTresNumerosString() {
        assertEquals(NumberFormatException.class, Suma.sumaTresNumerosReales("hola", "hola", "hola"));
    }

    @Test
    void sumaTresNumerosReales() {
        //TODO
    }

    //Tests sumar el valor acumulado sumaValorAcumulado().
    @Test
    void sumaValorAcumuladoPositivo() {
        assertEquals(4, Suma.sumaValorAcumulado(4));
    }

    @Test
    void sumaValorAcumulado() {
        assertEquals(5.5, Suma.sumaValorAcumulado(5.5));
    }

    @Test
    void sumaValorAcumulado() {
        assertEquals(-2, Suma.sumaValorAcumulado(-2));
    }

    @Test
    void sumaValorAcumulado() {
        assertEquals(NumberFormatException.class, Suma.sumaValorAcumulado("hola"));
    }
}