import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int n = arr.length;
        LinkedList<Integer> result = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }
        }
        Collections.sort(result);
        int[] ans = new int[result.size()];
        for(int i= 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        if(result.size() == 0){
            ans = new int[]{-1};
        }
        return ans;
    }
}