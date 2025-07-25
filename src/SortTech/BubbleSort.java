package SortTech;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 2, 7, 3, 1};
        int temp;

        System.out.println("Before Sorting:");
        for (int nums = 0 ; nums < arr.length ; nums++) {
            System.out.print(arr[nums] + " ");
        }
        System.out.println();

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting:");
        for (int num = 0 ; num < arr.length ; num++) {
            System.out.print(arr[num] + " ");
        }
    }
}
