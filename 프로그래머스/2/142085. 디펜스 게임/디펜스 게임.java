import java.util.*;

public class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int total = 0;

        for (int i = 0; i < enemy.length; i++) {
            minHeap.offer(enemy[i]);
            total += enemy[i];

            if (minHeap.size() > k) {
                n -= minHeap.poll();
            }

            if (n < 0) {
                return i;
            }
        }

        return enemy.length;
    }
}
