
public class ConstructorOverloading {

	public ConstructorOverloading () {
		this(20);
		System.out.println("A");
	}
	public ConstructorOverloading (int x) {
		this (1,2);
		System.out.println("B");
	}
	public ConstructorOverloading (int x, int b) {
		System.out.println("C");
	}
	
}
