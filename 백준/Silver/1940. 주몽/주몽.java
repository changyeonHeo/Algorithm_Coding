import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(a);
        int i =0;
        int j = n-1;
        int count = 0;
        
        while(i < j){
            if(a[i] + a[j] < m){
                i++;
            }else if(a[i] + a[j] > m){
                j--;
            }else{
                count++;
                i++;
                j--;
            }
        }
        System.out.print(count);
    }
}