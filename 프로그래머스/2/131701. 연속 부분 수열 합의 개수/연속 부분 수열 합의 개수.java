import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        int[] extend = new int[elements.length * 2];
        for(int i =0; i < elements.length; i++){
            extend[i] = elements[i];
            extend[i+elements.length] = elements[i];
        }
        for(int length = 1; length <= elements.length; length++){
            for(int start = 0; start < elements.length; start++){
                int sum =0;
                for(int i =0; i < length; i++){
                    sum += extend[start+i];
                }
                sumSet.add(sum);
            }
        }
        return sumSet.size();
    }
}