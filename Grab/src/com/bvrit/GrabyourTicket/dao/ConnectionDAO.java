package com.bvrit.GrabyourTicket.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionDAO {
	Connection con;
	public Connection getConnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://192.168.1.89/grabaticket_db","bvrith14","bvrith");
		return con;
	}
	//test getConnection()
	public static void main(String args[])
	throws Exception{
		ConnectionDAO dao = new ConnectionDAO();
		System.out.println(dao.getConnection());
	}

}