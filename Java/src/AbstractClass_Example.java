abstract class Shape{
	
	abstract double area();
	
}
class rectangle extends Shape{
	double l,b; 
	rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	double area() {
		return l*b;
	}
}
class circle extends Shape{
	double radius; 
	circle(double radius){
		this.radius=radius;
	}
	double area() {
		return Math.PI*radius*radius;
	}
}
public class AbstractClass_Example {
	public static void main(String[] args) {
		rectangle r=new rectangle(12,5);
		System.out.println("Rectangle Area: "+r.area());
		circle c=new circle(12.50);
		System.out.println("Circle Area: "+c.area());
		
	}
}
