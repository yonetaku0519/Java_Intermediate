package controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Human;
import model.HumanManager;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		Human human = HumanManager.getHuman(name, age);
		
		request.setAttribute("human", human);
		
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		
		rd.forward(request, response);
		
	}

}
