
public class factorial_table {
	public static void main(String[] args) {
		long f=1;
		System.out.println("------------------------");
		System.out.println("Number         factorial");
		System.out.println("------------------------");
		for(int i=1;i<=5;i++){
		f=1;
		for(int j=1;j<=i;j++){
			f=f*j;
		}
		System.out.println(i+"           "+f);
	}
	System.out.println("-------------------------");
 }
}
