public class Articolo {
	private String codice;
	private String descrizione;
	private double prezzo;
	private int pezziDisponibili;

	// Costruttore
	public Articolo(String codice, String descrizione, double prezzo, int pezziDisponibili) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.pezziDisponibili = pezziDisponibili;
	}
}
