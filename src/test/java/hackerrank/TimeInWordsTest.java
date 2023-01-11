package hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeInWordsTest {

    @Test
    void testTimes() {
        assertTime(5, 0, "five o' clock");
        assertTime(5, 1, "one minute past five");
        assertTime(5, 10, "ten minutes past five");
        assertTime(5, 15, "quarter past five");
        assertTime(5, 30, "half past five");
        assertTime(5, 40, "twenty minutes to six");
        assertTime(5, 45, "quarter to six");
        assertTime(5, 47, "thirteen minutes to six");
        assertTime(5, 28, "twenty eight minutes past five");
    }

    void assertTime(int hours, int minutes, String expectedResult) {
        String result = TimeInWords.timeInWords(hours, minutes);
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}
