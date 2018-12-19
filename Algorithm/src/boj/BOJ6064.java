package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ6064 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int M, N, x, y;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			System.out.println(checkCnt(M,N,x,y));
		}
	}

	public static int lcm(int x, int y) {

		int n;
		int X, Y;
		X = x;
		Y = y;

		while (true) {
			n = x % y;
			if (n == 0) {
				return (X * Y) / y;
			} else {
				x = y;
				y = n;
			}
		}
	}
	
	public static int checkCnt(int M, int N, int x, int y) {
		int res = 0;
		int temp,X,Y;
		int leastCM;
		if(x>y){ // 무조건 x값을 작게 해서 y값 맞추기 형식으로 진행하기.
			temp = x;
			x = y;
			y = temp;
			
			temp = M;
			M = N;
			N = temp;
		}
		
		X = x;
		Y = x;
		res = x;
		leastCM = lcm(M,N);
		
		while(res <= leastCM) {
			if(Y == y) {
				return res;
			}
			Y += M;
			res += M;
			
			while(Y>N) {
				Y -= N;
			}
		}
		
		if(res > leastCM){
			res = -1;
		}
		
		return res;
	}
}
