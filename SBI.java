public class SBI
{
	public static String accountName;
	public static char debitCardAvailable;
	public static float accoutBalance;
	public static int civilScore;
	public static String accountBranch;
	
public static void getDetails()
{
	System.out.println("account name is:"+accountName);
	System.out.println("debit card available:"+debitCardAvailable);
	System.out.println("account balnce is:"+accoutBalance);
	System.out.println("civil score:"+civilScore);
	System.out.println("account branch name is:"+accountBranch);	
}	
 public static void checkCardDetails(char de_available)
 {
	 System.out.println("value is matched:"+de_available);
	 System.out.println("value matched:"+debitCardAvailable);	 
 }
 
 public static void getCibilScore(int cibilScore)
 {
	 System.out.println("value is matched:"+cibilScore);
	 System.out.println("value is matched:"+civilScore);
	 
 }
 public static float getWithDrawAmount(float wiDraw )
 {
	 if(wiDraw<=accoutBalance){
		 System.out.println("allow to withdraw:"+wiDraw);
		 return wiDraw - accoutBalance;
	 }
	 else
	 {
		 System.out.println("maintain minimum balance:"+wiDraw);
	 }
	 return accoutBalance;
	 
 }
}
   

