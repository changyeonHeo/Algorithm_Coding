class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        for(int i = 0; i < s.length(); i++){
            if((s.length() != 4 && s.length() != 6) || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                answer = false;
            }
        }
        return answer;
    }
}