/*
 * 1. Code Reuse
 * 2. Polymorphism
 */
class Account
{
	int accountNo;
	double balance;
	void deposit(){
		System.out.println("Account Class Deposit...");
	}
	void withDraw(){
		System.out.println("Account Class WithDraw...");
	}
}
class SavingAccount extends Account{
	void deposit(){
		super.deposit();
		System.out.println("Show PAN CARD IF AMOUNT IS > 50000");
	}
	void roiRec(){
		System.out.println("Get ROI 4%");
	}
}
/**
 * This class is Used to maintain Current Account
 * @author ram
 * @since 2016
 * @version 1.0
 */
 class CurrentAccount1 extends Account{
	/**
	 * this method is used to compute ROI 
	 * 
	 * 
	 */
	public void payROI(){
		System.out.println("Pay ROI 5%");
	}
	public void odLimit(){
		System.out.println("1 Lakh OD Limit...");
	}
}
public class ClassRelationShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		SavingAccount sa = new SavingAccount();
		sa.deposit();
//		CurrentAccount1 ca  = new CurrentAccount1();
//		ca.deposit();
//		ca.withDraw();
//		ca.payROI();
//		ca.odLimit();
		
	}

}
