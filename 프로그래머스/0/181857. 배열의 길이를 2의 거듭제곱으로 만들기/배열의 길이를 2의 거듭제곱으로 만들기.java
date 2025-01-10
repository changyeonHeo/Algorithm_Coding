import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int length = 1;
        while(length < arr.length){
            length *= 2;
        }
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        int n = length - arr.length;
        for(int i =0; i < n; i++){
            list.add(0);
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
