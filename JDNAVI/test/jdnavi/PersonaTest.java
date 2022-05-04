
package jdnavi;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    //Para probar esta clase primero debemos instanciar una Fruteria.
    Fruteria fruteria;
    /*Persona cliente1;
    Persona cliente2;
    Persona cliente3;*/
    public PersonaTest() {
        fruteria = new Fruteria("Fruteria Test");
        /*cliente1 = new Persona();
        cliente2 = new Persona("Jose David", 18, true);
        cliente3 = new Persona("Maritto", 76, true);
        fruteria.añadirCliente(cliente1);
        fruteria.añadirCliente(cliente2);
        fruteria.añadirCliente(cliente3);
        fruteria.añadirCliente("Raul Mendoza", 19, true);
        fruteria.añadirCliente("Maria del Pilar", 35, false);
        fruteria.añadirCliente("Jazmin del Mar", 56, false);*/
    }
    
    @Test
    public void testAbandonarCola() {
        //1.- Preparar
        fruteria.añadirCliente("Umtiti", 24, true);
        fruteria.añadirCliente("Maria", 45, false);
        Persona cliente2 = new Persona();
        fruteria.añadirCliente(cliente2);
        //2.- Probar
        cliente2.abandonarCola();
        //3.- Verificar
        assertEquals( 2, fruteria.getCola().size());
        //assertEquals(cliente3, fruteria.getCola().get(1));
    }

    /*@Test
    public void testDejarPasar() {
    }*/
    
}
