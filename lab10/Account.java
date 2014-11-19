public class Account {
	private Customer accountName;
	private double accountBalance = 0;
	
	public Account() {}
	
	public Customer getCustomer() {
		return this.accountName;
	}
	
	public String getAccountName() {
		return this.accountName.getName();
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public void deposit(double cash) {
		this.accountBalance += cash;
	}
	
	public void withdraw(double cash) {
		if (this.accountBalance - cash < 0) {
			System.out.println(
					"You do not have enough money to"
					+ "withdraw that amount.");
		} else {
			this.accountBalance -= cash;
		}
	}
}
