public class SumEven_SumOdd {
	public static void main(String[] args) {
		int n,sumEven=0,sumOdd=0;
		for(int i =1;i<100;i++) {
			if (i%2==0)
				sumEven += i;
			else
				sumOdd += i;
		}
		System.out.println("Sum of Even numbers: "+ sumEven + "  Sum of Odd numbers: "+sumOdd);
	}
}
