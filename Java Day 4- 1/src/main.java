
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exams school=new exams();
		school.setPhy(50);
		school.setChe(60);
		school.showResults();
		
		exams college = new exams(100,60);
		college.setPhy(59);
		college.setChe(59);
		college.showResults();
		
		exams university = new exams (150,70);
		university.setPhy(100);
		university.setChe(100);
		university.showResults();
		
		ConstructorOverloading x=new ConstructorOverloading();
	}

}
