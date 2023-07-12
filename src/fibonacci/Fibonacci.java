package fibonacci;

public class Fibonacci {
    public int findNthNumber(int num) {
        if (num <= 0) {
            return -1;
        } else if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return findNthNumber(num-1) + findNthNumber(num-2);
        }
    }
}
