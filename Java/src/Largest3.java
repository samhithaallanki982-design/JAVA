import java.util.Scanner;
public class Largest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a , b , c values: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		System.out.println((a>b && a>c)? a:(b>c)?b:c);
	}
	

}
