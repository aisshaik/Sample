
public class StaticverloadRid {

	public static void main(String[] args) {
		main(10,20);
		System.out.print("In main");
		StaticOverride.main(args);
		
	}

	public static void main(int a, int b) {
		StaticverloadRid as=new StaticOverride();
		System.out.println("In OverLoadmain");
		as.main(null);

	}

}
