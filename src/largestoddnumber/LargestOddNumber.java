package largestoddnumber;

public class LargestOddNumber {
    public String largestOddNumberInStr(String number) {
        if (number == null || number.equals("") || number.equals("0")) {
            return "";
        }
        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i)%2 != 0) {
                return number.substring(0, i + 1);
            }
        }
        return "";
    }
}
