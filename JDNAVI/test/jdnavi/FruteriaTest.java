/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdnavi;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josedavid
 */
public class FruteriaTest {
    
    public FruteriaTest() {
    }

    /**
     * Test of añadirCliente method, of class Fruteria.
     */
    @Test
    public void testAñadirClientePrimerCliente() {
        // 1.- Preparar los datos de la prueba
        Fruteria fru = new Fruteria("Fruteria");
        
        // 2.- Probar
        fru.añadirCliente("Umtiti", 24, true);
        
        // 3.- Verificar      
        assertEquals( 1, fru.getCola().size());
        
    }
    
    @Test
    public void testAñadirClienteVariosClientesCliente() {
        // 1.- Preparar los datos de la prueba
        Fruteria fru = new Fruteria("Fruteria");
        
        // 2.- Probar
        fru.añadirCliente("Umtiti", 24, true);
        fru.añadirCliente("Maria", 26, false);
        fru.añadirCliente("Alberto", 48, true);
        fru.añadirCliente("Jorge", 16, true);
        
        // 3.- Verificar      
        assertEquals( 4, fru.getCola().size());
        
    }

    /**
     * Test of atenderCliente method, of class Fruteria.
     */
    @Test
    public void testAtenderCliente() {
    }

    /**
     * Test of adelantarCliente method, of class Fruteria.
     */
    @Test
    public void testAdelantarCliente_Persona() {
    }

    /**
     * Test of adelantarCliente method, of class Fruteria.
     */
    @Test
    public void testAdelantarCliente_int() {
    }

    /**
     * Test of getCola method, of class Fruteria.
     */
    @Test
    public void testGetCola() {
    }

    /**
     * Test of setCola method, of class Fruteria.
     */
    @Test
    public void testSetCola() {
    }

    /**
     * Test of mostrarClientesAtendidos method, of class Fruteria.
     */
    @Test
    public void testMostrarClientesAtendidos() {
    }

    /**
     * Test of mostrarClientesNoAtendidos method, of class Fruteria.
     */
    @Test
    public void testMostrarClientesNoAtendidos() {
    }

    /**
     * Test of atrasarCliente method, of class Fruteria.
     */
    @Test
    public void testAtrasarCliente() {
    }
    
}
