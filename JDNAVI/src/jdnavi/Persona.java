package jdnavi;

import java.util.ArrayList;

public class Persona {
    String nombre;//Nombre de la persona
    boolean genero;//Genero de la persona; True -> Hombre; False -> Mujer
    int edad;//Edad de la persona
    public Fruteria fruteria;

    public Persona() { //Crea una persona aleatoria completamente
        this.genero = ((int) Math.floor(Math.random() * 2)) == 0;//Género aleatorio
        this.edad = (int) (Math.ceil(Math.random() * 77 + 13));//Edad aleatoria entre 14 y 90
        int ale = (int) (Math.ceil(Math.random() * 25));//Aleatorio para nombre
        if (genero) {//Nombres aleatorios para hombres
            switch (ale) {
                case 1:
                    this.nombre = "Jose";
                    break;
                case 2:
                    this.nombre = "Alberto";
                    break;
                case 3:
                    this.nombre = "David";
                    break;
                case 4:
                    this.nombre = "Ernesto";
                    break;
                case 5:
                    this.nombre = "Francisco";
                    break;
                case 6:
                    this.nombre = "Manuel";
                    break;
                case 7:
                    this.nombre = "Juan";
                    break;
                case 8:
                    this.nombre = "Ignacio";
                    break;
                case 9:
                    this.nombre = "Jose Manuel";
                    break;
                case 10:
                    this.nombre = "Daniel";
                    break;
                case 11:
                    this.nombre = "Juan Francisco";
                    break;
                case 12:
                    this.nombre = "Jose David";
                    break;
                case 13:
                    this.nombre = "Alejandro";
                    break;
                case 14:
                    this.nombre = "Enrique";
                    break;
                case 15:
                    this.nombre = "Javier";
                    break;
                case 16:
                    this.nombre = "Miguel Ángel";
                    break;
                case 17:
                    this.nombre = "Ángel";
                    break;
                case 18:
                    this.nombre = "Ricardo";
                    break;
                case 19:
                    this.nombre = "Francisco Javier";
                    break;
                case 20:
                    this.nombre = "Marcos";
                    break;
                case 21:
                    this.nombre = "Juan Alberto";
                    break;
                case 22:
                    this.nombre = "Fernando";
                    break;
                case 23:
                    this.nombre = "Vicente";
                    break;
                case 24:
                    this.nombre = "Jose Ignacio";
                    break;
                case 25:
                    this.nombre = "Vicente Manuel";
                    break;
            }
        } else {//Nombres aleatorios para mujeres
            switch (ale) {
                case 1:
                    this.nombre = "Puri";
                    break;
                case 2:
                    this.nombre = "Ana";
                    break;
                case 3:
                    this.nombre = "María";
                    break;
                case 4:
                    this.nombre = "Marta";
                    break;
                case 5:
                    this.nombre = "Marta del Pilar";
                    break;
                case 6:
                    this.nombre = "Pepa";
                    break;
                case 7:
                    this.nombre = "Antonia";
                    break;
                case 8:
                    this.nombre = "Juana";
                    break;
                case 9:
                    this.nombre = "Josefa";
                    break;
                case 10:
                    this.nombre = "Daniela";
                    break;
                case 11:
                    this.nombre = "Juana del Pilar";
                    break;
                case 12:
                    this.nombre = "Davinia";
                    break;
                case 13:
                    this.nombre = "Alejandra";
                    break;
                case 14:
                    this.nombre = "Enriqueta";
                    break;
                case 15:
                    this.nombre = "Manuela";
                    break;
                case 16:
                    this.nombre = "Ángela";
                    break;
                case 17:
                    this.nombre = "Rocío";
                    break;
                case 18:
                    this.nombre = "Mariana";
                    break;
                case 19:
                    this.nombre = "Mariana del Rocío";
                    break;
                case 20:
                    this.nombre = "Lola";
                    break;
                case 21:
                    this.nombre = "Marisol";
                    break;
                case 22:
                    this.nombre = "Almudena";
                    break;
                case 23:
                    this.nombre = "Vicenta";
                    break;
                case 24:
                    this.nombre = "Juana del Mar";
                    break;
                case 25:
                    this.nombre = "María del Mar";
                    break;
            }
        }
    }
    //Constructor sobrecargado para creara personas custom
    public Persona(String name, int edad, boolean gender) {
        this.genero=gender;
        this.nombre=name;
        this.edad=edad;
    }
    
    public void abandonarCola(){//Una persona va a poder abandonar la cola solo haciendo p1.abandonarCola(); es decir, sin usar Fruteria
        ArrayList<Persona> cola; 
        cola = fruteria.getCola(); //Usamos la cola de Fruteria en Persona
        cola.remove(fruteria.getCola().indexOf(this)); //Eliminamos de esta cola a this
        fruteria.setCola(cola); //Cambiamos la cola por esta en fruteria
    }
    
    public void dejarPasar(){ //This persona deja pasar al que tiene detras 
        ArrayList<Persona> cola;
        cola = fruteria.getCola(); //Usamos la cola de Fruteria en Persona
        cola.add((fruteria.getCola().indexOf(this))+2,this); //Nos añadimos 2 puestos atrás para dejar pasar a una persona
        cola.remove(fruteria.getCola().indexOf(this)); //Nos eliminamos de la cola para no estar repetidos y dejamos al que está detrás
        fruteria.setCola(cola); //Cambiamos la cola por esta en fruteria
    }
}
