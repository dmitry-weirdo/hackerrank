package hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EqualizeArray {

    public static void main(String[] args) {
        final List<Integer> list = List.of(100);
        // final List<Integer> list = List.of(1, 1, 1, 1);
        // final List<Integer> list = List.of(1, 2, 2, 3);

        final int result = equalizeArray(list);

        System.out.println("List: " + list);
        System.out.println("Result: " + result);
    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Long> counted = arr
            .stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final Collection<Long> counts = counted.values();
        final int maxCount = Collections.max(counts).intValue();

        return arr.size() - maxCount;
    }
}
