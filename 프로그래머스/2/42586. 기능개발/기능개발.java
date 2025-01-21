import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i< progresses.length; i++){
            if((100- progresses[i]) % speeds[i] == 0){
                q.add((100-progresses[i]) / speeds[i]);
            }else{
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        int x = q.poll();
        int count = 1;
        while(!q.isEmpty()){
            if(x>= q.peek()){
                count++;
                q.poll();
            }else{
                list.add(count);
                count = 1;
                x = q.poll();
            }
        }
        list.add(count);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
