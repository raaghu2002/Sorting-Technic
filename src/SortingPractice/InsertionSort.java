package SortingPractice;

public class InsertionSort {
	
	static void Sort(int[] arr) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			
			int j = i - 1 ;
			int key = arr[i];
			
			while(j >= 0 && arr[j] > key ) {
				arr[j+1] = arr[j];
				j--;
				
			}
			
			arr[j+1] = key;
			
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,6,3,2,1,4};	
		InsertionSort.Sort(arr);
	}

}
