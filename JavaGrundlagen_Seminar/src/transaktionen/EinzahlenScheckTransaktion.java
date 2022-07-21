package transaktionen;

public class EinzahlenScheckTransaktion extends Transaktion {
    private int scheckNummer;

    public int getScheckNummer() {
        return this.scheckNummer;
    }

    public void setScheckNummer(int scheckNummer) {
        this.scheckNummer = scheckNummer;
    }

    public EinzahlenScheckTransaktion(int scheckNummer,double betrag){
        super(betrag);
        this.scheckNummer=scheckNummer;
    }

    @Override
    public String toString(){
        return "EinzahlenScheck"+super.toString()+",Nr."+scheckNummer;
    }
}

