import java.time.LocalDate;
import java.util.Random;

public class Elemento {
    private Long isbn;
    private String titolo;
    private LocalDate annoDiPubblicazione;
    private int numPag;

    // Costruttore
    public Elemento(String titolo, LocalDate annoDiPubblicazione, int numPag) {
        this.isbn = generateRandomIsbn();
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numPag = numPag;
    }

    // Metodo per generare un ISBN casuale
    private Long generateRandomIsbn() {
        Random random = new Random();
        //math.abs per calcolare il valore assoluto e non avere valori negativi
        return Math.abs(random.nextLong() );
    }

    // Getter e Setter
    public Long getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(LocalDate annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Elemento{" +
                "isbn=" + isbn +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numPag=" + numPag +
                '}';
    }
}
