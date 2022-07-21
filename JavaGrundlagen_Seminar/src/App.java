import java.util.concurrent.TimeUnit;

import transaktionen.AbhebenTransaktion;
import transaktionen.EinzahlenScheckTransaktion;
import transaktionen.EinzahlenTransaktion;

public class App {
    public static void main(String[] args) throws Exception {
        EinzahlenScheckTransaktion trans = new EinzahlenScheckTransaktion(123455, 675);
        System.out.println(trans);
        TimeUnit.SECONDS.sleep(2);
        EinzahlenTransaktion ein = new EinzahlenTransaktion(500);
        System.out.println(ein);
        AbhebenTransaktion ab = new AbhebenTransaktion(564);
        System.out.println(ab);
    }
}
