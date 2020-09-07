

public class exams {
	
	private int subjectmaxmarks;
	private float passper;
	float total,per;
	private int phy,che;
	
	public exams() {
		subjectmaxmarks=75;
		passper=50;
	}
	public exams(int marks, float per) {
		subjectmaxmarks=marks;
		passper=per;
	}
	public void setPhy(int a) {
		if (a>=0 & a<=subjectmaxmarks) {
			phy=a;
		} else {
			System.out.println("invalid physics marks");
		}
	}
	public void setChe(int a) {
		if (a>=0 & a<=subjectmaxmarks) {
			che=a;
		}
	}
	
	private void doCalculations() {
		total=phy+che;
		per=total*100/(subjectmaxmarks*2);
	}
	public void showResults() {
		doCalculations();
		System.out.println("total marks: "+total);
		System.out.println("percentage: "+per);
		if (per >=passper) {
			System.out.println("passed");}
			else { System.out.println("failed innit");}
	}
	
	
	
}
