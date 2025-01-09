import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        List<Integer> num = new ArrayList<>();
        
        for(int i =1; i <= n; i++){
            num.add(i);    
        }
        sb.append("<");
        int index = 0;
        while(n>1){
            index = (index + (k-1)) % n;
            sb.append(num.remove(index)).append(", ");
            n--;
        }
        sb.append(num.remove(0)).append(">");
        System.out.print(sb);
    }
}