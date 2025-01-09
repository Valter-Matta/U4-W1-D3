import java.time.LocalDate;

public class Articolo {
	private String codice;
	private String descrizione;
	private double prezzo;
	private int quantita;

	// Costruttore
	public Articolo (String codice, String descrizione, double prezzo, int quantita) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}

	public double getPrezzo () {
		return prezzo;
	}

	public int getQuantità () {
		return quantita;
	}

	public String getNome () {
		return descrizione;
	}

	public static void main (String[] args) {
		LocalDate oggi = LocalDate.now();
		Cliente user1 = new Cliente("001", "Valter matta", "valter@gmail.com", oggi);
		Articolo pc1 = new Articolo("#01", "pc-gaming", 400, 1);
		Articolo tastiera = new Articolo("#02", "tastiera Razer", 150, 1);
		Articolo monitor = new Articolo("#03", "WQHD34PC", 240, 2);
		Carrello cart = new Carrello(user1);


		cart.addToCart(pc1);
		cart.addToCart(tastiera);
		cart.addToCart(monitor);
		cart.showContent();


	}
}
