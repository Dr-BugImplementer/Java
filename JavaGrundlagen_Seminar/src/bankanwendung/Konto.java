package bankanwendung;

import caesar.Chiffre;

public class Konto {
    private int kontonummer;
    private String name;
    private double kontostand;
    private double dispositionskredit;
    private String passwort;

    public Konto(int kontonummer, String name, double kontostand) {
        this.kontonummer = kontonummer;
        this.name = name;
        this.kontostand = kontostand;
    }

    public Konto(int kontonummer, String name, double kontostand, double dispositionskredit) {
        this.kontonummer = kontonummer;
        this.name = name;
        this.kontostand = kontostand;
        this.dispositionskredit = dispositionskredit;
    }

    public Konto(int kontonummer, String name, double kontostand, double dispositionskredit, String passwort) {
        this.kontonummer = kontonummer;
        this.name = name;
        this.kontostand = kontostand;
        this.dispositionskredit = dispositionskredit;
        this.passwort = Chiffre.verschluesseln(passwort);
    }

    public int getKontonummer() { // Kontonummer zurückliefern
        return kontonummer;
    }

    public String getName() { // Name Kontoinhaber zurückliefern
        return name;
    }

    public double getKontostand() { // Kontostand zurückliefern
        return kontostand;
    }

    public void setKontonummer(int kontonummer) { // Kontonummer auf übergebenene Wert setzen
        this.kontonummer = kontonummer;
    }

    public void setName(String name) { // Kontoinhaber auf übergebeben Wert ändern
        this.name = name;
    }

    public void setKontostand(double kontostand) { // Kontostand auf übergebenen Wert setzen
        this.kontostand = kontostand;
    }

    public double getDispositionskredit() {
        return this.dispositionskredit;
    }

    public void setDispositionskredit(double dispositionskredit) {
        this.dispositionskredit = dispositionskredit;
    }

    public String getPasswort() {
        return this.passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void einzahlen(double betrag) { // setze Kontostand auf derzeitige Kontostand + übergebenen Wert
        this.setKontostand(this.getKontostand() + betrag);
    }

    public void auszahlen(double betrag) { // setze Kontostand auf derzeitige Kontostand - übergebenen Wert
        if (pruefeDispoLimit(betrag)) {
            this.setKontostand(this.getKontostand() - betrag);
        }
    }

    public boolean pruefeDispoLimit(double betrag) {
        return kontostand + dispositionskredit >= betrag;
    }

    public void reset() { // Attributwerte auf Standardanforderung setzen
        this.kontonummer = 0;
        this.name = null;
        this.kontostand = 0.0;
    }

    @Override
    public String toString() {
        return "Die Kontodaten lauten :\nKontonummer: " + this.getKontonummer() + "\nKontoinhaber: " + this.getName()
                + "\nKontostand: " + this.getKontostand() + "Euro\nDispolimit: " + this.getDispositionskredit()
                + "Euro\n" + "Das \"sichere\" Passwort lautet : " + this.getPasswort() ;
    }

}
