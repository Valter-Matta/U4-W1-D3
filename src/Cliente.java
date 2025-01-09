import java.time.LocalDate;

public class Cliente {
	private String codice;
	private String nomeCognome;
	private String email;
	private LocalDate dataIscrizione;


	public Cliente(String codice, String nomeCognome, String email, LocalDate dataIscrizione) {
		this.codice = codice;
		this.nomeCognome = nomeCognome;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}


}
