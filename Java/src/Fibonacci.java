import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.println("Fibonacci Series: ");
		for(int i=1;i<=n;i++) {
			System.out.println(a+" ");
			int c= a+b;
			a = b ;
			b = c ;
		}
	}

}
