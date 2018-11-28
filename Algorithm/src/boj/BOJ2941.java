package boj;

import java.util.Scanner;

public class BOJ2941 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt;
		String str = " " + scan.nextLine() + " ";
		scan.close();

		cnt = str.length()-2;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == '=' || str.charAt(i) == '-') {
				cnt--;
			}

			if (str.charAt(i) == 'd') {
				if (str.charAt(i + 1) == 'z' && str.charAt(i+2) == '=') {
					cnt--;
				}
			} else if (str.charAt(i) == 'j') {
				if (str.charAt(i - 1) == 'n' || str.charAt(i - 1) == 'l') {
					cnt--;
				}
			}
		}
		System.out.println(cnt);
	}
}
