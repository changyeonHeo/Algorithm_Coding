import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] answer2 = new String[files.length][3];
        
        for(int i =0; i < files.length; i++){
            String s = files[i];
            int startNumIdx = -1;
            boolean first = true;
            int endNumIdx = -1;
            int size = 0;
            
            for(int j =0; j < s.length(); j++){
                if(Character.isDigit(s.charAt(j))){
                    if(first){
                        startNumIdx = j;
                        first = false;
                    }
                    size++;
                }else{
                    if(!first){
                        break;
                    }
                }
            }
            endNumIdx = startNumIdx + size - 1;
            
            String head = s.substring(0,startNumIdx);
            String number = s.substring(startNumIdx,endNumIdx+1);
            String tail = s.substring(endNumIdx+1);
            
            answer2[i][0] = head;
            answer2[i][1] = number;
            answer2[i][2] = tail;
        }
        Arrays.sort(answer2,(o1,o2)->{
            if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT))>0){
                return 1;
            }else if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT))<0){
                return -1;
            }else{
                if(Integer.parseInt(o1[1]) > Integer.parseInt(o2[1])){
                    return 1;
                }else if(Integer.parseInt(o1[1]) < Integer.parseInt(o2[1])){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        for(int i =0; i < answer.length; i++){
            answer[i] = answer2[i][0] + answer2[i][1] + answer2[i][2];
        }
        return answer;
    }
}