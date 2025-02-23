package calculadora;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Clase de test mediante JUnit 5 destinada a probar los métodos de la clase Cociente.TODO
 * @author Gregory Lopez
 * @version 3
 * URL repositorio Github: https://github.com/pvicSL/REPOACT2JavadocJUnitGLMP.git
 */

class CocienteTest {
     //DivisionReales
    @Test
    void divisionRealBasíca(){

        assertEquals(12, Cociente.divisionReal(24,2));
    }
    @Test
    void dicisionRealNegativa(){
        assertEquals(-12, Cociente.divisionReal(24,-2));

    }
    @Test
    void dicisionRealDecimal() {
        assertEquals(7.8, Cociente.divisionReal(19.5, 2.5));
    }



    //DivisionEnteros
    @Test
    void divisionEnterosBasica(){
        assertEquals(12,  Cociente.divisionEntero(24, 2));

    }
    @Test
    void divisionEnterosNegativa(){
       assertEquals(-12, Cociente.divisionEntero(24, -2));
    }
    @Test
    void divisonEnterosDecimal(){
        assertEquals(7.8, Cociente.divisionReal(19.5,2.5));
    }

    //DivisionInversoReal
    @Test
    void inversoRealBasico(){
        assertEquals(0.2, Cociente.inversoReal(5));
    }
    @Test
    void inversoRealNegativo(){
        assertEquals(-0.2, Cociente.inversoReal(-5));
    }
    @Test
    void inversoRealDecimal(){
        assertEquals((double) 1 / 5.5, Cociente.inversoReal(5.5));
    }
    @Test
    void inversoRealResultadoDiferente(){
        assertNotEquals(0.6, Cociente.inversoReal(5));
    }
    //Raíz Cuadrada
    @Test
    void raizCuadradaBasico(){
        assertEquals(4, Cociente.raizCuadrada(16));

    }


    }




}
