package array;

import java.util.Arrays;

public class Array3 {
public static void main(String[] args) {
	int arr[]= {1,2,3,-2,20,30,-10,45,20};
	double sum=0;
	double average=0;
	for(int arr1:arr) {
		sum=sum+arr1;
		int arraylength=arr.length;
		average=sum/arraylength;
		/*System.out.println("sum :"+sum);
		System.out.println("average :"+average);*/
		
	}
	System.out.println("sum :"+sum);
	System.out.println("average :"+average);
	
	
}
}
class Average{
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=0;
		int average=0;
		for(int array:arr) {
			sum=sum+array;
			int arraylenght=arr.length;
			average=sum/arraylenght;
		}
		System.out.println("sum :"+sum);
		System.out.println("average :"+average);
	
	}
}