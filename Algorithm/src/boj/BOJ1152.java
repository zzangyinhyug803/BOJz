package boj;

import java.util.Scanner;

public class BOJ1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		str = str.trim();
		String[] str1 = str.split(" ");
		System.out.println((str.isEmpty())? 0 : str1.length); // System.out.println(str1.length);
	}
}

