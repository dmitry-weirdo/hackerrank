package hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursiveDigitSumTest {

    @Test
    void testSums() {
        assertSum("9", 1, 9);
        assertSum("9", 2, 9);
        assertSum("9875", 4, 8);
        assertSum("148", 3, 3);
    }

    private void assertSum(String n, int k, long expectedSum) {
        long sum = RecursiveDigitSum.superDigit(n, k);

        Assertions.assertThat(sum).isEqualTo(expectedSum);
    }
}
