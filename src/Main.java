import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		//es1
		Rettangolo rettangolo1 = new Rettangolo(5, 10);
		Rettangolo rettangolo2 = new Rettangolo(7, 3);

		System.out.println("Stampa singolo rettangolo:");
		Rettangolo.stampaRettangolo(rettangolo1);


		System.out.println("\nStampa due rettangoli:");
		Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

		//es2
		OperatoreTelefonico op1 = new OperatoreTelefonico(3454645446L);
		System.out.println("Dati iniziali della SIM:");
		op1.printData();

		op1.recharge(10);

		op1.callSomeone(9876543210L, 5); // 5 minuti
		op1.callSomeone(5555555555L, 3); // 3 minuti
		op1.callSomeone(4444444444L, 10); // 10 minuti
		op1.callSomeone(1111111111L, 2); // 2 minuti
		op1.callSomeone(9999999999L, 1); // 1 minuto
		op1.callSomeone(3333333333L, 4); // Sovrascrive la più vecchia


		System.out.println("\nDati aggiornati della SIM:");
		op1.printData();

	}
}