import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i]*2; j++){
                    result.add(arr[i]);
                }
            }else{
                for(int j =0; j < arr[i]; j++){
                    result.remove(result.size()-1);
                }
            }
        }
        int[] ans = new int[result.size()];
        for(int i =0; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}