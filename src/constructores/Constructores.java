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
public class Constructores {

    /**
     * @param args the command line arguments
     */
    
    
     /*public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona(); 
        Persona GianPersona = new Persona("Gian",19);
             
        imprimir(persona.getTextoImprimir());
        imprimir(GianPersona.getTextoImprimir());     
    }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado("Manuel",20,"Finanza"); 
        Empleado empleadoCopia = Empleado.CopiaEmpleado(empleado);
        //Crtl + Spc
        empleadoCopia.setDepartamento("Ventas");
        
        
        
        imprimir(empleado.getTextoImprimir());
        imprimir(empleadoCopia.getTextoImprimir());     
    }
    
    public static void imprimir(String Txt) {
        System.out.println(Txt);
    }
    
    public static String ConvertirATxt(int entero){
        return String.valueOf(entero);
    }
    
}
