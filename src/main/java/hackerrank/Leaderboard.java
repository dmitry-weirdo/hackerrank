package hackerrank;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Leaderboard {

    public static void main(String[] args) {
        // expect 6, 4, 2, 1
        final List<Integer> ranked = List.of(100, 100, 50, 40, 40, 20, 10);
        final List<Integer> player = List.of(5, 25, 50, 120);

        // expect 4, 3, 1
        // final List<Integer> ranked = List.of(100, 90, 90, 80);
        // final List<Integer> player = List.of(70, 80, 105);

        final List<Integer> result = climbingLeaderboard(ranked, player);

        System.out.println("Ranked:");
        System.out.println(ranked);

        System.out.println("Player:");
        System.out.println(player);

        System.out.println("Result:");
        System.out.println(result);
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        if (player.isEmpty()) {
            return new ArrayList<>();
        }

        if (ranked.isEmpty()) {
            List<Integer> r = new ArrayList<>(player.size());

            for (int i = 0; i < player.size(); i++) {
                r.add(1);
            }

            return r;
        }

        Set<Integer> map = new LinkedHashSet<>(ranked);

        final Integer[] scores = map
            .stream()
            .collect(Collectors.toList())
            .toArray(new Integer[0]);

        List<Integer> results = new ArrayList<>(player.size());

        int i = scores.length - 1;

        for (Integer score : player) {
            while (i > 0 && scores[i] <= score) {
                i--;
            }

            if (scores[i] > score) {
                results.add(i + 2);
            }
            else {
                results.add(i + 1);
            }
        }

        return results;
    }
}
