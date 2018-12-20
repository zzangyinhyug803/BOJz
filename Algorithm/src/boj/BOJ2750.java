package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2750 {
	public static final String LINE_SEPARATOR = System.lineSeparator();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		quickSort(arr, 0, arr.length-1 );
		
		for(int i : arr) {
			bw.write(i + LINE_SEPARATOR);
		}
		
		br.close();
		bw.close();
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int pivot = arr[(low + high) / 2];
		int temp;
		
		while(i<=j) {
			
			while(arr[i] < pivot) 
				i++;
			
			while(arr[j] > pivot)
				j--;
			
			if(i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low < j)  // low~j까지 정렬할 것이 남았다면,
			quickSort(arr,low,j);
		
		if(high > i)
			quickSort(arr,i,high);
	}

}
