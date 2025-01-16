import java.util.*;
class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            ch[i] = s.charAt(i);
        }
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && ch[i] == stack.peek()){
                stack.pop();
            }else{
                stack.push(ch[i]);
            }
        }
        return stack.isEmpty()? 1 : 0;
    }
}