package caesar;

import java.util.Scanner;

public class Chiffre {
    private static Scanner scanner = new Scanner(System.in);
    private static final int CAESARKEY = 1;

    public static String eingabeVerschluesseln() {
        System.out.print("Bitte das Passwort eingeben: ");
        String toEncode = scanner.nextLine();
        char[] arrayToEncode = toEncode.toCharArray();
        String encoded = "";

        for (int i = 0; i < arrayToEncode.length; i++) {
            int movedCharacter = (arrayToEncode[i] + CAESARKEY) % 256;
            encoded += (char) (movedCharacter);
        }
        return encoded;
    }

    public static String verschluesseln(String toEncode) {
        char[] arrayToEncode = toEncode.toCharArray();
        String encoded = "";

        for (int i = 0; i < arrayToEncode.length; i++) {
            encoded += (char) ((arrayToEncode[i] + CAESARKEY) % 256);
        }
        return encoded;
    }

    public static String entschluesseln(String toDecode) {
        char[] encodedArray = toDecode.toCharArray();
        String decoded = "";
        for (int i = 0; i < encodedArray.length; i++) {
            if (encodedArray[i] - CAESARKEY < 0) {
                decoded += (char) (encodedArray[i] - CAESARKEY + 256);
            } else {
                decoded += (char) ((encodedArray[i] - CAESARKEY) % 256);
            }
        }
        return decoded;
    }
}
