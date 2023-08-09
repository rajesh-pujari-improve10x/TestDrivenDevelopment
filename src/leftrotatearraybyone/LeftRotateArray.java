package leftrotatearraybyone;

public class LeftRotateArray {
    public int[] leftRotateArrayByOne(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[] {};
        } else {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
}
