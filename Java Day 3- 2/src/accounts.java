
public class accounts {
	public int tax() {
		return 21;
	}
	
	public void tax(int salary) {
		float t=salary*21/100;
		System.out.println("tax is: "+ t);
	}
	public void tax(int salary, int rate) {
		float t=salary*rate/100;
		System.out.println("tax is: "+ t);
	}
}
