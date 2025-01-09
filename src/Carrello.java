public class Carrello {
	private Cliente cliente;
	private Articolo[] articoli;
	private int count;
	private double totaleCosto;

	public Carrello(Cliente cliente) {
		this.cliente = cliente;
		this.articoli = new Articolo[10]; //
		this.count = 0;
		this.totaleCosto = 0.0;
	}

}
