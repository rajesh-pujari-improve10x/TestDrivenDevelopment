package lessthanhundred;

public class LessThanHundred {
    public boolean findLessThanHundred(int m, int n) {
        boolean result = false;
        if (m + n <= 100) {
            result = true;
        }
        return result;
    }
}
