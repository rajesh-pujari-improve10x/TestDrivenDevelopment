package fizzbuzz;

public class FizzBuzz {
    public String findFizzBuzz(int num) {
        if (num > 0) {
            if (num % 3 == 0 && num % 5 == 0) {
                return "FizzBuzz";
            } else if (num % 3 == 0) {
                return "Fizz";
            } else if (num % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(num);
            }
        }
        return "-1";
    }
}
