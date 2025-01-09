import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        String[] str = new String[n];
        
        for(int i = 0; i < n; i++){
            str[i] = s.substring(i,n);
        }
        
        Arrays.sort(str);
        for(String st : str){
            System.out.println(st);
        }
    }
}