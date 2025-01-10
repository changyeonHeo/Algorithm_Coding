import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        
        while(n < arr.length){
           if(list.isEmpty()){
               list.add(arr[n]);
               n++;
           } else if(arr[n] > list.get(list.size() - 1)){
               list.add(arr[n]);
               n++;
           }else{
               list.remove(list.size() -1);
           }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
