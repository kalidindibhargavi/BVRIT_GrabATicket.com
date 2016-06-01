package com.bvrit.GrabyourTicket.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvrit.GrabyourTicket.dao.UserDAO;



public class signupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doProcess(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
		
			
				
					
						try {
							response.setContentType("text/html");  
								PrintWriter out = response.getWriter();
							String user = request.getParameter("user");
							String password = request.getParameter("password");
							UserDAO udao = new UserDAO();		
							//redirect control to next page based on decision
							HttpSession session = request.getSession(false);
							if(session!=null) {
								session.setAttribute(user,password);
								/*session.setAttribute();*/
							}
							if(UserDAO.signup(user,password)) {
								response.sendRedirect("loginView.jsp");
							} else {
								out.print("<p style=\"color:red\">Username already exists</p>");  
							    RequestDispatcher rd=request.getRequestDispatcher("signupView.jsp");  
							    rd.include(request,response); 
							}
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ServletException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
			
		} 