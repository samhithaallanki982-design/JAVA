import java.util.Scanner;
public class array_demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		for(int c:arr)
		{
			System.out.print(c+" ");
		}
			

	}

}
