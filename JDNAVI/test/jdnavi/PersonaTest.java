
package jdnavi;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    //Para probar esta clase primero debemos instanciar una Fruteria.
    Fruteria fruteria;
    public PersonaTest() {
        fruteria = new Fruteria("Fruteria Test");
    }
    
    @Test
    public void testAbandonarCola() {
        //1.- Preparar
        fruteria.añadirCliente("Umtiti", 24, true);
        fruteria.añadirCliente("Maria", 45, false);
        Persona cliente2 = new Persona("Antonio", 19, true);
        fruteria.añadirCliente(cliente2);
        Persona cliente3 = new Persona("Manuel", 67, false);
        fruteria.añadirCliente(cliente3);
        //2.- Probar
        cliente2.abandonarCola();
        //3.- Verificar
        assertEquals( 3, fruteria.getCola().size());
        //assertEquals(cliente3, fruteria.getCola().get(2));
    }
    
    @Test
    public void testAbandonarColaMaximo() {
        //1.- Preparar
        Persona cliente2 = new Persona("Antonio", 19, true);
        fruteria.añadirCliente(cliente2);
        Persona cliente3 = new Persona("Manuel", 67, false);
        fruteria.añadirCliente(cliente3);
        //2.- Probar
        cliente2.abandonarCola();
        cliente3.abandonarCola();
        cliente3.abandonarCola();
        //3.- Verificar
        assertEquals( 0, fruteria.getCola().size());
    }

    /*@Test
    public void testDejarPasar() {
    }*/
    
}
