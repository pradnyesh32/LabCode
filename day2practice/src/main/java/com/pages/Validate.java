package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bol.User;
import com.dal.UserImpl;
import com.utils.DBUtils;

@WebServlet("/validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Validate() {

      
    }

	
	public void init(ServletConfig config) throws ServletException {
		Connection con=DBUtils.getCon();	
	}
	
	
	
	

	
	public void destroy() {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("--inside doPost validationServlet-----");
		response.setContentType("text/html");
		
		
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		PrintWriter pw=response.getWriter();
		if(email!=null && pass!=null) {
		try {
			UserImpl user=new UserImpl();
			User u=user.validateUser(email, pass);
			if(u!=null) {
			//pw.write("u"+u);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		}
		
		
		
	}

}
