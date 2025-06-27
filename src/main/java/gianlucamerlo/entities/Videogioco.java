package gianlucamerlo.entities;

import java.util.List;

public class Videogioco extends Collezione{

     private String piattaforma;
     private double ore;
     public Videogioco(int idGioco,String titolo,int annodiPubblicazione,int price,String piattaforma, double ore){
         super(idGioco,titolo,annodiPubblicazione,price);
         this.piattaforma=piattaforma;
         this.ore=ore;
     }


    public double getOre() {
        return ore;
    }

    public void setOre(double ore) {
        this.ore = ore;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }


    @Override
    public String toString() {
        return "Videogioco{" +
                "piattaforma='" + piattaforma + '\'' +
                ", ore=" + ore +
                "} " + super.toString();
    }
}
