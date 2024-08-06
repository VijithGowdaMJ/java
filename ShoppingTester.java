public class ShoppingTester
 {
    public static void main(String[] args)
	{
        Shopping shopping = new Shopping();
        double amount = 9000;
        double gst = shopping.calculateGST(amount);
        System.out.println("GST is :" + gst);
    }
}
