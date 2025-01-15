import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : arr) {
            if (!deque.isEmpty() && num == deque.peekLast()) {
                continue;
            } else {
                deque.addLast(num);
            }
        }
        int[] ans = new int[deque.size()];
        int index = 0;
        while (!deque.isEmpty()) {
            ans[index++] = deque.pollFirst();
        }
        return ans;
    }
}
