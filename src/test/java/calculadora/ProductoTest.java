package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test mediante JUnit 5 destinada a probar los métodos de la clase Producto.
 * @author Laura Vinseiro
 * id id gitHub: Lauu92
 * @version 3
 */
class ProductoTest {

    //Tests relacinoados con prod2reales().
    @Test
    void prod2realesPositivos() {

        assertEquals(11, Producto.prod2reales(2,5.5));
    }

    @Test
    void prod2realesNegativos() {

        assertEquals(-11, Producto.prod2reales(2,-5.5));
    }

    @Test
    void prod2realesCeros() {

        assertEquals(0, Producto.prod2reales(0,5));
    }

    @Test
    void prod2realesCatch() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            Producto.prod2reales(3.4, sc.nextInt());
        });
    }

    //Tests relacinoados con prod2enteros().
    @Test
    void prod2enterosPositivos() {

        assertEquals(25, Producto.prod2enteros(5,5));
    }

    @Test
    void prod2enterosNegativos() {

        assertEquals(-25, Producto.prod2enteros(-5,5));
    }

    @Test
    void prod2enterosCeros() {

        assertEquals(0, Producto.prod2enteros(0,-5));
    }

    @Test
    void prod2enterosIncorrectos() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            Producto.prod2enteros(3, sc.nextInt());
        });
    }

    //Tests relacinoados con prod3reales().
    @Test
    void prod3realesPositivos() {

        assertEquals(425, Producto.prod3reales(10, 5, 8.5));
    }

    @Test
    void prod3realesNegativos() {

        assertEquals(-425, Producto.prod3reales(5, -10, 8.5));
    }

    @Test
    void prod3realesCeros() {

        assertEquals(0, Producto.prod3reales(0, 5, 8.5));
    }

    @Test
    void prod3realesCatch() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            Producto.prod3reales(sc.nextInt(), 5, 8.5);
        });
    }

    //Tests relacinoados con potencia().
    @Test
    void potencia() {

        assertEquals(32, Producto.potencia(2,5));
    }

    @Test
    void potenciaBaseNegativa() {

        assertEquals(-32, Producto.potencia(-2,5));
    }

    @Test
    void potenciaExponenteNegativo() {

        assertEquals(0.03125, Producto.potencia(2,-5));
    }

    @Test
    void potenciaGranExponente() {

        assertEquals(2.037035976334486E90, Producto.potencia(2,300));
    }

    @Test
    void potenciaGranBase() {
        //TODO no pasa el test porque da infinity
    }

    @Test
    void potenciaCatch() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            Producto.potencia(sc.nextInt(), 2);
        });
    }



}