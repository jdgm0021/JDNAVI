
package jdnavi;

import org.junit.Test;
import static org.junit.Assert.*;

public class FruteriaTest {
    
    public FruteriaTest() {
    }

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
    public void testAñadirClienteVariosClientes() {
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
    
    @Test
    public void testAñadir2ClienteyUnoMayor() {
        // 1.- Preparar los datos de la prueba
        Fruteria fru = new Fruteria("Fruteria");
        
        // 2.- Probar
        fru.añadirCliente("Umtiti", 24, true);
        fru.añadirCliente("Maria", 26, false);
        Persona clientemayor = new Persona("Alberto", 97, true);
        fru.añadirCliente(clientemayor);
        
        // 3.- Verificar      
        assertEquals( clientemayor, fru.getCola().get(2));
    }

    @Test
    public void testAtenderCliente() {
    }

    @Test
    public void testAdelantarCliente_Persona() {
    }

    @Test
    public void testAdelantarCliente_int() {
    }

    @Test
    public void testGetCola() {
    }

    @Test
    public void testSetCola() {
    }

    @Test
    public void testMostrarClientesAtendidos() {
    }

    @Test
    public void testMostrarClientesNoAtendidos() {
    }

    @Test
    public void testAtrasarCliente() {
    }
    
}
