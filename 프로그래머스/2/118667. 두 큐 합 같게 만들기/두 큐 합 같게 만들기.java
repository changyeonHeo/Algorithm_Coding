import java.util.*;
public class Solution {
	public static int solution(int[] queue1, int[] queue2) {
		int ans = 0;
        long total = 0;
        long q1sum = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i =0; i < queue1.length; i++){
            total += ( queue1[i] + queue2[i]);
            q1sum += queue1[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        if(total % 2 != 0) return -1;
        long target = total / 2;
        while(true){
            if(ans>(queue1.length + queue2.length) * 2) return -1;
            if(q1sum == target) break;
            else if(q1sum > target){
                q1sum -= q1.peek();
                q2.add(q1.poll());
            }else{
                q1sum += q2.peek();
                q1.add(q2.poll());
            }
            ans++;
        }
        return ans;
	}
}