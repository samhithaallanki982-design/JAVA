import java.util.Scanner;
public class TotalBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option,itemnum,qty;
		String itemname;
		double rate,price;
		do {
			System.out.println("Enter Item number: ");
			itemnum=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Item name: ");
			itemname=sc.nextLine();
			System.out.println("Enter  Rate: ");
			rate=sc.nextDouble();
			System.out.println("Enter Quantity: ");
			qty=sc.nextInt();
			price=rate*qty;
			System.out.println("Item number:" + itemnum + " Name:" + itemname +" Rate:"+rate+" Quntity:" + qty);
			System.out.println(price);
			System.out.println("Enter Option: ");
			option = sc.nextInt();
			}while(option != -1);
		System.out.println("Thankyou");
	}
}