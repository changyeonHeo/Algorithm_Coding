import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            String num = Integer.toString(i);
            boolean valid = true;
            
            for(int j = 0; j < num.length(); j++){
                if(num.charAt(j) != '0' && num.charAt(j) != '5'){
                    valid = false;
                    break;
                }
            }
            if(valid){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            return new int[] {-1};
        }
        int[] arr= new int[list.size()];
        for(int i =0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
