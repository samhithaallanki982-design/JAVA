//non-static inner class

class Outer{
	static int m=100;
	static class Inner{
		void doStuff() {
			System.out.println("m="+m);
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner innerObj=new Outer.Inner();
		innerObj.doStuff();
	}

}
