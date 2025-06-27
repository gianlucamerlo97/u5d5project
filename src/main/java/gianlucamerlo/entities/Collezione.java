package gianlucamerlo.entities;

public  abstract class Collezione {
    private final int idGioco;
    private String titolo;
    private int annoDiPubblicazione;
    private int price;


    public Collezione(final int idGioco,String titolo, int annoDiPubblicazione,int price){
        this.idGioco=idGioco;
        this.titolo=titolo;
        this.annoDiPubblicazione=annoDiPubblicazione;
        this.price=price;
    }

    public int getIdGioco() {
        return idGioco;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        titolo = titolo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    @Override
    public String toString() {
        return "Gioco{" +
                "idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", price=" + price +
                '}';
    }
}
