import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = i+1;
        }
        int start =0, end =0;
        int sum = 0;
        int count = 0;
        
        while(start < n){
            if(sum < n && end < n){
                sum += arr[end];
                end++;
            }else if(sum > n){
                sum -= arr[start];
                start++;
            }else{
                count++;
                sum -= arr[start];
                start++;
            }
        }
        System.out.print(count);
    }
}