package boj;

import java.util.Scanner;

public class BOJ10250 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		@SuppressWarnings("unused")
		int H, W, N;
		int YY, xx; // XX는 호수 yy는 층수
		double temp = 0;
		;
		String XX;
		String[] res = new String[T];

		for (int i = 0; i < T; i++) {
			H = scan.nextInt(); // 5
			W = scan.nextInt(); // 5
			N = scan.nextInt(); // 5

			if (H != 1) {
				xx = (int) ((double) N / H);
				temp = ((double) N / H) - xx;
				if (temp != 0) {
					xx++;
				}
				
				YY = N - ((xx - 1) * H);
			} else {
				YY = H;
				xx = N;
			}

			if (xx < 10) {
				XX = "0" + xx;
			} else {
				XX = "" + xx;
			}

			res[i] = YY + XX;

		}

		scan.close();

		for (String str : res) {
			System.out.println(str);
		}
	}
}
