package ArrayAssignment;

public class EvenPosition {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 12, 3, 11, 15, 16 };
		System.out.println("Present Even Position");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("present odd Position");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
