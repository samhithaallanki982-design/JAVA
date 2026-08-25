import java.util.Scanner;
public class Smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int small=1200,n;
		for(int i=0; i< 10; i++){
			System.out.println("Enter "+(i+1)+"st/rd/th number:");
			n= sc.nextInt();
			if (n<small) {
				small=n;
			}                                       
		}
		System.out.println("Smallest Number: "+small);
	}
}
