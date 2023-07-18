package integerinrange;

public class LowerBoundUpperBound {
    public boolean isNValueWIthInBounds(int n, int lower, int upper) {
        boolean result = false;
        if (lower <= n && n < upper) {
            result = true;
        }
        return result;
    }
}
