/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercioparcial;

/**
 *
 * @author Valentine Chimezie
 */
public class Persona {
   private String Descripcion;
   
    public Persona(String Descripcion) {
        this.Descripcion = Descripcion;
    }
   public Persona(){
       
   } 

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }


}
