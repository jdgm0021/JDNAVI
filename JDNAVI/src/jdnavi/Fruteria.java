
package jdnavi;

import java.util.ArrayList;

public class Fruteria {
    
    private final String nombre;
    private ArrayList<Persona> cola;
    private ArrayList<Persona> personasAtendidas;
    
    public Fruteria(String name){
        this.nombre=name;
        this.cola= new ArrayList<>();
        this.personasAtendidas= new ArrayList<>();
    }
    
    public void añadirCliente(){
        Persona nuevoCliente = new Persona();
        nuevoCliente.fruteria = this;
        cola.add(nuevoCliente);
    }
    
    public void atenderCliente(){
        System.out.println("Se ha atendido al cliente " + cola.get(0).nombre);
        cola.remove(0);
        
    }

    public ArrayList<Persona> getCola() {
        return cola;
    }

    public void setCola(ArrayList<Persona> cola) {
        this.cola = cola;
    }
}
