import java.util.Scanner;
public class SumZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,n;
		for(;;)
		{
			System.out.println("Enter a number: ");
			n=sc.nextInt();
			if(n==0) break;
			sum += n;
		}
		System.out.println("Sum: "+sum); 
	}

}
 