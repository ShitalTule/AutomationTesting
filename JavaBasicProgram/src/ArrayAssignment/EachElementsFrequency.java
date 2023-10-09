package ArrayAssignment;

public class EachElementsFrequency {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,8,3,2,2,2,5,1};
	int fre[]=new int[arr.length];
	int visited=-1;
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				fre[j]=visited;
			}
		}
		if(fre[i]!=visited) 
			fre[i]=count;
		
	}
	System.out.println("Element|Frequency");
	for(int i=0;i<fre.length;i++) {
		if(fre[i]!=visited)
			System.out.println(arr[i] +"-"+fre[i]);
	}
}
}
