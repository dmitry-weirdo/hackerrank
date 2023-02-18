package hackerrank;

public class RecursiveDigitSum { // https://www.hackerrank.com/challenges/recursive-digit-sum/problem

    public static int superDigit(String n, int k) {
        // Write your code here
        long firstSum = getSum(n);

        // first string has to be summed up K times
        firstSum *= k;

        String firstSumString = Long.toString(firstSum);

        long resultLong = sumRecursive(firstSumString);
        return (int) resultLong;
    }

    private static long sumRecursive(String s) {
        if (s.length() == 1) {
            return getSum(s);
        }

        long sum = getSum(s);
        String sumString = Long.toString(sum);

        return sumRecursive(sumString);
    }

    private static long getSum(String s) {
        long sum = 0;

        for (int i = 0; i < s.length(); i++) {
            String digitString = s.substring(i, i + 1);
            int digit = Integer.parseInt(digitString);

            sum += digit;
        }

        return sum;
    }
}
