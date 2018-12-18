
public class SavingAccount {

		private String name;
		private int accountNumber;
		private static int nextAccountNumber=0;
		private double accountBalance =0;
		
//contructor		
		public SavingAccount(String name)				//if user wants to open an account with zero balance
		{
			nextAccountNumber++;
			this.accountNumber = nextAccountNumber;
			this.name = name;
		}
	
//constructor 		
		public SavingAccount(String name,double initialAccountBalance)		//if account is created with some minimum balance
		{
			nextAccountNumber++;
			this.accountNumber = nextAccountNumber;
			this.name = name;
			this.accountBalance = initialAccountBalance;
		}
		
//getters		
		public String getName() {				//to get account holder name
			return name;
		}

		public int getAccountNumber() {			//to get accountNumber
			return accountNumber;
		}

		public double getAccountBalance() {		//to get accountBalance
			return accountBalance;
		}

		
//withdraw method		
		public boolean withDraw(double amount)				//method to withdraw amount
		{
			if(this.accountBalance >= amount)
			{
				this.accountBalance = this.accountBalance - amount;
				System.out.println("Amount withdrawn successfully. Remaining account balance: "+this.accountBalance);
				return true;
			}
			else
			{
				System.out.println("Insufficient Balance. Your account balance: "+this.accountBalance);
				return false;
			}
		}
		
//deposit method		
		public boolean deposit(double amount)			//to deposit amount
		{
			if(amount>0)
			{
			this.accountBalance = this.accountBalance+ amount;
			System.out.println("amount deposited successfully. Current balance:"+this.accountBalance);
			return true;
			}
			else
			{
				System.out.println("please enter a valid amount");
				return false;
			}
		}
	
		
//method to get next account number available		
		public int getNextAccountNumber()
		{
			return nextAccountNumber+1; 
		}
		
}
