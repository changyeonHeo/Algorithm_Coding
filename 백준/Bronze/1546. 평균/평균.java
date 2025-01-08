import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        float avg = 0;
        avg = (((float)sum / max) * 100) / n;
        System.out.println(avg);
    }
}