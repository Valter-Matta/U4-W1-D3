public class OperatoreTelefonico {
	private long number;
	private double credit;
	private String[] calls;
	private int count;
	private double min;

	public OperatoreTelefonico (long num) {
		this.number = num;
		this.credit = 0;
		this.calls = new String[5];
		this.count = 0;
	}

	public void printData () {
		System.out.println("Numero di telefono: " + this.number);
		System.out.println("Credito residuo: " + this.credit);
		System.out.println("Chiamate recenti:");
		if (this.count == 0) {
			System.out.println("Nessuna chiamata effettuata.");
		} else {
			for (int i = 0; i < this.count; i++) {
				System.out.println(this.calls[i]);
			}
		}
	}

	public void callSomeone (long num,double time) {
		double costoChiamata = time * 0.20;

		if (credit >= costoChiamata) {
			credit -= costoChiamata;
			String chiamata = "Numero: " + num + ", Durata: " + time + " minuti";


			if (count < 5) {
				calls[count] = chiamata;
			} else {

				for (int i = 1; i < 5; i++) {
					calls[i - 1] = calls[i];
				}
				calls[4] = chiamata;
			}
			count = Math.min(count + 1, 5);
			System.out.println("Chiamata effettuata con successo.");
		} else {
			System.out.println("Credito insufficiente per effettuare la chiamata.");
		}

	}

	public void recharge(double importo) {
		credit += importo;
		System.out.println("Credito ricaricato di " + importo + "€. Credito attuale: " + credit + "€.");
	}
}
