import java.util.*;
class Solution {
    public int solution(int[] stones, int k) {
        int left = 1, right = 200000000, answer =0;
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(cross(stones,k,mid)){
                answer = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return answer;
    }
    
    private boolean cross(int[] stones, int k, int people){
        int maxZeroCount = 0; int zeroCount = 0;
        for(int stone : stones){
            if(stone - people < 0){
                zeroCount++;
                if(zeroCount >= k) return false;
            }else{
                zeroCount = 0;
            }
        }
        return true;
    }
}