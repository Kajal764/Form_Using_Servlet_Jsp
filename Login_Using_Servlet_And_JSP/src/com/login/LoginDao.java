package com.login;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;

public class LoginDao {
	
		String url="jdbc:mysql://localhost:3306/servlet";
		String username="root";
		String password="root";
		String sql= "select * from login where uname=? and pass=?";

	public boolean check(String uname, String pass) {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);	
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs= st.executeQuery();
			if(rs.next())
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
	}

}
