package transaktionen;

public class AbhebenTransaktion extends Transaktion {

    public AbhebenTransaktion(double betrag) {
        super(betrag);
    }

    @Override
    public String toString(){
        return "Abheben"+super.toString();
    }
    
}
