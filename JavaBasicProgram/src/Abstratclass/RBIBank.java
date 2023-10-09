package Abstratclass;

 abstract class RBIBank {
abstract double GetROIForHomeLone();
final void loan() {
	System.out.println("as per RBI Loan");
}
}
 class SBI extends RBIBank{
	 double GetROIForHomeLone() {
		 return 5.5;
	 }
 }
class PNB extends RBIBank{
	double GetROIForHomeLone() {
		return 6.5;
	}
}
class abstractclass3{
	public static void main(String[] args) {
		PNB a1=new PNB();
		System.out.println("PNB rate of interest is :"+a1.GetROIForHomeLone());
		a1.loan();
		SBI a2=new SBI();
		System.out.println("SBI rate of interest is :"+a2.GetROIForHomeLone());
		a2.loan();
		RBIBank a3=new SBI();
		System.out.println("RBI reference but SBI object rate of interest is :"+a3.GetROIForHomeLone());
		a3.loan();
		RBIBank a4=new PNB();
		System.out.println("RBI reference but PNB object rate of interest is :"+a4.GetROIForHomeLone());a4.loan();
		
	}
}