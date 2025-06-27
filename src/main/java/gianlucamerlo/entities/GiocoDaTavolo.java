package gianlucamerlo.entities;

public class GiocoDaTavolo {
    private int numGiocatori;
    private int averageLenghtOfAMatch;


    public GiocoDaTavolo(int numGiocatori,int averageLenghtOfAMatch){
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


