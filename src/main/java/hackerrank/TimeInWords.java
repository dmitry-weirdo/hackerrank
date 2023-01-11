package hackerrank;

public class TimeInWords {

    private static final String[] NUMBERS = {
        "zero", // 0
        "one", // 1
        "two", // 2
        "three", // 3
        "four", // 4
        "five", // 5
        "six", // 6
        "seven", // 7
        "eight", // 8
        "nine", // 9
        "ten", // 10
        "eleven", // 11
        "twelve", // 12
        "thirteen", // 13
        "fourteen", // 14
        "fifteen", // 15
        "sixteen", // 16
        "seventeen", // 17
        "eighteen", // 18
        "nineteen", // 19
        "twenty", // 20
        "twenty one", // 21
        "twenty two", // 22
        "twenty three", // 23
        "twenty four", // 24
        "twenty five", // 25
        "twenty six", // 26
        "twenty seven", // 27
        "twenty eight", // 28
        "twenty nine", // 29
        "thirty" // 30
    };

    public static String timeInWords(int h, int m) {
        if (m == 0) { // o'clock
            return NUMBERS[h] + " o' clock";
        }

        if (m <= 30) { // "past current hour" logic
            String hoursString = " past " + NUMBERS[h];

            if (m == 15) {
                return "quarter" + hoursString;
            }

            if (m == 30) {
                return "half" + hoursString;
            }

            String minutesString = getMinutesString(m);

            return String.format("%s%s", minutesString, hoursString);
        }
        else { // "to next hour" logic
            String hoursString = " to " + NUMBERS[h + 1];

            if (m == 45) {
                return "quarter" + hoursString;
            }

            String minutesString = getMinutesString(60 - m);

            return String.format("%s%s", minutesString, hoursString);
        }
    }

    private static String getMinutesString(int minutes) {
        String number = NUMBERS[minutes];
        String word = getMinutesWord(minutes);

        return String.format("%s %s", number, word);
    }

    private static String getMinutesWord(int minutes) {
        return (minutes == 1) ? "minute" : "minutes";
    }
}
