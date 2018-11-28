package boj;

import java.util.Scanner;

public class BOJ2438 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		for(int i=0;i<num;i++) {
			for(int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
