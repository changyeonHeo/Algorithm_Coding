import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[n+1][n+1];
        int[][] ans = new int[n+1][n+1];
        
        for(int i =1; i <=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <=n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =1; i <=n; i++){
            for(int j =1; j <=n; j++){
                ans[i][j] = ans[i-1][j] + ans[i][j-1] - ans[i-1][j-1] + arr[i][j];
            }
        }
        for(int i =0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int answer = ans[x2][y2] - ans[x2][y1-1] - ans[x1-1][y2] + ans[x1-1][y1-1];
            sb.append(answer + "\n");
        }
        System.out.print(sb);
    }
}