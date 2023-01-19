package jdbcpractice;

import java.util.List;

import bankDAL.BankOperation;
import bankDAL.BankOperationable;
import bankDAL.DBUtils;

public class BankTester {

	public static void main(String[] args) {
		
		DBUtils.startConnection();
		BankOperationable bo = new BankOperation();
		
		BankAccount b1 = new BankAccount(456, "Ma", 767000);
		System.out.println(bo.addAccount(b1));
		
		List<BankAccount> b = bo.getAccounts();
		
		b.forEach(c->System.out.println(c));
		

	}

}
