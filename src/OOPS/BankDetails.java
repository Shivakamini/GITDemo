package OOPS;
class Account
{
	private int accno;
	private String name;
	private float balance;
	void setAccount(int a,String n,float b)
	{
	accno=a;
	name=n;
	balance=b;
	}
	void printAccount()
	{
		System.out.println(accno);
		System.out.println(name);
		System.out.println(balance);
	}
	void deposit(float tmnt)
	{
	balance=balance+tmnt;	
	}
	void withdrawl(float  tmnt)
	{
		if(balance<tmnt)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
				balance=balance-tmnt;
		}
	}
}
public class BankDetails {
	public static void main(String[] args) {
	Account emp1=new Account();
		emp1.setAccount(101,"shiva",5000f);
		emp1.printAccount();
		emp1.deposit(1000f);
		emp1.printAccount();
		emp1.withdrawl(2000f);
		emp1.printAccount();
	}

}
