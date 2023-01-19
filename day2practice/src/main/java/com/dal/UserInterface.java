package com.dal;
import com.bol.*;
import java.sql.SQLException;



public interface UserInterface {
	
	User validateUser(String userName,String pwd) throws SQLException;
	

}
