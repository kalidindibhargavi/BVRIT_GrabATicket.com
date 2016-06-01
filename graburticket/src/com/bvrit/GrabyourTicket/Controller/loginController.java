package com.bvrit.GrabyourTicket.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvrit.GrabyourTicket.dao.UserDAO;



public class loginController extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doProcess(HttpServletRequest request, HttpServletResponse response) {  

        PrintWriter out;
		try {
			response.setContentType("text/html");  
			out = response.getWriter();  
			
			String name=request.getParameter("user");  
			String pwd=request.getParameter("password"); 
			
			HttpSession session = request.getSession(false);
			if(session!=null)
			session.setAttribute("user", name);
			
			UserDAO udao = new UserDAO();

			if(UserDAO.login(name, pwd)){  
				//response.sendRedirect("DisplayContacts");
			    RequestDispatcher rd=request.getRequestDispatcher("contactView.jsp");  
			    rd.forward(request,response);  
			}  
			else{  
			    out.print("<p style=\"color:red\">Sorry username or password error</p>");  
			    RequestDispatcher rd=request.getRequestDispatcher("loginView.jsp");  
			    rd.include(request,response);  
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

        
		}catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

        
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

        
		} 
 
 
 
    }  
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
    	doProcess(request, response);
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
    	doProcess(request, response);
    }
}