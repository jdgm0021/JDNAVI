
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
    
    public void añadirCliente(String name, int age, boolean gender){
        if (age > 70) { //Si la edad es mayor a 70 lo añade en el quinto puesto
            Persona nuevoCliente = new Persona(name,age,gender);
            nuevoCliente.fruteria = this;
            cola.add(5, nuevoCliente);
        }else{
            Persona nuevoCliente = new Persona(name,age,gender);
            nuevoCliente.fruteria = this;
            cola.add(nuevoCliente);
        }
    }
    public void añadirCliente(Persona cliente){
        cliente.fruteria = this;
        cola.add(cliente);
    }
    
    public void atenderCliente(){
        System.out.println("Se ha atendido al cliente " + cola.get(0).nombre);
        personasAtendidas.add(cola.get(0));
        cola.remove(0);
        
    }
    public void adelantarCliente(Persona nueva){
        int n = cola.indexOf(nueva);
        cola.add(n-1,nueva);
        cola.remove(n+1);
    }
    public void adelantarCliente(int n){
        cola.add(n-1,cola.get(n));
        cola.remove(n+1);
    }
    
    public ArrayList<Persona> getCola() {
        return cola;
    }

    public void setCola(ArrayList<Persona> cola) {
        this.cola = cola;
    }
    
    public void mostrarClientesAtendidos(){
        System.out.println(this.personasAtendidas);
    }
    
    public void mostrarClientesNoAtendidos(){
        System.out.println(this.cola);
    }
    
    public void atrasarCliente(int nPersonaAdelantada){
        cola.add(nPersonaAdelantada+1,cola.get(nPersonaAdelantada));
        cola.remove(nPersonaAdelantada-1);
    }
}
