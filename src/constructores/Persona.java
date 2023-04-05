/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author GIAN
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona()
    {
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public String getTextoImprimir()
    {
        return "Nombre: " + this.nombre+ "\n Edad: "+getEdadComoTexto()
                +"\n-------------------";    
    }
      
    public String getEdadComoTexto() 
    {
        String EdadText = Constructores.ConvertirATxt(edad);
        return EdadText;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
