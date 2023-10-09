package ArrayAssignment;

public class LargestElements_Array {
	public static void main(String[] args) {
		int arr[] = new int[] { 11, 15, 75, 40, 60 };  //Initialize array  
		int max = arr[0];//Initialize max with first element of array.  
		for (int i = 0; i < arr.length; i++) {     //Loop through the array  
			if (arr[i] > max)//Compare elements of array with max  
				max = arr[i];
		}
		System.out.println("largest elements in array :" + max);
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("smallest Elements in array :"+min);
	}
}
