import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        int a = intervals[0][0];
        int b = intervals[0][1];
        int c = intervals[1][0];
        int d = intervals[1][1];
        
        for(int i = a; i<= b;i++){
            list.add(arr[i]);
        }
        for(int i =c;i<=d;i++){
            list.add(arr[i]);
        }
        
        return list;
    }
}