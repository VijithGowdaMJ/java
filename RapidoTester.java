public class RapidoTester
{
	public static void main(String args[])
	{
		String results=Rapido1.userName();
		long resul=Rapido1.contactNumber();
		int resu=Rapido1.userAge();
		float relt=Rapido1.rapidoRating();
		byte rult=Rapido1.usedPerson();
		boolean sult=Rapido1.applicationRunning();
		char a=Rapido1.gender();
		double b=Rapido1.applicationUseTime();
		short c=Rapido1.numberOfCoverigArea();
		
		System.out.println("user name is:"+results);
		System.out.println("contact number is:"+resul);
		System.out.println("user Age:"+resu);
		System.out.println("rapido rating is:"+relt);
		System.out.println("rapido used oerson is:"+rult);
		System.out.println("application is running:"+sult);
	    System.out.println("user gender is:"+a);
	    System.out.println("application use time is:"+b);
	    System.out.println("number of covering area is:"+c);
	}
}