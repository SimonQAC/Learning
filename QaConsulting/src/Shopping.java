public class Shopping {
	String product;
	int qty;
	float price;
	public void bill() {
		float amount,vat;
		amount = qty*price;
		vat = (float) (amount * 0.2);
		System.out.println("Amount: "+amount);
		System.out.println("VAT: "+vat);
		System.out.println("Your bill: " + (amount+vat));
	}
	
}
