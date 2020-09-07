
public class results {

	private int phy,che;
	
	public void physics(int a) {
		if(a>=100 && a<=150) {
			phy=a;
		}
		else {
			System.out.println(a+ " is invalid Physics Mark");
		}
	}
	public void chemistry(int a) {
		if(a>=100 && a<=150) {
			che=a;
		}
		else {
			System.out.println(a+ " is invalid Chemistry Mark");
		}
	}
	public void showresult() {
		float total,per;
		total=phy+che;
		per=total/300*100;
		System.out.println("Total marks: "+total);
		System.out.println("Percentage is: "+per +"%");
	}
}
