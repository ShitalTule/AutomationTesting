package array;

public class Testarray {
public static void main(String[] args) {
	int a[];
	int a1[]=new int[5];
	System.out.println(a1[0]);
	System.out.println(a1[1]);
	System.out.println(a1[2]);
	System.out.println(a1[3]);
	System.out.println(a1[4]);
	a1[0]=10;
	a1[1]=20;
	a1[2]=30;
	a1[3]=40;
	a1[4]=50;
	System.out.println(a1[0]);
	System.out.println(a1[1]);
	System.out.println(a1[2]);
	System.out.println(a1[3]);
	System.out.println(a1[4]);
	System.out.println("array element count :"+a1.length);
	for(int i=0;i<a1.length;i++){
		System.out.println(a1[i] );
		a1.clone();

	}
}
}
