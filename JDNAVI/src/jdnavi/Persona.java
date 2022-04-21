package jdnavi;

public class Persona {
    String nombre;//Nombre de la persona
    boolean genero;//Genero de la persona; True -> Hombre; False -> Mujer
    int edad;//Edad de la persona
    public Fruteria fruteria;

    public Persona() {
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
    public void abandonarCola(){
        fruteria.setCola(fruteria.getCola().remove(fruteria.getCola().indexOf(this)));
    }
}
