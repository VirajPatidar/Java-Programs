import java.util.Scanner;
class Account {
	
	private int accountno;
	private double balance;

	public void setAccountno(int ac){
		accountno = ac;
	}
	public int getAccountno(){
		return accountno;
    }
    
	public void setBalance(double bal)
	{
		balance=bal;
	}
	public double getBalance(){
		return balance;
	}

}

class UseAccount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of accounts: ");
		int numberOfAccount = sc.nextInt();

		Account a[] = new Account[numberOfAccount]; //array of references

		for (int i = 0 ; i < numberOfAccount ; i++) {
			a[i] = new Account();//objects
		}
		
		for(int i=0;i< numberOfAccount; i++)
		{
		System.out.println("Enter account number");
		int an=sc.nextInt();
		System.out.println("Enter balance ");
		double bal= sc.nextDouble();

		a[i].setAccountno(an);
		a[i].setBalance(bal);

		}

		for(int i=0;i<numberOfAccount;i++)
		{
			int x = a[i].getAccountno();
			double y = a[i].getBalance();

		System.out.println(x);
		System.out.println(y);	

		sc.close();

		}       
	}
}