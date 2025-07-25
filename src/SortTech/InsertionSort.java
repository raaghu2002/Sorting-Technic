package SortTech;

public class InsertionSort {
	
	
	public static void main(String[] args) {
		
		int[] arr = {8, 6, 4, 2, 7, 3, 1};
		int size = arr.length ;
		
		System.out.println("Before Sorting");
		for(int num : arr) {
			System.out.print(num  + " ");
		}
		
		System.out.println();
		
		// Insertion Sort
		for(int i = 1 ; i < size ; i++) {
			
			int j = i - 1 ;
			int key = arr[i];
			
			while(j >= 0 && arr[j] > key ) {
				arr[j+1] = arr[j];
				j--;
				
			}
			
			arr[j+1] = key;
			
		}
		
		System.out.println("After Sorting");
		for(int num : arr) {
			System.out.print(num  + " ");
		}
		
	}

}
