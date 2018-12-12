package boj;

import java.util.Scanner;

public class BOJ1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int x,y,stage = 1;

		double toStage = 0; // dest의 루트값; toStage로 stage값을 알아낸다.
		int temp; // toStage를 절삭한 변수
		double spot = 0.0; // 범위를 알아내기 위한 변수
		double max = 0; // 최대값일 경우 오버플로우 생기므로..
		int res = 0; // 최소 거리 횟수 값
		
		int[] dest = new int[T];
		
		for(int i = 0; i<T; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			dest[i] = y-x;
		}

		scan.close();
		
		for(int i = 0; i<T ; i++) {
		
			toStage = Math.sqrt(dest[i]);
			temp = (int)toStage;
			spot = toStage - temp;
			if(spot < 0.5) {
				stage = temp;
			}else {
				stage = temp+1;
			}
			
			max = (double)stage * stage; // stage가 36341일때, 제곱이면 인트값을 넘어버림
			
			if(dest[i] <= max)
			{
				res = (stage * 2) - 1;
			}else {
				res = stage * 2;
			}
			
			System.out.println(res);
		}// outter for

	}
}

