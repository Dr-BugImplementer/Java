package bankanwendung;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class KontonummerGenerator {
    private static String filename = "C:\\Users\\Malte\\Desktop\\Java\\JavaGrundlagen_Seminar\\src\\Bankanwendung\\kontonummer.seq";

    public static int kontonummerFromFileIncrement() throws IOException {
        String kontonummerAlt = "1000000";
        File dateiLesen = new File(filename);
        Scanner scanner = new Scanner(dateiLesen);
        kontonummerAlt = scanner.nextLine();
        scanner.close();
        FileWriter dateiSchreiben = new FileWriter(filename);
        dateiSchreiben.write(Integer.toString(Integer.parseInt(kontonummerAlt) + 1));
        dateiSchreiben.close();
        return Integer.parseInt(kontonummerAlt) + 1;
    }

    public static int kontonummerFromTime() {
        long zeit = System.currentTimeMillis();
        if (Character.getNumericValue((String.valueOf(zeit).charAt(6))) > 4
                || Character.getNumericValue((String.valueOf(zeit).charAt(6))) == 0) {
            Random rand = new Random();
            return Integer.parseInt(((rand.nextInt(4) + 1) + String.valueOf(zeit).substring(7, 13)));
        }
        return Integer.parseInt(String.valueOf(zeit).substring(6, 13));
    }

}
