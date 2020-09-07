
public class results {
	String name;
	public void showResults(int phy, int che, int mat) {
		float total,per;
		total=phy+che+mat;
		per=(float) total*100/450;
		welcomeMessage();
		System.out.println("Results sheet of: "+name);
		System.out.println("Total marks: "+total);
		System.out.println("Percentage: "+per+"%");
	}
	
	private void welcomeMessage() {
		
		System.out.println("-------------");
		System.out.println("Welcome "+ name);
		System.out.println("-------------");
	}
}
