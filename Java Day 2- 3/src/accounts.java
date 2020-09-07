
public class accounts {
	public void salaryslip(float salary) {
		float tax,net;
		System.out.println("Your gross salary is: "+salary);
		tax=(float) (salary*0.2);
		System.out.println("Your tax is: "+tax);
		net=salary-tax;
		System.out.println("Your net salary is: "+net);
		
	}
}
