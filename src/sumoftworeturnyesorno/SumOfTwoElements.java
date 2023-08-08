package sumoftworeturnyesorno;

public class SumOfTwoElements {
    public String sumOfTwoElementsReturnYesOrNo(int[] books, int target) {
        if (books == null || books.length <= 1) {
            return "No";
        }
        String Yes = getSumOfTwoElementsReturnYesOrNo(books, target);
        if (Yes != null) return Yes;
        return "No";
    }

    private static String getSumOfTwoElementsReturnYesOrNo(int[] books, int target) {
        for (int m = 0; m < books.length; m++) {
            for (int n = m + 1; n < books.length; n++) {
                if (books[m] + books[n] == target) {
                    return "Yes";
                }
            }
        }
        return null;
    }
}
