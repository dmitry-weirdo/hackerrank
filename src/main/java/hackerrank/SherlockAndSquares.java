package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SherlockAndSquares {

    private static final int MIN = 1;
    private static final int MAX = 1_000_000_000;

    private static final List<Integer> SQUARES = new ArrayList<>();

    public static void main(String[] args) {
        printResult(3, 9);
        printResult(17, 24);
    }

    private static void printResult(int a, int b) {
        final int result = squares(a, b);
        System.out.printf("[%d; %d]. Result: %d%n", a, b, result);
    }

    public static int squares(int a, int b) {
        final boolean aIsSquare = isPerfectSquareByUsingSqrt(a);

        final double s1 = Math.sqrt(a);
        final int int1 = (int) Math.floor(s1);

        int low = aIsSquare ? (int) s1 : (int1 + 1);

        final boolean bIsSquare = isPerfectSquareByUsingSqrt(a);
        final double s2 = Math.sqrt(b);
        final int int2 = (int) Math.floor(s2);

        int high = bIsSquare ? (int) s2 : int2;

        return high - low + 1;
    }

    public static boolean isPerfectSquareByUsingSqrt(long n) {
        if (n <= 0) {
            return false;
        }

        double squareRoot = Math.sqrt(n);
        long tst = (long) (squareRoot + 0.5);
        return tst * tst == n;
    }

    private static int findIndex(int x) {
        int i = SQUARES.get(0);

        while (SQUARES.get(i) < x) {
            i++;
        }

        return i;
    }

    private static void prefillSquares() {
        if (!SQUARES.isEmpty()) {
            return;
        }

        for (int i = 1; i < 31634; i++) {
            SQUARES.add(i * i);
        }

        System.out.println("SQUARES: ");
        System.out.println(SQUARES);
    }
}
