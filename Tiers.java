public class Tiers{
	public static void main(String args[])
	{
		String tiersName[]={"MRF","CEAT","JET"};
		for(int index=0; index<=tiersName.length-1; index++){
		System.out.println("tiers Name:"+tiersName[index]);
		}
	    int tiersValue[]={10,9,7};
		for(int index=0; index<=tiersValue.length-1; index++){
		System.out.println("tiers value is:"+tiersValue[index]);
		}
	    double tiersRating[]={9.8,7.6,8.4};
		for(int index=0; index<=tiersRating.length-1; index++){
		System.out.println("tiers rating is:"+tiersRating[index]);
		}
	    String tierqsName[]={"MRF","CEAT","JET"};
		for(int index=tierqsName.length-1; index>=0; index--){
		System.out.println("tierqs Name:"+tierqsName[index]);
		}
	}
	
	
	
}