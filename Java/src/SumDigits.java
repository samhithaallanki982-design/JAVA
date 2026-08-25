import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int r,n,sum=0;
		n=sc.nextInt();
		while(n > 0) {
			r=n%10;
			sum = sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits: "+sum);
	}

}
Ṇ