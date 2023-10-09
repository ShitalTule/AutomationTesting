package ArrayAssignment;

public class CopyElementsOneArrayToOtherArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30, 40 }; // Initialize array
		int arr1[] = new int[arr.length]; // Create another array arr2 with size of arr1
		// Copying all elements of one array into another
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
			arr1[i] = arr[i];
			
		}
	
		// Displaying elements of array arr1
		System.out.println("Elemens of Orignal array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Displaying elements of array arr2
		System.out.println("Elements of New array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
