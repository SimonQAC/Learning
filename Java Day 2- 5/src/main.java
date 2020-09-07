
public class main {

	public static void main(String[] args) {

		accounts x;
		x=new accounts();
		int salary=3000;
		System.out.println(x.tax(salary));
		System.out.println(salary-x.tax(2000));
		
		
	}

}
