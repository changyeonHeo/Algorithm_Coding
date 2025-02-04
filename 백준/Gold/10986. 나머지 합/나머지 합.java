import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long count = 0;
        long[] arr = new long[n+1];
        long[] res = new long[m];
        
        st = new StringTokenizer(br.readLine());
        for(int i =1; i<=n;i++){
            arr[0] = 0;
            arr[i] = (arr[i-1] + Integer.parseInt(st.nextToken())) % m;
            if(arr[i] == 0){
                count++;
            }
            res[(int)arr[i]]++;
        }
        for(int i =0; i < m;i++){
            if(res[i] > 1){
                count += (res[i] * (res[i]-1) / 2);
            }
        }
        System.out.print(count);
    }
}