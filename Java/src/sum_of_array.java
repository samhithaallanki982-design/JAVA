import java.util.Scanner;
public class sum_of_array {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array size:");
			int s=sc.nextInt();
			int sum=0;
			int arr[]=new int[s];
			for(int i=0; i<arr.length;i++)
			{
				System.out.println("Arr["+i+"]:");
				arr[i]=sc.nextInt();
			}
			for(int c:arr)
			{
				System.out.print(c+" ");
				if(c%2==0) {
				sum+=c;
				}
			}
				
			System.out.println("\n5sum of array elements: "+sum);

		}

	}


