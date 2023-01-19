package bankDAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcpractice.BankAccount;

public class BankOperation implements BankOperationable {
	
	private Statement stmt;
	private ResultSet res;
	private PreparedStatement pstmt;
	private Connection con;
	
	public BankOperation() {
		con=DBUtils.getCon();
	}

	@Override
	public List<BankAccount> getAccounts() {
		
		List<BankAccount> ba = new ArrayList<BankAccount>();
		try {
			stmt=con.createStatement();
			res=stmt.executeQuery("select * from bankaccounts");
			
			
			while(res.next()) {
				ba.add(new BankAccount(res.getInt(1),res.getString(2),res.getDouble(3)));
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		return ba;
	}

	@Override
	public int addAccount(BankAccount ba) {
		int a=0;
		try {
			pstmt = con.prepareStatement("insert into bankaccounts values (?,?,?)");
			pstmt.setInt(1, ba.getAccountno());
			pstmt.setString(2, ba.getName());
			pstmt.setDouble(3, ba.getBalance());
			a = pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return a;
	}

}
