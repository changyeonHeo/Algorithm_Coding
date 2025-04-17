import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for(int i =0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }        
        
        Deque<Integer> deque = new ArrayDeque<>();
        Stack<String> answer = new Stack<>();
        int cur = 1;
        
        for(int num : arr){
            while(cur <= num){
                deque.push(cur);
                answer.push("+");
                cur++;
            }
            if(!deque.isEmpty() && deque.peek() == num){
                deque.pop();
                answer.push("-");
            }else{
                System.out.println("NO");
                return;
            }
        }
        for(String operation : answer){
            System.out.println(operation);
        }
    }
}