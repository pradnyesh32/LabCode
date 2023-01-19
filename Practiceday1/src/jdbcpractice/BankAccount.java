package jdbcpractice;

public class BankAccount {
	
	private int accountno;
	
	private String name;
	 
	private double balance;

	public BankAccount(int accountno, String name, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountno=" + accountno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	

}
