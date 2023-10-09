package array;

public class Testarray1 {

	static void min(int arr[]) {
//	int arr1[]= {12,20,15,14,20,25};
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("mininum number in array :"+min);
}
	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {// 
				max = arr[i];
			}
		}
		System.out.println("Max number in array is: "+max);

}
	public static void main(String[] args) {
		int a[]= {10,15,5,17,12,30};
		Testarray1.max(a);
		Testarray1.min(a);
	}
}

