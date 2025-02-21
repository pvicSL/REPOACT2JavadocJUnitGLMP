package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static calculadora.Resta.restaEntero;
import static calculadora.Suma.sumaAcumulada;
import static calculadora.Suma.sumaReal;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test mediante JUnit 5 destinada a probar los métodos de la clase Suma.
 * @author Manuel Alejandro
 * @version 1.1
 * URL repositorio Github: https://github.com/pvicSL/REPOACT2JavadocJUnitGLMP.git
*/

class SumaTest {


    //Tests sumar dos numeros reales sumaDosNumerosReales().
    @Test
    void sumaDosNumerosRealesPositivos() {
        assertEquals(7.3f, sumaReal(3.3F, 4));
    }

    @Test
    void sumaDosNumerosRealesNegativos() {
        assertEquals(2, sumaReal(3,  -1.0f));
    }

    @Test
    void sumaDosNumeroReales() {
        assertEquals(7, sumaReal(3, 4));
    }

    @Test
    void sumaDosNumeroRealesString() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            Suma.sumaReal(3.3f, sc.nextInt());
        });
    }


    //Tests sumar numeros enteros sumaDosNumerosEnteros().
    @Test
    void sumaDosNumerosEnterosPositivos() {
        assertEquals(7, Suma.sumaEntero(3, 4));
    }

    @Test
    void sumaDosNumerosEnterosNegativos() {
        assertEquals(-1, Suma.sumaEntero(3, -4));
    }

    @Test
    void sumaDosNumeroEnteros() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            Suma.sumaEntero(3, sc.nextInt());
        });
    }

    //Tests sumar tres numeros reales sumaTresNumerosReales().
    @Test
    void sumaTresNumerosRealesPositivos() {
        assertEquals(13.4f, Suma.sumaTres(3, 4.4f, 6));
    }

    @Test
    void sumaTresNumerosRealesNegativos() {
        assertEquals(1.0f, Suma.sumaTres(3, 4, -6.0f));
    }

    @Test
    void sumaTresNumerosString() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            Suma.sumaTres(3, sc.nextInt(),5);
        });
    }

    //Tests sumar el valor acumulado sumaValorAcumulado().
    @Test
    void sumaValorAcumuladoPositivo() {
        Suma.setAcumulado(60.0f);
        assertEquals(64f, Suma.sumaAcumulada(4));
    }

    @Test
    void sumaValorAcumuladoReal() {
        Suma.setAcumulado(60.0f);
        assertEquals(65.5f, Suma.sumaAcumulada(5.5f));
    }

    @Test
    void sumaValorAcumuladoNegativo() {
        Suma.setAcumulado(60.0f);
        assertEquals(58f, Suma.sumaAcumulada(-2));
    }

    @Test
    void sumaValorAcumuladoString() {
        Suma.setAcumulado(60.0f);
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> {
            sumaAcumulada(sc.nextInt());
        });
    }
}
