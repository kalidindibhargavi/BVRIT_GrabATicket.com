package com.bvrit.GrabyourTicket.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.corba.se.pept.transport.Connection;

public class UserDAO {
    static Connection con;
    ConnectionDAO cdao;
    static PreparedStatement pst;
    
    public UserDAO() 
        throws SQLException, ClassNotFoundException {
    	cdao = new ConnectionDAO();
    	con = (Connection) cdao.getConnection();
    }
    
    public boolean signup(String user, String password, String email) 
        throws SQLException, ClassNotFoundException {
    	boolean result = false;
    	pst = ((java.sql.Connection) con).prepareStatement("INSERT INTO user VALUES(?, ?, ?);");
    	pst.setString(1, user);
    	pst.setString(2, password);
    	pst.setString(3, email);
        int ans = pst.executeUpdate();
        if(ans > 0)
        	result = true;
        return result;
    }
    
    public static boolean login(String user, String password)
        throws SQLException, ClassNotFoundException {
    	boolean result = false;
    	pst = ((java.sql.Connection) con).prepareStatement("SELECT * FROM user WHERE username=?;");
    	pst.setString(1, user);
    	ResultSet rs = pst.executeQuery();
    	if(rs.next()) {
    		if(rs.getString("password").equals(password)) 
    			return true;
    	}
        return result;
    }

	public static boolean signup(String user, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}

