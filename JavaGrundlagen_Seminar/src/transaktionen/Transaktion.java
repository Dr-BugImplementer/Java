package transaktionen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Transaktion {

    static DateFormat zeit = new SimpleDateFormat("HH:mm:ss");
    static DateFormat datum = new SimpleDateFormat("dd.MM.yyyy");
    protected String tag;
    protected String uhrzeit;
    protected double betrag;

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUhrzeit() {
        return this.uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public double getBetrag() {
        return this.betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public Transaktion(double betrag) {
        Date date = new Date();
        tag = datum.format(date);
        uhrzeit = zeit.format(date);
        this.betrag = betrag;
    }

    @Override
    public String toString() {
        return "Transaktion EUR " + betrag + " vom " + tag + " um " + uhrzeit;
    }
}
