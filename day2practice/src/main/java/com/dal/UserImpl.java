package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bol.User;
import com.utils.DBUtils;

public class UserImpl {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rest;
	public UserImpl() throws SQLException {
		
		con=DBUtils.getCon();
		pstmt=con.prepareStatement("select * from user where email=? and password=?");
	}
	
	
	public  User validateUser(String userName,String pwd) throws SQLException{
	
			pstmt.setString(1,userName);
			pstmt.setString(2, pwd);
		
			rest=pstmt.executeQuery();
			
			 User user=null;
				while(rest.next())
				{
					user=new User(rest.getInt("id"),
							      rest.getString("name"),  
							      rest.getString("email"),
							      rest.getString("city"),
							      rest.getString("password"));
				}		
				return user;
	}

}
