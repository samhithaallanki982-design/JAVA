import java.util.Scanner;
public class SecondFirst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		int big=Integer.MIN_VALUE;
		int secondbig=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int secondsmall=Integer.MAX_VALUE;
		for(int i=0;i<s;i++) {
			System.out.println("Arr[" +i+"]: ");
			arr[i]=sc.nextInt();
		}
		if(s>2) {
			for(int n:arr) {
				System.out.println(n);
				if(n>big) {
					secondbig=big;
					big=n;
				}
				else if(n>secondbig && secondbig != big){
						secondbig=n;
				}
				
				if(n<small) {
					secondsmall=small;
					small=n;
				}
				else if(n<secondsmall && secondsmall != small){
						secondsmall=n;
				}
			}
			System.out.println("Big: "+big+" Second big: "+secondbig); 
			System.out.println("Small: "+small+" Second small: "+secondsmall);
		}
		else {
			System.out.println("2 element array not possible");
		}	
	}

}
