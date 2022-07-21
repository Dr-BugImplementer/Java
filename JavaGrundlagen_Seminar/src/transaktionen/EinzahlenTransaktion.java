package transaktionen;

public class EinzahlenTransaktion extends Transaktion {
    
    public EinzahlenTransaktion(double betrag) {
        super(betrag);
    }
    
    public String toString(){
        return "Einzahlen"+super.toString();
    }
}
