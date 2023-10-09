package ArrayAssignment;

public class CopyArray {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	System.out.println(arr.length);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] +" ");
	}
	System.out.println();
	int clonearr[]=arr.clone();
	for(int i:clonearr) {
		System.out.print(i +" ");
	}
}
}
