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
public class Jugador {
    private Persona Descripcion;
    private boolean esAlero;
    private boolean esDefensa;
    private boolean esPortero;

    public Jugador(Persona Descripcion, boolean esAlero, boolean esDefensa, boolean esPortero) {
        this.Descripcion = Descripcion;
        this.esAlero = esAlero;
        this.esDefensa = esDefensa;
        this.esPortero = esPortero;
    }
    public Jugador(){
        
    }

    public Persona getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(Persona Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isEsAlero() {
        return esAlero;
    }

    public void setEsAlero(boolean esAlero) {
        this.esAlero = esAlero;
    }

    public boolean isEsDefensa() {
        return esDefensa;
    }

    public void setEsDefensa(boolean esDefensa) {
        this.esDefensa = esDefensa;
    }

    public boolean isEsPortero() {
        return esPortero;
    }

    public void setEsPortero(boolean esPortero) {
        this.esPortero = esPortero;
    }
    
}
