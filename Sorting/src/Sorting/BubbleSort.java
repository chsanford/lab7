package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int array[]) {
    		// TODO S1 implements bubble sort
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int smaller = array[j + 1];
					int larger = array[j];
					array[j] = smaller;
					array[j + 1] = larger;
				}
			}
		}
   	 return array;
  	}
}
