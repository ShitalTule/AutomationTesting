package ArrayAssignment;

public class RotateLeft {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 }; // Initialize array
		int n = 2;// n determine the number of times an array should be rotated
		System.out.println("Orignal Array");
		// Displays original array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Rotate the given array by n times toward left
		for (int i = 0; i < n; i++) {
			int j, first;
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				// Shift element of array by one
				arr[j] = arr[j + 1];

			}

			arr[j] = first; // First element of array will be added to the end
		}
		System.out.println();
		// Displays resulting array after rotation
		System.out.println("Array After left rotation  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
