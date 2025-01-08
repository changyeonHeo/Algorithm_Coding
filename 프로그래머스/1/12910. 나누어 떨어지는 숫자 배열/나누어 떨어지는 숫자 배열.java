import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int idx = 0;
        int num =0 ;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                idx++;
            }
        }
        if(idx == 0){
            int[] ans = {-1};
            return ans;
        }
        
        int[] ans = new int[idx];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                ans[num] = arr[i];
                num++;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}