package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] arr) {
		int i, j, newValue;
    for (i = 1; i < arr.length; i++) {
      newValue = arr[i];
      j = i;
      while (j > 0 && arr[j - 1] > newValue) {
        arr[j] = arr[j - 1];
        j--;
      }
      
      arr[j] = newValue;
    }
		
		return arr;
	}
}
