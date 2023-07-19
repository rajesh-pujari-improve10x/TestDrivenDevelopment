package nthevennumber;

public class NthEvenNumber {

    public static void main(String[] args) {
        //System.out.println(findNthEvenNumber());
    }
    public static int findNthEvenNumber(int n) {
        int result = -1;
        if (n == 0 || n == 1) {
            result = 0;
        } else if (n > 1) {
            result = 2 * (n - 1);
        }
        return result;
    }
}
