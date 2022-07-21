import java.util.concurrent.TimeUnit;

import bankanwendung.Konto;
import bankanwendung.KontonummerGenerator;
import transaktionen.AbhebenTransaktion;
import transaktionen.EinzahlenScheckTransaktion;
import transaktionen.EinzahlenTransaktion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(new EinzahlenScheckTransaktion(123455, 675)); 
        TimeUnit.SECONDS.sleep(2);
        System.out.println(new EinzahlenTransaktion(500));
        System.out.println(new AbhebenTransaktion(564));
        System.out.println(new AbhebenTransaktion(12345));
        System.out.println(new Konto(KontonummerGenerator.kontonummerFromFileIncrement(), "Alex Kelb", 463.87, 500, "ManyokWurzel"));
    }
}
