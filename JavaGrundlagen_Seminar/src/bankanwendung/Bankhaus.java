package bankanwendung;

public class Bankhaus {
    public static int anzahlBankhauser = 0;
    private Konto empfaenger;
    private Konto sender;
    private Konto[] bankkonten;
    private int anzahlBankkonten = 0;

    public Konto getEmpfaenger() {
        return this.empfaenger;
    }

    public void setEmpfaenger(Konto empfaenger) {
        this.empfaenger = empfaenger;
    }

    public Konto getSender() {
        return this.sender;
    }

    public void setSender(Konto sender) {
        this.sender = sender;
    }

    public Konto[] getBankkonten() {
        return this.bankkonten;
    }

    public void setNextBankkonto(Konto bankkonto) {
        try {
            this.bankkonten[anzahlBankkonten] = bankkonto;
            anzahlBankkonten++;   
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Maximale Kontenzahl erreicht");
        }
    }

    public int getAnzahlBankkonten() {
        return this.anzahlBankkonten;
    }

    public Bankhaus(int kontonummer1, String name1, double kontostand1, int kontonummer2, String name2,
            double kontostand2) {
        empfaenger = new Konto(kontonummer1, name1, kontostand1);
        sender = new Konto(kontonummer2, name2, kontostand2);
        anzahlBankhauser++;
    }

    public Bankhaus(Konto sender, Konto empfaenger) {
        this.sender = sender;
        this.empfaenger = empfaenger;
        anzahlBankhauser++;
    }

    public Bankhaus(int kontenzahl) {
        this.bankkonten = new Konto[kontenzahl];
        anzahlBankhauser++;
    }

    public String ueberweisen(double betrag) {
        if (sender.pruefeDispoLimit(betrag)) {
            sender.auszahlen(betrag);
            empfaenger.einzahlen(betrag);
            return betrag + " wurde überwiesen";
        }
        return "Überweisung konnte nicht durchgeführt werden - Zu wenig Geld um " + betrag + " Euro zu überweisen";
    }
}
