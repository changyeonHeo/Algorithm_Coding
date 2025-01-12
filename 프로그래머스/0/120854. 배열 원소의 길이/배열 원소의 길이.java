class Solution {
    public int[] solution(String[] strlist) {
        int n = strlist.length;
        int[] arr = new int[n];
        for(int i =0 ; i < n; i++){
            arr[i] = strlist[i].length();
        }
        return arr;
    }
}