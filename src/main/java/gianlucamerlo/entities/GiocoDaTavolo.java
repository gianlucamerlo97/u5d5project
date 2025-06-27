package gianlucamerlo.entities;

public class GiocoDaTavolo extends Collezione{
    private int numGiocatori;
    private int averageLenghtOfAMatch;


    public GiocoDaTavolo(int numGiocatori,String titolo,int idGioco,int annodiPubblicazione,int price,int averageLenghtOfAMatch)
    {
        super(idGioco,titolo,annodiPubblicazione,averageLenghtOfAMatch );
        this.numGiocatori=numGiocatori;
        this.averageLenghtOfAMatch=averageLenghtOfAMatch;
    }


    public int getAverageLenghtOfAMatch() {
        return averageLenghtOfAMatch;
    }

    public void setAverageLenghtOfAMatch(int averageLenghtOfAMatch) {
        this.averageLenghtOfAMatch = averageLenghtOfAMatch;
    }

    public int getNumGiocatori() {
        return numGiocatori;
    }

    public void setNumGiocatori(int numGiocatori) {
        this.numGiocatori = numGiocatori;
    }


    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                "numGiocatori=" + numGiocatori +
                ", averageLenghtOfAMatch=" + averageLenghtOfAMatch +
                '}';
    }
}


