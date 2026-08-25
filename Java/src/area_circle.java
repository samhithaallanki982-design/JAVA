import java.util.Scanner;
public class area_circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		double r= sc.nextDouble();
		double area=Math.PI*r*r;
		System.out.println("Area of circle: " +area);
		sc.close();

	}

}
