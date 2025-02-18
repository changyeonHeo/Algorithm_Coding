import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i< n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        long sum = 0;
        for(int i =0; i < m; i++){
            sum += arr[i];
        }
        long max = sum;
        for(int j = 0; j+m < n; j++){
            sum -= arr[j];
            sum += arr[j+m];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}