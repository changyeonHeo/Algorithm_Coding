import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i =0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
