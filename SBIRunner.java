public class SBIRunner
{
	public static void main(String args[])
	{
		SBI.accountName="savings account";
		SBI.debitCardAvailable= 'y';
		SBI.accoutBalance= 5000f;
		SBI.civilScore=750;
		SBI.accountBranch="bannur";
		
		
		SBI.getDetails();
	    SBI.checkCardDetails('y');
	    SBI.getCibilScore(750);
		float wiDraw=SBI.getWithDrawAmount(2000);
		System.out.println("amount is:"+wiDraw);
	}
	
	
	
}