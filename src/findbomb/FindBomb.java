package findbomb;

public class FindBomb {
    public boolean findTheBomb(String text) {
        if (text.contains("bomb")) {
            return true;
        }
        return false;
    }
}
