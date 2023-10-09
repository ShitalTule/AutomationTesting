
public class StaticGlobalVariableExample5 {

	//static global  variables
		static int num1,num2=25,res;
		public static void main(String[] args) {
			System.out.println("Program starts");
			//we can access static global variables using classname from here as main() is also static
			System.out.println("Number1 is : "+num1);//0
			System.out.println("Number2 is : "+num2);//25
			res=num1+num2;//0+25
			System.out.println("Result is : "+res);//25
			System.out.println("**************************************");
			num1=75;
			System.out.println("updated Number1 is : "+num1);//75
			System.out.println("Number2 is : "+num2);//25
			res=num1+num2;//75+25
			System.out.println("updated Result is : "+res);//100
			System.out.println("**************************************");
			num1=85;
			num2=65;
			System.out.println("updated Number1 is : "+num1);//85
			System.out.println("updated Number2 is : "+num2);//65
			res=num1-num2;//85-65
			System.out.println("updated Result is : "+res);//20
			System.out.println("Program ends");
		}

}
