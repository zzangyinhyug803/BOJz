package boj;

import java.util.Scanner;

public class BOJ2775 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int k,n;
		int sum;
		int[][] array = new int[15][14];
		int[] res = new int[T];

		for(int i = 0; i<14; i++) {
			array[0][i] = i+1;
		}
		
		for(int i = 1; i<15; i++) { 
			sum = 0;
			for(int j = 0; j<14; j++) {
				sum += array[i-1][j];
				array[i][j] = sum;
			}
		}
		
		for(int i = 0; i<T;i++) {
		
			k = scan.nextInt();
			n = scan.nextInt();
			
			res[i] = array[k][n-1];
		}
		
		scan.close();
		
		for(int i : res) {
			System.out.println(i);
		}
		
	}
}
