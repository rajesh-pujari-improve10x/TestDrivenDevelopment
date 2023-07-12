package findbomb;

public class FindBomb {
    public String findTheBomb(String text) {
        String sentence = text.toLowerCase();
        if (sentence.contains("bomb")) {
            return "Duck";
        } else {
            return "Relax, there’s no bomb.";
        }
    }
}
