public class Rettangolo {
    private double altezza;
    private double larghezza;


    public Rettangolo(double in1,double in2 ){
    this.altezza = in1;
    this.larghezza = in2;

    }

    public double calcolaArea() {
        return altezza * larghezza;
    }


    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }


    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Rettangolo:");
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }


    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo rettangolo:");
        System.out.println("Area: " + r1.calcolaArea());
        System.out.println("Perimetro: " + r1.calcolaPerimetro());

        System.out.println("\nSecondo rettangolo:");
        System.out.println("Area: " + r2.calcolaArea());
        System.out.println("Perimetro: " + r2.calcolaPerimetro());

        System.out.println("\nSomma delle aree: " + (r1.calcolaArea() + r2.calcolaArea()));
        System.out.println("Somma dei perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
    }
}
