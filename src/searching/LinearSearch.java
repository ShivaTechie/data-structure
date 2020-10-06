package searching;

public class LinearSearch<T> {

	public static void main(String[] args) {

		int[] array = { 1, 2, -5, 9, 10, 7, 3, 11, 6, 5, 4 };
		int value = 10;
		findInteger(array, value);

	}

	public static void findInteger(int[] array, int value) {

		int index = 0;
		boolean isFound = false;
		for (index = 0; index < array.length; index++) {

			if (array[index] == value) {
				isFound = true;
				break;
			}
		}
		if (isFound)
			System.out.println("Element is found at index: " + index);
		else
			System.out.println("Not found");
	}
}
