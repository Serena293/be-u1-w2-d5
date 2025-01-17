import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Archivio {
    // Lista per memorizzare i libri
    private List<Libro> libri;
    // Lista per memorizzare le riviste
    private List<Rivista> riviste;

    // Costruttore
    public Archivio() {
        this.libri = new ArrayList<>();
        this.riviste = new ArrayList<>();
    }

    // Aggiungere un libro all'archivio
    public void aggiungiLibro(Libro libro) {
        try {
            // Controlla se l'ISBN del libro esiste già
            for (Libro l : libri) {
                if (l.getIsbn().equals(libro.getIsbn())) {
                    throw new Exception("Questo libro è già in archivio");
                }
            }
            // Aggiungi il libro alla lista se non esiste già
            libri.add(libro);
          //  System.out.println("Libro aggiunto: " + libro.getTitolo());
        } catch (Exception e) {
            // Gestisci l'errore nel caso in cui l'ISBN sia duplicato
            System.out.println(e.getMessage());
        }
    }

    // Aggiungere una rivista all'archivio
    public void aggiungiRivista(Rivista rivista) {
        try {
            // Controlla se l'ISBN della rivista esiste già
            for (Rivista r : riviste) {
                if (r.getIsbn().equals(rivista.getIsbn())) {
                    throw new Exception("Questa rivista è già in archivio");
                }
            }
            // Aggiungi la rivista alla lista se non esiste già
            riviste.add(rivista);
           // System.out.println("Rivista aggiunta: " + rivista.getTitolo());
        } catch (Exception e) {
            // Gestisci l'errore nel caso in cui l'ISBN sia duplicato
            System.out.println(e.getMessage());
        }
    }

    // Metodo per visualizzare tutti i libri nell'archivio
    public void mostraLibri() {
        if (libri.isEmpty()) {
            System.out.println("Nessun libro presente nell'archivio.");
        } else {
            for (Libro libro : libri) {
                System.out.println(libro);
            }
        }
    }

    // Metodo per visualizzare tutte le riviste nell'archivio
    public void mostraRiviste() {
        if (riviste.isEmpty()) {
            System.out.println("Nessuna rivista presente nell'archivio.");
        } else {
            for (Rivista rivista : riviste) {
                System.out.println(rivista);
            }
        }
    }

    public void ricercaPerIsbn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l'ISBN da cercare: ");
        Long isbnCercato = scanner.nextLong();

        // Ricerca tra i libri
        for (Libro libro : libri) {
            if (libro.getIsbn().equals(isbnCercato)) {
                System.out.println("Libro trovato: " + libro);
                return;
            }
        }

        // Ricerca tra le riviste
        for (Rivista rivista : riviste) {
            if (rivista.getIsbn().equals(isbnCercato)) {
                System.out.println("Rivista trovata: " + rivista);
                return;
            }
        }

        // Se l'ISBN non è trovato
        System.out.println("Elemento con ISBN " + isbnCercato + " non trovato.");
       }

    public void rimuoviLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l'ISBN del libro da rimuovere: ");
        Long isbn = scanner.nextLong();

        try {
            boolean trovato = false;
            // Cerca se esiste un libro con lo stesso ISBN e rimuovilo
            for (Libro libro : libri) {
                if (libro.getIsbn().equals(isbn)) {
                    libri.remove(libro);
                    System.out.println("Libro con ISBN " + isbn + " rimosso.");
                    trovato = true;
                    break;
                }
            }

            if (!trovato) {
                throw new Exception("Libro con ISBN " + isbn + " non trovato.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ricercaLibriPerAnno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l'anno di pubblicazione del libro da cercare: ");
        int anno = scanner.nextInt();

        boolean trovato = false;
        // Cerca tutti i libri con l'anno di pubblicazione specificato
        for (Libro libro : libri) {
            if (libro.getAnnoDiPubblicazione().getYear() == anno) {
                System.out.println(libro);
                trovato = true;
            }
        }

        if (!trovato) {
            System.out.println("Nessun libro trovato per l'anno " + anno);
        }
    }
}
