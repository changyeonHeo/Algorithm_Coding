import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        while(n-- > 0){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("1")){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }else if(command.equals("2")){
                sb.append(deque.isEmpty()? -1 : deque.pollFirst()).append("\n");
            }else if(command.equals("3")){
                sb.append(deque.size()).append("\n");
            }else if(command.equals("4")){
                sb.append(deque.isEmpty()? 1 : 0).append("\n");
            }else if(command.equals("5")){
                sb.append(deque.isEmpty()? -1 : deque.getFirst()).append("\n");
            }
        }
        System.out.println(sb);
    }
}