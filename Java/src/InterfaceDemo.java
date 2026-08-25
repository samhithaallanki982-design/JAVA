interface Shape1{
	double area();
}
class rectangle1 implements Shape1{
	double l,b; 
	rectangle1(double l,double b){
		this.l=l;
		this.b=b;
	}
	public double area() {
		return l*b;
	}
}
class circle1 implements Shape1{
	double radius; 
	circle1(double radius){
		this.radius=radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Shape1 s;
		s=new rectangle1(12,5);
		System.out.println("Rectangle Area: "+s.area());
		s=new circle1(12.50);
		System.out.println("Circle Area: "+s.area());
		
	}
}
