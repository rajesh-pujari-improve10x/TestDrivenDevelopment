package reverseword;

public class ReverseWord {
    public String reverseWordsInAString(String str) {
        String reverseWord = "";
        if (str != null && !str.isEmpty()) {
            String[] words = str.trim().split("\\s+");
            for (int i = words.length - 1; i >= 0; i--) {
                reverseWord += words[i] + " ";
            }
        }
        return reverseWord.trim();
    }
}
