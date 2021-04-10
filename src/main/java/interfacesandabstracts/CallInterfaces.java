package interfacesandabstracts;

public class CallInterfaces implements MultipleInterfaces.NestedInterfaces,MultipleInterfaces{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterfaces as = new CallInterfaces();
		as.a();
		MultipleInterfaces.b();
		SecondInterfaces.b(4,5);
		
		
	}
	public void g(){
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

	

}
