// Find the Duplicate Number.

import java.util.HashSet;

public class Day_3 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};

        HashSet<Integer> seen = new HashSet<>();
        int duplicate = -1;

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicate = num;
                break;
            }
            seen.add(num);
        }

        System.out.println("Duplicate number: " + duplicate);
    }
}
