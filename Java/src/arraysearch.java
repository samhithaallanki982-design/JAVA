import java.util.Scanner;
public class arraysearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int s=sc.nextInt();
		int k,f=-1;
		int arr[]=new int[s];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to searched! ");
		k=sc.nextInt();
		for(int i=0; i<arr.length;i++)
		{
			if(k==arr[i])
			{
				f=i;
				break;
			}
		}
		if(f>=0)
		{
			System.out.println(k+" founded at index "+f);
		}
		else {
			System.out.println(k+"  not founded"+f);
		}
	}
}
		
							