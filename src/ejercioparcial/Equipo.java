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
public class Equipo {
 Persona Gerente;
 Jugador[] jugadores;
 
 public Equipo(Persona Gerente,int no){
     this.Gerente=Gerente;
     this.jugadores=new Jugador[no];
     for(int i=0;i<no;i++){
         this.jugadores[i]=new Jugador();
     }
 }
    public Equipo(int no){
     this.jugadores=new Jugador[no];
        for(int i=0;i<no;i++){
         jugadores[i]=new Jugador();
     }   
    }

    public Persona getGerente() {
        return Gerente;
    }

    public void setGerente(Persona Gerente) {
        this.Gerente = Gerente;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
 
}
