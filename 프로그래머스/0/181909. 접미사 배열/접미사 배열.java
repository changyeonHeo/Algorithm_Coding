import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.substring(i,my_string.length()));
        }
        Collections.sort(list);
        String[] str = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            str[i] = list.get(i);
        }
        return str;
    }
}