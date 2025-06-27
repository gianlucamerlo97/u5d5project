package gianlucamerlo.entities;

public abstract class Gioco {
    private String idGioco;
    private String Titolo;
    private int annoDiPubblicazione;
    private int price;

    public String getIdGioco() {
        return idGioco;
    }

    public void setIdGioco(String idGioco) {
        this.idGioco = idGioco;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price)
    if(price<=0){
        this.price = price;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }
}
