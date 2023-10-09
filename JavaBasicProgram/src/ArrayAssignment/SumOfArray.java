package ArrayAssignment;

public class SumOfArray {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,5,67,8,9};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		 sum=sum+arr[i];
	}
	System.out.println("sum of array elements is :"+sum);
}
}
