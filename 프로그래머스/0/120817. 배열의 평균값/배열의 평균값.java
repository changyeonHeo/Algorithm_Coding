class Solution {
    public double solution(int[] numbers) {
        double avg = 0;
        int sum =0;
        for(int i =0 ; i < numbers.length; i++){
            sum += numbers[i];
        }
        avg = (float)sum / numbers.length;
        return avg;
    }
}