package boj;

import java.util.Scanner;

public class BOJ1475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int temp, max = 0, six = 0, nine = 0;
		int res = 0;
		scan.close();
		
		if(N == 0) {
			System.out.println(1);
			return;
		}

		int[] array = new int[10]; // 0,1,2,3,4,5,6,7,8,9

		while (N != 0) {
			temp = N % 10;
			N = N / 10;
			array[temp]++;
		}

		for (int i = 0; i < 10; i++) {

			if (i != 6 && i != 9) {
				if (array[i] > max) {
					max = array[i];
				}
			} else if(i == 6) {
				six = array[i];
			} else if(i == 9) {
				nine = array[i];
			}
		}
		
		if(max >= six && max >= nine) {
			res = max;
		}else {
			res = six + nine;
			
			if(res % 2 == 1) {
				res = res/2 + 1;
			}else {
				res = res/2;
			}
		}

		System.out.println(res);

	}
}
