class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] ans = new int[num_list.length];
        for(int i = n; i< num_list.length; i++){
            ans[idx++] = num_list[i];
        }
        for(int i = 0; i < n; i++){
            ans[idx++] = num_list[i];
        }
        return ans;
    }
}
