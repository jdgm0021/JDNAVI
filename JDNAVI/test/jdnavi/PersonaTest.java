
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
    }
    
    @Test
    public void testAbandonarColaCustom() {
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
        assertEquals(cliente3, fruteria.getCola().get(2));
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

    @Test
    public void testDejarPasar() {
        //1.- Preparar
        Fruteria fruteria2 = new Fruteria("Fruteria Test2");
        Persona cliente5 = new Persona("Juanito",6,true);
        Persona cliente6 = new Persona("Encarita Manuela de los Santos",46,false);
        fruteria2.añadirCliente(cliente5);
        fruteria2.añadirCliente(cliente6);
        //2.- Probar
        cliente5.dejarPasar();
        //3.- Verificar
        assertEquals(cliente6, fruteria2.getCola().get(0));
        assertEquals( 2, fruteria2.getCola().size());
    }
    
}
