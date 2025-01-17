import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creiamo l'archivio
        Archivio archivio = new Archivio();

        // Creiamo i libri
        Libro libro1 = new Libro("Un Mondo Nuovo", LocalDate.of(1932, 1, 1), 311, "Aldous Huxley", "Distopia");
        Libro libro2 = new Libro("Alice nel Paese delle Meraviglie", LocalDate.of(1865, 11, 26), 112, "Lewis Carroll", "Fiaba");
        Libro libro3 = new Libro("Sapiens: Da animali a dèi", LocalDate.of(2011, 1, 1), 512, "Yuval Noah Harari", "Saggistica");
        Libro libro4 = new Libro("Homo Deus: Breve storia del futuro", LocalDate.of(2015, 1, 1), 480, "Yuval Noah Harari", "Saggistica");
        Libro libro5 = new Libro("Nexus", LocalDate.of(2024, 1, 1), 432, "Yuval Noah Harari", "Saggio");
        Libro libro6 = new Libro("Fight Club", LocalDate.of(1996, 8, 17), 224, "Chuck Palahniuk", "Romanzo");
        Libro libro7 = new Libro("Viaggio al centro della Terra", LocalDate.of(1864, 1, 1), 370, "Jules Verne", "Avventura");
        Libro libro8 = new Libro("Cent'anni di solitudine", LocalDate.of(1967, 5, 30), 417, "Gabriel García Márquez", "Realismo magico");
        Libro libro9 = new Libro("Mille e una notte", LocalDate.of(1300, 1, 1), 500, "Anonimo", "Racconti");

        //salvo gli isbn generati casualmente in una variabile, per poterli usare per testare il codice
        Long isbnDelLibro1 = libro1.getIsbn();
        System.out.println(isbnDelLibro1);

        //riviste
        Rivista rivista1 = new Rivista("National Geographic", LocalDate.of(2023, 3, 1), 120, Rivista.Periodicita.mensile);
        Rivista rivista2 = new Rivista("Time", LocalDate.of(2023, 5, 15), 80, Rivista.Periodicita.settimanle);
        Rivista rivista3 = new Rivista("The Economist", LocalDate.of(2023, 2, 1), 100, Rivista.Periodicita.settimanle);
        Rivista rivista4 = new Rivista("Vogue", LocalDate.of(2023, 4, 1), 150, Rivista.Periodicita.mensile);
        Rivista rivista5 = new Rivista("Wired", LocalDate.of(2023, 6, 1), 130, Rivista.Periodicita.mensile);

        // Aggiungiamo i libri all'archivio
        archivio.aggiungiLibro(libro1);
        archivio.aggiungiLibro(libro2);
        archivio.aggiungiLibro(libro3);
        archivio.aggiungiLibro(libro4);
        archivio.aggiungiLibro(libro5);
        archivio.aggiungiLibro(libro6);
        archivio.aggiungiLibro(libro7);
        archivio.aggiungiLibro(libro8);
        archivio.aggiungiLibro(libro9);


        // Aggiungiamo le riviste all'archivio
        archivio.aggiungiRivista(rivista1);
        archivio.aggiungiRivista(rivista2);
        archivio.aggiungiRivista(rivista3);
        archivio.aggiungiRivista(rivista4);
        archivio.aggiungiRivista(rivista5);


       // tutti i libri
       //archivio.mostraLibri();
       //tutte le riviste
       //archivio.mostraRiviste();

        // Eseguiamo la ricerca per ISBN
        // archivio.ricercaPerIsbn();

        //rimuovi libro usando ISBN
        //archivio.rimuoviLibro();

        //ricerca per anno
       // archivio.ricercaLibriPerAnno();
    }
}
