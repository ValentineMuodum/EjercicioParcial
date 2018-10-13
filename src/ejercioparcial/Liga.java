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
public class Liga {
Equipo[] equipos;
    /**
     * @param args the command line arguments
     */
public Liga(){
    
}
public Liga(Equipo[] equipos){
        this.equipos = equipos;
}

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    private void ListarGerentes() {
        System.out.println("Lista de Gerentes");
        System.out.println("");
        for(int i=0;i<equipos.length;i++){
            System.out.print("Gerente ");
            System.out.println(i+1);
            System.out.println(this.equipos[i].getGerente().getDescripcion());
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    Persona g1=new Persona("Laura Moreno");
    Persona g2=new Persona("Valentine Muodum");
    Persona relleno1=new Persona("A");
    Persona relleno2=new Persona("B");
   Jugador[] jugadores1=new Jugador[3];
   Jugador[] jugadores2=new Jugador[3];
   for(int i=0;i<3;i++){
       jugadores1[i]=new Jugador(relleno1, true,false, false);
       jugadores2[i]=new Jugador(relleno2, false, true,false);
   }
      Equipo[] equiposliga=new Equipo[2];
      equiposliga[0]=new Equipo(g1,3);
      equiposliga[1]=new Equipo(g2, 3);
      equiposliga[0].setJugadores(jugadores1);
      equiposliga[1].setJugadores(jugadores2);
    Liga liga=new Liga(equiposliga);
    liga.ListarGerentes();
    }
    
}
