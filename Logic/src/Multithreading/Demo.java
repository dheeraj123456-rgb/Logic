
package Multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create Min Heap
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>(
                    (a, b) -> a.getValue() - b.getValue()
                );

        // Step 3: Add entries to PriorityQueue
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            pq.offer(entry);

            // Keep only k elements
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Store k most frequent elements
        List<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }

        System.out.println("K Most Frequent Elements: " + result);
    }
}
