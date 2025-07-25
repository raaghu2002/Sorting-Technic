package SortingPractice;

public class SelectionSort {
	
	static void Sort(int[] arr) {
		for(int i=0 ; i <= arr.length - 1 ; i++) {
			int minIndex = i;
			for(int j = i+1 ; j <= arr.length - 1 ; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {6,5,2,3,4,1};
		SelectionSort.Sort(arr);
		
	}

}
