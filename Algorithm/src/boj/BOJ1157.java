package boj;

import java.util.Scanner;

public class BOJ1157 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] alpha = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int ch, max = 0, cnt = 0;
		char c = '.';
		String str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 97) { // 소문자면
				ch = ch - 97;
			} else { // 대문자면
				ch -= 65;
			}
			alpha[ch]++;
		}

		for (int a : alpha) {
			if (max < a)
				max = a;
		}

		for (int i = 0; i<alpha.length; i++) {

			if (max == alpha[i]) {
				cnt++;
				c = (char) (i + 65);
			}
		}

		System.out.println((cnt == 1) ? c : '?');

		scan.close();
	}

}
