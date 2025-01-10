import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for(int i =0 ; i < my_str.length(); i+=n){
            if(i+n < my_str.length()){
                list.add(my_str.substring(i,i+n));
            }else{
                list.add(my_str.substring(i,my_str.length()));
            }
        }
        String[] s = new String[list.size()];
        for(int i =0; i < list.size(); i++){
            s[i] = list.get(i);
        }
        return s;
    }
}