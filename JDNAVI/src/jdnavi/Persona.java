
package jdnavi;

public class Persona {
    String nombre;                  //nombre de la persona
    boolean genero;                 //genero de la persona; True -> Hombre; False -> Mujer
    int edad;                       //edad de la persona

    public Persona(String nombrePersona, boolean generoPersona, int edadPersona) {
        this.nombre = nombrePersona;
        this.genero = generoPersona;
        this.edad = edadPersona;
    }
    
    
}
