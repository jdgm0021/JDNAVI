
package jdnavi;

public class Persona {
    String nombre;                  //nombre de la persona
    boolean genero;                 //genero de la persona; True -> Hombre; False -> Mujer
    int edad;                       //edad de la persona

    public Persona(String nombrePersona, int edadPersona) {
        this.nombre = nombrePersona;
        if ((Math.random() * ((2 + 1) - 1) + 1) == 1) {
            this.genero = true;
        }else{
            this.genero = false;
        }
        this.edad = edadPersona;
        if(genero){
            int ale=(int)(Math.ceil(Math.random()*25));
            switch (ale){
                case 1:
                    this.nombre="Jose";
                    break;
                case 2:
                    this.nombre="Alberto";
                    break;
                case 3:
                    this.nombre="David";
                    break;
                case 4:
                    this.nombre="Ernesto";
                    break;
                case 5:
                    this.nombre="Francisco";
                    break;
                case 6:
                    this.nombre="Manuel";
                    break;
                case 7:
                    this.nombre="Juan";
                    break;
                case 8:
                    this.nombre="Ignacio";
                    break;
                case 9:
                    this.nombre="Jose Manuel";
                    break;
                case 10:
                    this.nombre="Daniel";
                    break;
                case 11:
                    this.nombre="Juan Francisco";
                    break;
                case 12:
                    this.nombre="Jose David";
                    break;
                case 13:
                    this.nombre="Alejandro";
                    break;
                case 14:
                    this.nombre="Enrique";
                    break;
                case 15:
                    this.nombre="Javier";
                    break;
                case 16:
                    this.nombre="Miguel Ángel";
                    break;
                case 17:
                    this.nombre="Ángel";
                    break;
                case 18:
                    this.nombre="Ricardo";
                    break;
                case 19:
                    this.nombre="Francisco Javier";
                    break;
                case 20:
                    this.nombre="Marcos";
                    break;
                case 21:
                    this.nombre="Juan Alberto";
                    break;
                case 22:
                    this.nombre="Fernando";
                    break;
                case 23:
                    this.nombre="Vicente";
                    break;
                case 24:
                    this.nombre="Jose Ignacio";
                    break;
                case 25:
                    this.nombre="Vicente Manuel";
                    break;
                    
            }
        }
    }
    
    
}
