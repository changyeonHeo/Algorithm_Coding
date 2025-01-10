import java.util.*;
public class Solution {
    public static List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num > k){
                result.add(num);
            }
        }
        return result;
    }
}