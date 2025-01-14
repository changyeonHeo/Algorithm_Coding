import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        
        for(int i =0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Stack<Integer> stack = new Stack<>();
        
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i =0 ; i< n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <arr[i]){
                ans[stack.pop()] = arr[i];                
            }
            stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < n; i++){
            sb.append(ans[i]);
            if(i < n -1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}