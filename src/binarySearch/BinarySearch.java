package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(binarySearch(array, 0));

	}

	public static int binarySearch(int[] array, int item) {

		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int guess = array[mid];
			if (guess == item)
				return mid;
			else if (guess < item)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

}
