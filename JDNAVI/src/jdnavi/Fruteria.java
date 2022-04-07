
package jdnavi;

import java.util.ArrayList;

public class Fruteria {
    
    private String nombre;
    private ArrayList<Persona> cola;
    private ArrayList<Persona> personasAtendidas;
    
    public Fruteria(String name){
        this.nombre=name;
        this.cola= new ArrayList<>();
        this.personasAtendidas= new ArrayList<>();
    }
    
}
