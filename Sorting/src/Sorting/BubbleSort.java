package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < unsortedArray.length -1; i++) {
				if (unsortedArray[i] > unsortedArray[i + 1]) {
					int temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i + 1];
					unsortedArray[i + 1] = temp;
					swapped = true;
				}
			}
		}
		return unsortedArray;
	}
}
