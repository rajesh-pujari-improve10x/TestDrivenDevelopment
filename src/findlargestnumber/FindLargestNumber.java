package findlargestnumber;

public class FindLargestNumber {
    public int findLargestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int largestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
}
