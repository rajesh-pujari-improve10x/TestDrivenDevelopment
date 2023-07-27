package encryption;

public class Encryption {

    /*public static void main(String[] args) {
        System.out.println(encrypt("ab"));
    }*/

    public static String encrypt(String word) {
        if (word == null || word.isEmpty()) {
            return "aca";
        }
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'A') {
                c = '0';
            } else if (c == 'e' || c == 'E') {
                c = '1';
            } else if (c == 'i' || c == 'I') {
                c = '2';
            } else if (c == 'o' || c == 'O') {
                c = '3';
            } else if (c == 'u' || c == 'U') {
                c = '4';
            }
            reverseWord += c;
        }
        return reverseWord + "aca";

        /*if (word == null || word.isEmpty()) {
            return "aca";
        }
        StringBuilder reverseWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'A') {
                c = '0';
            } else if (c == 'e') {
                c = '1';
            } else if (c == 'i') {
                c = '2';
            } else if (c == 'o') {
                c = '3';
            } else if (c == 'u') {
                c = '4';
            }
            reverseWord.append(c);
        }
        return reverseWord + "aca";*/
    }
}
