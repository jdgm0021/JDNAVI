
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
    }
    
    
}
