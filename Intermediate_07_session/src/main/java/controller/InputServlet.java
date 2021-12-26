package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		HttpSession session = request.getSession();
		ArrayList<Human> humanList = (ArrayList<Human>)session.getAttribute("list");
		
		HumanManager humanManager = new HumanManager();
		humanList = humanManager.getHumanList(humanList, name, age);

		session.setAttribute("list", humanList);
		
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");

		rd.forward(request, response);
			
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			HttpSession session = request.getSession();
			session.invalidate();

			RequestDispatcher rd = request.getRequestDispatcher("output.jsp");

			rd.forward(request, response);
		}

}
