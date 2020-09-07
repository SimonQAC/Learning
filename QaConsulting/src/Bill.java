public class Bill {

	public static void main(String[] args) {
		Shopping tesco,asda;
		
		tesco =new Shopping();
		asda =new Shopping();
		
		tesco.product="coke";
		tesco.qty=70;
		tesco.price=1.50F;
		tesco.bill();
		
		asda.product="7up";
		asda.qty=10;
		asda.price=2.6F;
		asda.bill();

	}

}
