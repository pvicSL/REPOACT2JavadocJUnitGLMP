package calculadora;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static calculadora.Resta.*;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Clase de test mediante JUnit 5 destinada a probar los métodos de la clase Resta.
 * <p>
 * @author Patricia Victoria Sanz Lopez
 * id gitHub: pvicSL
 * @version 1.0
 * URL repositorio Github: https://github.com/pvicSL/REPOACT2JavadocJUnitGLMP.git
 */

class RestaTest {

    //Testing para restas de dos números enteros - restaEntero()
    @Test
    void restaEnteroFuncionamientoBasico() {
        assertEquals(-710, restaEntero(40, 750));
    }

    @Test
    void restaEnteroNegativos() {
        assertEquals(11, restaEntero(5, -6));
    }

    @Test
    void restaEnteroCero() {assertEquals(-6, restaEntero(0, 6));
    }

    @Test
    void restaEnteroEntradaIncorrecta() {
        Scanner sc = new Scanner("abc");
        assertThrows(NoSuchElementException.class, () -> {
            Resta.restaEntero(3, sc.nextInt());
        });
    }

    //Testing para restas de dos números con decimales - restaReal()
    @Test
    void restaRealFuncionamientoBasico() {
     assertEquals(-79.7f, restaReal(45.8f,125.5f));
    }

    @Test
    void restaRealUnNegativo() {
        assertEquals(34.8f, restaReal(32.2f,-2.6f));
    }

    @Test
    void restaRealDosNegativos() {
        assertEquals(-43.9f, restaReal(-50.4f,-6.5f));
    }

    @Test
    void restaRealCeros() {
        assertEquals(-6.5f, restaReal(0.0f,6.5f));
    }

    @Test
    void restaRealEntradaIncorrecta() {
        Scanner sc = new Scanner("abc");
        assertThrows(NoSuchElementException.class, () -> {
            Resta.restaReal(12.0f, sc.nextInt());
        });
    }


    //Testing para restas de tres números reales - restarTres()
    @Test
    void restarTresFuncionamientoBasico() {
        assertEquals(-2.5000002f, restarTres(5.5f, 3.2f, 4.8f));
    }

    @Test
    void restarTresNegativos() {
        assertEquals(-55.600002f, restarTres(-70.5f, -10.3f, -4.6f));
    }

    @Test
    void restarTresCero() {
        assertEquals(70.3f, restarTres(100.5f, 0.0f, 30.2f));
    }

    @Test
    void restarTresEntradaIncorrecta() {
        Scanner sc = new Scanner("abc");
        assertThrows(NoSuchElementException.class, () -> {
            Resta.restarTres(5.0f,12.0f, sc.nextInt());
        });
    }

    //Testing para restas con valor acumulado - restaAcumulada()
    @Test
    void restaAcumuladaFuncionamientoBasico() {
        Resta.setAcumulado(60.0f);
        assertEquals(28f, Resta.restaAcumulada(32.0f));
        assertEquals(18f, Resta.restaAcumulada(10.0f));
    }

    @Test
    void restaAcumuladaNegativos() {
        Resta.setAcumulado(50.0f);
        assertEquals(90f, Resta.restaAcumulada(-40.0f));
        assertEquals(80f, Resta.restaAcumulada(10.0f));
    }

    @Test
    void restaAcumuladaAcumuladoCero() {
        Resta.setAcumulado(0.0f);
        assertEquals(40.0f, Resta.restaAcumulada(-40.0f));
        assertEquals(30.0f, Resta.restaAcumulada(10.0f));
    }

    @Test
    void restaAcumuladaEntradaIncorrecta() {
        Scanner sc = new Scanner("abc");
        assertThrows(NoSuchElementException.class, () -> {
            Resta.restaAcumulada(sc.nextInt());
        });
    }

}