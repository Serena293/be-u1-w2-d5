import java.time.LocalDate;

public class Libro extends Elemento {
    private String autore;
    private String genere;

    // Costruttore
    public Libro(String titolo, LocalDate annoDiPubblicazione, int numPag, String autore, String genere) {
        super(titolo, annoDiPubblicazione, numPag);
        this.autore = autore;
        this.genere = genere;
    }

    // Getter e Setter
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + getIsbn() +  // ID ereditato dalla classe Elemento
                ", titolo='" + getTitolo() + '\'' +
                ", annoDiPubblicazione=" + getAnnoDiPubblicazione() +
                ", numPag=" + getNumPag() +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
