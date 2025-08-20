package SortingPractice;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	private static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low >= high) return;
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		int i = low;
		int j = mid + 1;
		while(i <= mid && j <= high) {
			if(arr[i] <= arr[j]) {
				result.add(arr[i]);
				i++;
			}else {
				result.add(arr[j]);
				j++;
			}
		}
		
		while(i <= mid) {
			result.add(arr[i]);
			i++;
		}
		
		while(j <= high) {
			result.add(arr[j]);
			j++;
		}
		
		for (int k = low; k <= high; k++) {
			arr[k] = result.get(k - low);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8, 6, 4, 2, 7, 3, 1};
		int low = 0;
		int high = arr.length - 1;
		
		mergeSort(arr, low, high);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
