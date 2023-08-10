package largestoddnumber;

public class LargestOddNumber {
    public String largestOddNumberInStr(String number) {
        if (number == null || number.equals("") || number.equals("0")) {
            return "";
        }
        String num = number.trim();
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i)%2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
