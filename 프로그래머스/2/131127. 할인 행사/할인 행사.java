import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0;
        Map<String,Integer> wantMap = new HashMap<>();
        for(int i =0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        for(int i =0; i <= discount.length-10; i++){
            Map<String, Integer> discountMap = new HashMap<>();
            for(int j =i; j < i + 10; j++){
                discountMap.put(discount[j],discountMap.getOrDefault(discount[j],0)+1);
            }
            boolean isPossible = true;
            for(String product : wantMap.keySet()){
                if(discountMap.getOrDefault(product,0) < wantMap.get(product)){
                    isPossible = false;
                    break;
                }
            }
            if(isPossible){
                count++;
            }
        }
        return count;
    }
}
