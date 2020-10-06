package searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 1, 2, -5, 10, 10, 16, 3, 11, 4 };
		int value = 10;

		int indexRecur = recurBinarySearchUtil(array, value);
		int indexIter = iterativeBinarySearchUtil(array, value);
		System.out.println(indexRecur);
		System.out.println(indexIter);
	}

	private static int iterativeBinarySearchUtil(int[] array, int valueToBeFound) {

		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
		int low = 0;
		int high = array.length;
		int mid = (low + high) / 2;

		return iterativeBinarySearch(array, valueToBeFound, low, mid, high);
	}

	private static int iterativeBinarySearch(int[] array, int valueToBeFound, int low, int mid, int high) {

		while (low < high) {
			mid = (low + high) / 2;
			if (valueToBeFound == array[mid])
				return mid;
			else if (valueToBeFound < array[mid])
				high = mid;
			else
				low = mid + 1;
		}
		return -1;
	}

	private static int recurBinarySearchUtil(int[] array, int valueToBeFound) {

		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
		int low = 0;
		int high = array.length;
		int mid = (low + high) / 2;

		int index = binarySearch(array, valueToBeFound, low, mid, high);
		return index;
	}

	private static int binarySearch(int[] array, int valueToBeFound, int low, int mid, int high) {

		if (low < high) {
			if (valueToBeFound == array[mid])
				return mid;
			else if (valueToBeFound < array[mid])
				return binarySearch(array, valueToBeFound, low, (low + mid) / 2, mid);
			else
				return binarySearch(array, valueToBeFound, mid + 1, (mid + high) / 2, high);
		} else
			return -1;
	}
}
