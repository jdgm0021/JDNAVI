
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
    public void testAñadir6ClienteyUnoMayor() {
        // 1.- Preparar los datos de la prueba
        Fruteria fru = new Fruteria("Fruteria");
        
        // 2.- Probar
        fru.añadirCliente("Umtiti", 24, true);
        fru.añadirCliente("Maria", 26, false);
        fru.añadirCliente("Hasbullah", 56, false);
        fru.añadirCliente("Andrea", 12, false);
        fru.añadirCliente("Antonio", 34, true);
        fru.añadirCliente("Maritto", 21, false);
        Persona clientemayor = new Persona("Alberto", 97, true);
        fru.añadirCliente(clientemayor);
        
        // 3.- Verificar      
        assertEquals( clientemayor, fru.getCola().get(4));
    }
    
    public void testAñadir8ClienteyDosMayores() {
        // 1.- Preparar los datos de la prueba
        Fruteria fru = new Fruteria("Fruteria");
        
        // 2.- Probar
        fru.añadirCliente("Umtiti", 24, true);
        fru.añadirCliente("Maria", 26, false);
        fru.añadirCliente("Hasbullah", 56, false);
        fru.añadirCliente("Andrea", 12, false);
        fru.añadirCliente("Antonio", 34, true);
        fru.añadirCliente("Maritto", 21, false);
        fru.añadirCliente("Marta", 34, false);
        fru.añadirCliente("Jose David", 12, true);
        Persona clientemayor = new Persona("Alberto", 97, true);
        Persona clientemayor1 = new Persona("Juan", 96, true);
        fru.añadirCliente(clientemayor);
        fru.añadirCliente(clientemayor1);
        
        // 3.- Verificar
        assertEquals( clientemayor, fru.getCola().get(4));
        assertEquals( clientemayor, fru.getCola().get(5));
    }

    @Test
    public void testAtenderCliente() {
        //1.- Preparar los datos de la prueba
        Fruteria fru = new Fruteria("Fruteria");
        Persona p1 = new Persona("Hasbullah", 18, true);
        Persona p2 = new Persona("El Pepe", 21, true);
        fru.añadirCliente(p1);
        fru.añadirCliente(p2);
        //2.- Probar
        fru.atenderCliente();
        //3.- Verificar
        assertEquals (p2, fru.getCola().get(0));
    }

    @Test
    public void testAdelantarCliente_Persona() {
        //1.- Preparar los datos de la prueba
        Fruteria fru2 = new Fruteria("Fruteria");
        Persona p3 = new Persona("Hasbullah", 18, true);
        Persona p4 = new Persona("El Pepe", 21, true);
        fru2.añadirCliente(p3);
        fru2.añadirCliente(p4);
        //2.- Probar
        fru2.adelantarCliente(p4);
        //3.- Verificar
        assertEquals (p4, fru2.getCola().get(0));
    }

    @Test
    public void testAdelantarCliente_int() {
        //1.- Preparar los datos de la prueba
        //2.- Probar
        //3.- Verificar
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
