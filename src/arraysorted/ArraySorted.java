package arraysorted;

public class ArraySorted {
    public boolean isArraySorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        } else if (arr.length == 1) {
            return true;
        }
        if (isSortedOrNot(arr)) return false;
        return true;
    }

    private static boolean isSortedOrNot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return true;
            }
        }
        return false;
    }
}
