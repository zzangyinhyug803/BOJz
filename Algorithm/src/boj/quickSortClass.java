package boj;

public class quickSortClass {
	public static void main(String[] args) {
		int[] arr = {11,4,8,5,9,21,7,15,1,13};
		
		quickSort(arr, 0, arr.length - 1);

		for (int i : arr) 
			System.out.print(i+ " ");
		
	}

	public static void quickSort(int[] arr, int low, int high) {

		int middle = (high + low) / 2;
		int pivot = arr[middle];

		int i = low, j = high; // i : low의 포인터, j : high의 포인터
		int temp;

		while (i <= j) {
			System.out.print("(low,high,i,j,middle : "+ low + "," + high + "," + i + ","+ j + "," + middle + ") ");
			
			while (arr[i] < pivot) { // pivot보다 작은 구간에서 그 값이 작으면 넘기기
				i++;
			}
			while (arr[j] > pivot) { // pivot보다 큰 구간에서 그 값이 크면 넘기기
				j--;
			}
			
			// 만일 조건에 맞지 않은 i,j가 나오면 while문에서 벗어나 i,j값으로 뭔갈 하겠지.

			if (i <= j) { // while문에서 나온 i와 j값이, 올바르게 되어있다면?
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp; // swap
				i++; 
				j--; // i(low의 포인터)는 오른쪽으로, j(high의 포인터)는 왼쪽으로 진행
			}
			
			for(int k : arr) 
				System.out.print(k + " ");
			System.out.println();
			
		} // 이 while문에서 벗어났다는 얘기는, i>j라는 뜻이며 low 포인터가 high 포인터보다 더 high쪽에 있다는 이야기.
		
		if (low < j) // low~j까지 구간에서 원소가 2개 이상이면,
			quickSort(arr, low, j);
		
		if (high > i) // i~high까지 구간에서 원소가 2개 이상이면,
			quickSort(arr, i, high);

	}
}
