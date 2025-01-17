import java.time.LocalDate;

public class Rivista extends Elemento {

    /* Enum è un "dato speciale" che si usa in caso di elenchi
    * limitiamo i valori che la variabile periodicità può avere
    * a tre elementi
     */
    public enum Periodicita {
        settimanle,
        mensile,
        semestrale
    }

    //dichiariamo la variabile Periodicità che può assumero solo i pre valori dichiarati sopra
    private Periodicita periodicita;

    // Costruttore
    public Rivista(String titolo, LocalDate annoDiPubblicazione, int numPag, Periodicita periodicita) {
        super(titolo, annoDiPubblicazione, numPag);
        this.periodicita = periodicita;
    }

    // Getter e Setter
    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    // toString
    @Override
    public String toString() {
        return "Rivista{" +
                "isbn=" + getIsbn() +
                ", titolo='" + getTitolo() + '\'' +
                ", annoDiPubblicazione=" + getAnnoDiPubblicazione() +
                ", numPag=" + getNumPag() +
                ", periodicita=" + periodicita +
                '}';
    }
}
