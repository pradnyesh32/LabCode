package bankDAL;

import java.util.List;

import jdbcpractice.BankAccount;

public interface BankOperationable {
	
	List<BankAccount> getAccounts();
	
	int addAccount(BankAccount ba);
	
	

}
