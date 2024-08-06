public class Shopping 
{
    public double calculateGST(double amount)
	{
        double gstRate = 0.18;
        double gst = amount * gstRate;
        
        if (amount <= 9000) 
		{
            double discount = amount * 0.10;
            gst -= discount;
        }
		else 
		{
            double discount = amount * 0.05;
            gst = discount;
        }
        
        return gst;
    }
}

