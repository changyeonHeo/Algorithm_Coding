class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] arr = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if(direction.equals("right")){
                arr[(i+1) % numbers.length] = numbers[i];
            }else{
                int temp = numbers[0];
                for(int j = 1; j < numbers.length; j++){
                    arr[j-1] = numbers[j];
                    arr[numbers.length -1] = temp;
                }
            }
        }
        return arr;
    }
}
