package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Human;
import model.HumanManager;

/**
 * Servlet implementation class OnputServlet
 */
@WebServlet("/OutputServlet")
public class OutputServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HumanManager humanmanager = new HumanManager();
		
		ArrayList<Human> humanList = humanmanager.getHumanList();
		
		request.setAttribute("list", humanList);
		
		RequestDispatcher rd = request.getRequestDispatcher("listShow.jsp");
		
		rd.forward(request, response);
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		int iAge = Integer.parseInt(age);
		
		HumanManager hm = new HumanManager();
		
		hm.setHuman(name, iAge);
		
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		
		rd.forward(request, response);
		
	}

}
