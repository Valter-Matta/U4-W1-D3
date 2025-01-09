public class Carrello {
	private Cliente cliente;
	private Articolo[] articoli;
	private int count;
	private double totaleCosto;

	public Carrello (Cliente cliente) {
		this.cliente = cliente;
		this.articoli = new Articolo[10]; //
		this.count = 0;
		this.totaleCosto = 0.0;
	}

	public boolean addToCart (Articolo article) {
		articoli[count] = article;
		count++;
		totaleCosto += article.getPrezzo() * article.getQuantità();
		return true;
	}

	public double getTotaleCosto () {
		return totaleCosto;
	}

	public void showContent () {
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("articoli nel carrelo");
		for (int i = 0; i < count; i++) {
			System.out.println("n" + (i+1) + ": " + articoli[i].getNome() + " | Prezzo: " + articoli[i].getPrezzo() + " €  | Q."+ articoli[i].getQuantità());
		}
		System.out.println("Per un totale di: "+ totaleCosto + " €");
	}

}
