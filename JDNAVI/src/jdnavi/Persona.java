package jdnavi;

import java.util.ArrayList;

public class Persona {
    String nombre;//Nombre de la persona
    boolean genero;//Genero de la persona; True -> Hombre; False -> Mujer
    int edad;//Edad de la persona
    public Fruteria fruteria;

    //Constructor sobrecargado para creara personas custom
    public Persona(String name, int edad, boolean gender) {
        this.genero=gender;
        this.nombre=name;
        this.edad=edad;
    }
    
    public void abandonarCola(){//Una persona va a poder abandonar la cola solo haciendo p1.abandonarCola(); es decir, sin usar Fruteria
        ArrayList<Persona> cola;
        cola = fruteria.getCola(); //Usamos la cola de Fruteria en Persona
        if (cola.size()>0) { //Si la cola no tiene nada, no puede abandonar la cola
            cola.remove(fruteria.getCola().indexOf(this)); //Eliminamos de esta cola a this
            fruteria.setCola(cola); //Cambiamos la cola por esta en fruteria
        }
    }
    
    public void dejarPasar(){ //This persona deja pasar al que tiene detras 
        ArrayList<Persona> cola;
        cola = fruteria.getCola(); //Usamos la cola de Fruteria en Persona
        cola.add((fruteria.getCola().indexOf(this))+2,this); //Nos añadimos 2 puestos atrás para dejar pasar a una persona
        cola.remove(fruteria.getCola().indexOf(this)); //Nos eliminamos de la cola para no estar repetidos y dejamos al que está detrás
        fruteria.setCola(cola); //Cambiamos la cola por esta en fruteria
    }
}
