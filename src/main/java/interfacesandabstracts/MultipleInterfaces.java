package interfacesandabstracts;

public interface MultipleInterfaces extends LearnInterface, SecondInterfaces {
	default void a() {
		System.out.println("6736587");
		//return 25;
	}
	static void b() {
		System.out.println("ryeuyt37");
	}
	interface NestedInterfaces{
		public void f();
	}
}
