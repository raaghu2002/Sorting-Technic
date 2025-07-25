package SortTech;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {8, 6, 4, 2, 7, 3, 1};
		int size = arr.length ;
		int temp ;
		
		System.out.println("Before Sorting");
		for(int num : arr) {
			System.out.print(num  + " ");
		}
		
		System.out.println();
		
		//Selection Sort 
		for(int i = 0 ; i < size-1 ; i++ ) {
			int MinIndex = i;
			for(int j = i+1 ; j < size ; j++) {
				
				if(arr[MinIndex] > arr[j]) {
					MinIndex = j;
				}
				
			}
			
			temp = arr[MinIndex];
			arr[MinIndex] = arr[i];
			arr[i] = temp;
			
			
		}
		
		System.out.println("After Sorting");
		for(int num : arr) {
			System.out.print(num  + " ");
		}
		
		
	}

}
