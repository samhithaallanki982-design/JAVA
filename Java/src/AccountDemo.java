class Account{
	int accno;
	String accountType;
	int accbal;
	
	Account(int accno,String accountType, int accbal) {
		this.accno=accno;
		this.accountType=accountType;
		this.accbal=accbal;
	}
	
	void withdraw(int amount) {
		if(accbal>amount)
		this.accbal-=amount;
		else 
			System.out.println("Insuficient Balance!!");
	}
	
	void deposit(int amount) {
		this.accbal+=amount;
	}
	
	void disAccountDetails() {
		System.out.println("Account number:"+accno+" Type:"+accountType+" Balance:"+accbal);
	}
	
}
public class AccountDemo {

	public static void main(String[] args) {
		Account a1=new Account(6309426 , "SB", 10000);
		a1.disAccountDetails();
		a1.deposit(1000);
		a1.disAccountDetails();
		a1.withdraw(1500);
		a1.disAccountDetails();
		

	}

}
