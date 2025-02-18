import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int answer=0;
		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		char[] dna = br.readLine().toCharArray();
		
		st = new StringTokenizer(br.readLine());
		int[] check = new int[4];
		for (int i = 0; i < 4; i++) {
			check[i] = Integer.parseInt(st.nextToken());
		}

		int[] countAlph = new int[4];
		for (int j = 0; j < P; j++) {
			switch (dna[j]) {
			case 'A': countAlph[0]++; break;
			case 'C': countAlph[1]++; break;
			case 'G': countAlph[2]++; break;
			case 'T': countAlph[3]++; break;
			}
		}

		for (int i = 0; i <= N-P; i++) {
			boolean flag = false;
			for(int j=0; j<4; j++) {
				if(countAlph[j] < check[j]) {
					flag = true;
					break;
				}
			}
			if (!flag)
				answer++;
			if(i==N-P) break;
			
			countAlph[position(dna[i])]--;
			countAlph[position(dna[i+P])]++;
		}
		
		System.out.println(answer);

	}
	
	private static int position(char alph) {
		switch(alph) {
		case 'A' : return 0;
		case 'C' : return 1;
		case 'G' : return 2;
		case 'T' : return 3;
		}
		return -1;
	}

}