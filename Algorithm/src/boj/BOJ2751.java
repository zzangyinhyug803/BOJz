package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2751 {
	public static final String LINE_SEPARATOR = System.lineSeparator();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) 
			arr[i] = Integer.parseInt(br.readLine());
		
		quickSort(arr, 0, arr.length-1);
		
		for(int i : arr)
			bw.write(i+LINE_SEPARATOR);
		
		
		br.close();
		bw.close();
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		int i = low; // low의 포인터 i
		int j = high; // high의 포인터 j
		int pivot = arr[(low+high)/2]; // pivot을 가운대 인덱스 값으로 가짐.
		int temp; // swap 용
		
		while(i <= j) {
			while(arr[i] < pivot) // 값이 작은 구간에선 작아야지.
				i++;
			while(arr[j] > pivot) // 값이 큰 구간에선 커야지.
				j--;
			
			if(i<=j) { // 정상적이라면 바꿔주자. 정상적 : pivot이 아닌 다른 값들 끼리 바꿔야 한다면
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++; // 바꿔줬으면 포인터를 옮기자
				j--;
			}
		}
		
		if(low<j) // low == j가 아니라면. 그니깐 원소가 2개 이상이라면
			quickSort(arr, low, j);
		if(high > i) // 마찬가지, 원소가 2개 이상이라면
			quickSort(arr,i,high);
	}
}
