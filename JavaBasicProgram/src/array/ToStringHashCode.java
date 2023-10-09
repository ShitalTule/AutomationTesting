package array;

public class ToStringHashCode {
public static void main(String[] args) {
	ToStringHashCode a1=new ToStringHashCode();
	System.out.println(a1);//e1.toString()
	System.out.println(a1.hashCode());
	ToStringHashCode a2=new ToStringHashCode();
	System.out.println(a2);
	System.out.println(a2.hashCode());
	System.out.println("are a1 & a2 are same :"+a1.equals(a2));
	ToStringHashCode a3=a1;
	
	System.out.println("are a1 & a3 same :"+a1.equals(a3) );
}
}
