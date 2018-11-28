package boj;

import java.util.Scanner;

public class BOJ2292 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int a = 1; // 정답 매핑의 최대값
		int answer = 0;
		scan.close();

		for (int i = 1; i < 100000; i++) {
			a = a + 6 * (i - 1);
			
			if(N <= a) {
				answer = i;
				break;
			}

		}
		System.out.println(answer);
	}
}
