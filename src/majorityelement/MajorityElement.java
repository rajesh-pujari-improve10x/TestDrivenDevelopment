package majorityelement;

public class MajorityElement {
    public int findMajorityElement(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                if (count > arr.length/2) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
